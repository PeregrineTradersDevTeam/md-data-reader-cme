/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class SettlPriceTypeEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public SettlPriceTypeEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public SettlPriceTypeEncoder clear()
    {
        buffer.putByte(offset, (byte)(short)0);
        return this;
    }

    /**
     * 1=FinalDaily, 0=Preliminary
     *
     * @param value true if FinalDaily is set or false if not
     */
    public SettlPriceTypeEncoder finalDaily(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte finalDaily(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 0) : bits & ~(1 << 0));
    }

    /**
     * 1=Actual, 0=Theoretically Calculated
     *
     * @param value true if Actual is set or false if not
     */
    public SettlPriceTypeEncoder actual(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte actual(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 1) : bits & ~(1 << 1));
    }

    /**
     * 1=Rounded, 0=Non-Rounded or Undefined
     *
     * @param value true if Rounded is set or false if not
     */
    public SettlPriceTypeEncoder rounded(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte rounded(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 2) : bits & ~(1 << 2));
    }

    /**
     * 1=Intraday, 0=Undefined
     *
     * @param value true if Intraday is set or false if not
     */
    public SettlPriceTypeEncoder intraday(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte intraday(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 3) : bits & ~(1 << 3));
    }

    /**
     * Bits 4-6 are reserved
     *
     * @param value true if ReservedBits is set or false if not
     */
    public SettlPriceTypeEncoder reservedBits(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte reservedBits(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 4) : bits & ~(1 << 4));
    }

    /**
     * 1=Entire set is NULL, 0=not NULL
     *
     * @param value true if NullValue is set or false if not
     */
    public SettlPriceTypeEncoder nullValue(final boolean value)
    {
        byte bits = buffer.getByte(offset);
        bits = (byte)(value ? bits | (1 << 7) : bits & ~(1 << 7));
        buffer.putByte(offset, bits);
        return this;
    }

    public static byte nullValue(final byte bits, final boolean value)
    {
        return (byte)(value ? bits | (1 << 7) : bits & ~(1 << 7));
    }
}
