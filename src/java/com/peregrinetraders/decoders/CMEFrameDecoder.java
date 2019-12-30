package com.peregrinetraders.decoders;

import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import org.agrona.concurrent.UnsafeBuffer;

import com.peregrinetraders.beans.BufferAndOffset;
import com.peregrinetraders.beans.PacketBuffer;

public class CMEFrameDecoder implements Function<PacketBuffer, Stream<BufferAndOffset>> {

	private short extractShort(UnsafeBuffer buffer, int offset) {
		return buffer.getShort(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}

	private int extractInt(UnsafeBuffer buffer, int offset) {
		return buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}

	private long extractLong(UnsafeBuffer buffer, int offset) {
		return buffer.getLong(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
	}

	private Stream<BufferAndOffset> decodeFrames(UnsafeBuffer buffer, int beginOffset, long marketTime, long packetTime) {
		int totalLength = buffer.capacity();
		int offset = beginOffset;
		Builder<BufferAndOffset> builder = Stream.builder();
		while (offset < totalLength) {
			short frameSize = extractShort(buffer, offset);
			if (frameSize <= 0) {
				throw new RuntimeException("Invalid frame size detected: either parsing code bug or file corruption, at " + offset + " of " + totalLength + ", giving " + frameSize);
			}
			if (offset + frameSize > totalLength) {
				Builder<BufferAndOffset> emptyBuilder = Stream.builder();
				return emptyBuilder.build(); // corrupted packet detected, discard everything
			}
			builder.add(new BufferAndOffset(buffer, offset + 2, packetTime, marketTime));
			offset += frameSize;
		}
		return builder.build();
	}
	
	@Override
	public Stream<BufferAndOffset> apply(PacketBuffer packetBuffer) {
		UnsafeBuffer buffer = packetBuffer.getBuffer();
		@SuppressWarnings("unused")
		int packetSequence = extractInt(buffer, 0);
		long marketTime = extractLong(buffer, 4);
		return decodeFrames(buffer, 12, marketTime, packetBuffer.getPacketTime());
	}

}
