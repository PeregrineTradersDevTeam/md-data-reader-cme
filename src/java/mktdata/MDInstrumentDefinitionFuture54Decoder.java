/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

/**
 * MDInstrumentDefinitionFuture
 */
@SuppressWarnings("all")
public class MDInstrumentDefinitionFuture54Decoder
{
    public static final int BLOCK_LENGTH = 216;
    public static final int TEMPLATE_ID = 54;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MDInstrumentDefinitionFuture54Decoder parentMessage = this;
    private DirectBuffer buffer;
    protected int offset;
    protected int limit;
    protected int actingBlockLength;
    protected int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "d";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public MDInstrumentDefinitionFuture54Decoder wrap(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int matchEventIndicatorId()
    {
        return 5799;
    }

    public static int matchEventIndicatorSinceVersion()
    {
        return 0;
    }

    public static int matchEventIndicatorEncodingOffset()
    {
        return 0;
    }

    public static int matchEventIndicatorEncodingLength()
    {
        return 1;
    }

    public static String matchEventIndicatorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "MultipleCharValue";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final MatchEventIndicatorDecoder matchEventIndicator = new MatchEventIndicatorDecoder();

    /**
     * Bitmap field of eight Boolean type indicators reflecting the end of updates for a given Globex event
     *
     * @return MatchEventIndicatorDecoder : Bitmap field of eight Boolean type indicators reflecting the end of updates for a given Globex event
     */
    public MatchEventIndicatorDecoder matchEventIndicator()
    {
        matchEventIndicator.wrap(buffer, offset + 0);
        return matchEventIndicator;
    }

    public static int totNumReportsId()
    {
        return 911;
    }

    public static int totNumReportsSinceVersion()
    {
        return 0;
    }

    public static int totNumReportsEncodingOffset()
    {
        return 1;
    }

    public static int totNumReportsEncodingLength()
    {
        return 4;
    }

    public static String totNumReportsMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static long totNumReportsNullValue()
    {
        return 4294967295L;
    }

    public static long totNumReportsMinValue()
    {
        return 0L;
    }

    public static long totNumReportsMaxValue()
    {
        return 4294967294L;
    }

    public long totNumReports()
    {
        return (buffer.getInt(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int securityUpdateActionId()
    {
        return 980;
    }

    public static int securityUpdateActionSinceVersion()
    {
        return 0;
    }

    public static int securityUpdateActionEncodingOffset()
    {
        return 5;
    }

    public static int securityUpdateActionEncodingLength()
    {
        return 1;
    }

    public static String securityUpdateActionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "char";
            case PRESENCE: return "required";
        }

        return "";
    }

    public SecurityUpdateAction securityUpdateAction()
    {
        return SecurityUpdateAction.get(buffer.getByte(offset + 5));
    }


    public static int lastUpdateTimeId()
    {
        return 779;
    }

    public static int lastUpdateTimeSinceVersion()
    {
        return 0;
    }

    public static int lastUpdateTimeEncodingOffset()
    {
        return 6;
    }

    public static int lastUpdateTimeEncodingLength()
    {
        return 8;
    }

    public static String lastUpdateTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "UTCTimestamp";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static long lastUpdateTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lastUpdateTimeMinValue()
    {
        return 0x0L;
    }

    public static long lastUpdateTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long lastUpdateTime()
    {
        return buffer.getLong(offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int mDSecurityTradingStatusId()
    {
        return 1682;
    }

    public static int mDSecurityTradingStatusSinceVersion()
    {
        return 0;
    }

    public static int mDSecurityTradingStatusEncodingOffset()
    {
        return 14;
    }

    public static int mDSecurityTradingStatusEncodingLength()
    {
        return 1;
    }

    public static String mDSecurityTradingStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "required";
        }

        return "";
    }

    public SecurityTradingStatus mDSecurityTradingStatus()
    {
        return SecurityTradingStatus.get(((short)(buffer.getByte(offset + 14) & 0xFF)));
    }


    public static int applIDId()
    {
        return 1180;
    }

    public static int applIDSinceVersion()
    {
        return 0;
    }

    public static int applIDEncodingOffset()
    {
        return 15;
    }

    public static int applIDEncodingLength()
    {
        return 2;
    }

    public static String applIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static short applIDNullValue()
    {
        return (short)-32768;
    }

    public static short applIDMinValue()
    {
        return (short)-32767;
    }

    public static short applIDMaxValue()
    {
        return (short)32767;
    }

    public short applID()
    {
        return buffer.getShort(offset + 15, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int marketSegmentIDId()
    {
        return 1300;
    }

    public static int marketSegmentIDSinceVersion()
    {
        return 0;
    }

    public static int marketSegmentIDEncodingOffset()
    {
        return 17;
    }

    public static int marketSegmentIDEncodingLength()
    {
        return 1;
    }

    public static String marketSegmentIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static short marketSegmentIDNullValue()
    {
        return (short)255;
    }

    public static short marketSegmentIDMinValue()
    {
        return (short)0;
    }

    public static short marketSegmentIDMaxValue()
    {
        return (short)254;
    }

    public short marketSegmentID()
    {
        return ((short)(buffer.getByte(offset + 17) & 0xFF));
    }


    public static int underlyingProductId()
    {
        return 462;
    }

    public static int underlyingProductSinceVersion()
    {
        return 0;
    }

    public static int underlyingProductEncodingOffset()
    {
        return 18;
    }

    public static int underlyingProductEncodingLength()
    {
        return 1;
    }

    public static String underlyingProductMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static short underlyingProductNullValue()
    {
        return (short)255;
    }

    public static short underlyingProductMinValue()
    {
        return (short)0;
    }

    public static short underlyingProductMaxValue()
    {
        return (short)254;
    }

    public short underlyingProduct()
    {
        return ((short)(buffer.getByte(offset + 18) & 0xFF));
    }


    public static int securityExchangeId()
    {
        return 207;
    }

    public static int securityExchangeSinceVersion()
    {
        return 0;
    }

    public static int securityExchangeEncodingOffset()
    {
        return 19;
    }

    public static int securityExchangeEncodingLength()
    {
        return 4;
    }

    public static String securityExchangeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Exchange";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte securityExchangeNullValue()
    {
        return (byte)0;
    }

    public static byte securityExchangeMinValue()
    {
        return (byte)32;
    }

    public static byte securityExchangeMaxValue()
    {
        return (byte)126;
    }

    public static int securityExchangeLength()
    {
        return 4;
    }

    public byte securityExchange(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 19 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securityExchangeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSecurityExchange(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 19, dst, dstOffset, length);

        return length;
    }

    public String securityExchange()
    {
        final byte[] dst = new byte[4];
        buffer.getBytes(this.offset + 19, dst, 0, 4);

        int end = 0;
        for (; end < 4 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSecurityExchange(final Appendable value)
    {
        for (int i = 0; i < 4 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 19 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int securityGroupId()
    {
        return 1151;
    }

    public static int securityGroupSinceVersion()
    {
        return 0;
    }

    public static int securityGroupEncodingOffset()
    {
        return 23;
    }

    public static int securityGroupEncodingLength()
    {
        return 6;
    }

    public static String securityGroupMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte securityGroupNullValue()
    {
        return (byte)0;
    }

    public static byte securityGroupMinValue()
    {
        return (byte)32;
    }

    public static byte securityGroupMaxValue()
    {
        return (byte)126;
    }

    public static int securityGroupLength()
    {
        return 6;
    }

    public byte securityGroup(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 23 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securityGroupCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSecurityGroup(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 23, dst, dstOffset, length);

        return length;
    }

    public String securityGroup()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 23, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSecurityGroup(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 23 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int assetId()
    {
        return 6937;
    }

    public static int assetSinceVersion()
    {
        return 0;
    }

    public static int assetEncodingOffset()
    {
        return 29;
    }

    public static int assetEncodingLength()
    {
        return 6;
    }

    public static String assetMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte assetNullValue()
    {
        return (byte)0;
    }

    public static byte assetMinValue()
    {
        return (byte)32;
    }

    public static byte assetMaxValue()
    {
        return (byte)126;
    }

    public static int assetLength()
    {
        return 6;
    }

    public byte asset(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 29 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String assetCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getAsset(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 29, dst, dstOffset, length);

        return length;
    }

    public String asset()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 29, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getAsset(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 29 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int symbolId()
    {
        return 55;
    }

    public static int symbolSinceVersion()
    {
        return 0;
    }

    public static int symbolEncodingOffset()
    {
        return 35;
    }

    public static int symbolEncodingLength()
    {
        return 20;
    }

    public static String symbolMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte symbolNullValue()
    {
        return (byte)0;
    }

    public static byte symbolMinValue()
    {
        return (byte)32;
    }

    public static byte symbolMaxValue()
    {
        return (byte)126;
    }

    public static int symbolLength()
    {
        return 20;
    }

    public byte symbol(final int index)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 35 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String symbolCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSymbol(final byte[] dst, final int dstOffset)
    {
        final int length = 20;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 35, dst, dstOffset, length);

        return length;
    }

    public String symbol()
    {
        final byte[] dst = new byte[20];
        buffer.getBytes(this.offset + 35, dst, 0, 20);

        int end = 0;
        for (; end < 20 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSymbol(final Appendable value)
    {
        for (int i = 0; i < 20 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 35 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int securityIDId()
    {
        return 48;
    }

    public static int securityIDSinceVersion()
    {
        return 0;
    }

    public static int securityIDEncodingOffset()
    {
        return 55;
    }

    public static int securityIDEncodingLength()
    {
        return 4;
    }

    public static String securityIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static int securityIDNullValue()
    {
        return -2147483648;
    }

    public static int securityIDMinValue()
    {
        return -2147483647;
    }

    public static int securityIDMaxValue()
    {
        return 2147483647;
    }

    public int securityID()
    {
        return buffer.getInt(offset + 55, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int securityIDSourceId()
    {
        return 22;
    }

    public static int securityIDSourceSinceVersion()
    {
        return 0;
    }

    public static int securityIDSourceEncodingOffset()
    {
        return 59;
    }

    public static int securityIDSourceEncodingLength()
    {
        return 0;
    }

    public static String securityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "char";
            case PRESENCE: return "constant";
        }

        return "";
    }

    public static byte securityIDSourceNullValue()
    {
        return (byte)0;
    }

    public static byte securityIDSourceMinValue()
    {
        return (byte)32;
    }

    public static byte securityIDSourceMaxValue()
    {
        return (byte)126;
    }

    private static final byte[] SECURITYIDSOURCE_VALUE = { 56 };

    public static int securityIDSourceLength()
    {
        return 1;
    }

    public byte securityIDSource(final int index)
    {
        return SECURITYIDSOURCE_VALUE[index];
    }

    public int getSecurityIDSource(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(SECURITYIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

        return bytesCopied;
    }

    public byte securityIDSource()
    {
        return (byte)56;
    }


    public static int securityTypeId()
    {
        return 167;
    }

    public static int securityTypeSinceVersion()
    {
        return 0;
    }

    public static int securityTypeEncodingOffset()
    {
        return 59;
    }

    public static int securityTypeEncodingLength()
    {
        return 6;
    }

    public static String securityTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte securityTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securityTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securityTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securityTypeLength()
    {
        return 6;
    }

    public byte securityType(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 59 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String securityTypeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSecurityType(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 59, dst, dstOffset, length);

        return length;
    }

    public String securityType()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 59, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSecurityType(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 59 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int cFICodeId()
    {
        return 461;
    }

    public static int cFICodeSinceVersion()
    {
        return 0;
    }

    public static int cFICodeEncodingOffset()
    {
        return 65;
    }

    public static int cFICodeEncodingLength()
    {
        return 6;
    }

    public static String cFICodeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte cFICodeNullValue()
    {
        return (byte)0;
    }

    public static byte cFICodeMinValue()
    {
        return (byte)32;
    }

    public static byte cFICodeMaxValue()
    {
        return (byte)126;
    }

    public static int cFICodeLength()
    {
        return 6;
    }

    public byte cFICode(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 65 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String cFICodeCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getCFICode(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 65, dst, dstOffset, length);

        return length;
    }

    public String cFICode()
    {
        final byte[] dst = new byte[6];
        buffer.getBytes(this.offset + 65, dst, 0, 6);

        int end = 0;
        for (; end < 6 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCFICode(final Appendable value)
    {
        for (int i = 0; i < 6 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 65 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int maturityMonthYearId()
    {
        return 200;
    }

    public static int maturityMonthYearSinceVersion()
    {
        return 0;
    }

    public static int maturityMonthYearEncodingOffset()
    {
        return 71;
    }

    public static int maturityMonthYearEncodingLength()
    {
        return 5;
    }

    public static String maturityMonthYearMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "MonthYear";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final MaturityMonthYearDecoder maturityMonthYear = new MaturityMonthYearDecoder();

    /**
     * This field provides the actual calendar date for contract maturity
     *
     * @return MaturityMonthYearDecoder : This field provides the actual calendar date for contract maturity
     */
    public MaturityMonthYearDecoder maturityMonthYear()
    {
        maturityMonthYear.wrap(buffer, offset + 71);
        return maturityMonthYear;
    }

    public static int currencyId()
    {
        return 15;
    }

    public static int currencySinceVersion()
    {
        return 0;
    }

    public static int currencyEncodingOffset()
    {
        return 76;
    }

    public static int currencyEncodingLength()
    {
        return 3;
    }

    public static String currencyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Currency";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte currencyNullValue()
    {
        return (byte)0;
    }

    public static byte currencyMinValue()
    {
        return (byte)32;
    }

    public static byte currencyMaxValue()
    {
        return (byte)126;
    }

    public static int currencyLength()
    {
        return 3;
    }

    public byte currency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 76 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String currencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 76, dst, dstOffset, length);

        return length;
    }

    public String currency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 76, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 76 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int settlCurrencyId()
    {
        return 120;
    }

    public static int settlCurrencySinceVersion()
    {
        return 0;
    }

    public static int settlCurrencyEncodingOffset()
    {
        return 79;
    }

    public static int settlCurrencyEncodingLength()
    {
        return 3;
    }

    public static String settlCurrencyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Currency";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte settlCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte settlCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte settlCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int settlCurrencyLength()
    {
        return 3;
    }

    public byte settlCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 79 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String settlCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getSettlCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 79, dst, dstOffset, length);

        return length;
    }

    public String settlCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 79, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSettlCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 79 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int matchAlgorithmId()
    {
        return 1142;
    }

    public static int matchAlgorithmSinceVersion()
    {
        return 0;
    }

    public static int matchAlgorithmEncodingOffset()
    {
        return 82;
    }

    public static int matchAlgorithmEncodingLength()
    {
        return 1;
    }

    public static String matchAlgorithmMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "char";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte matchAlgorithmNullValue()
    {
        return (byte)0;
    }

    public static byte matchAlgorithmMinValue()
    {
        return (byte)32;
    }

    public static byte matchAlgorithmMaxValue()
    {
        return (byte)126;
    }

    public byte matchAlgorithm()
    {
        return buffer.getByte(offset + 82);
    }


    public static int minTradeVolId()
    {
        return 562;
    }

    public static int minTradeVolSinceVersion()
    {
        return 0;
    }

    public static int minTradeVolEncodingOffset()
    {
        return 83;
    }

    public static int minTradeVolEncodingLength()
    {
        return 4;
    }

    public static String minTradeVolMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static long minTradeVolNullValue()
    {
        return 4294967295L;
    }

    public static long minTradeVolMinValue()
    {
        return 0L;
    }

    public static long minTradeVolMaxValue()
    {
        return 4294967294L;
    }

    public long minTradeVol()
    {
        return (buffer.getInt(offset + 83, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int maxTradeVolId()
    {
        return 1140;
    }

    public static int maxTradeVolSinceVersion()
    {
        return 0;
    }

    public static int maxTradeVolEncodingOffset()
    {
        return 87;
    }

    public static int maxTradeVolEncodingLength()
    {
        return 4;
    }

    public static String maxTradeVolMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static long maxTradeVolNullValue()
    {
        return 4294967295L;
    }

    public static long maxTradeVolMinValue()
    {
        return 0L;
    }

    public static long maxTradeVolMaxValue()
    {
        return 4294967294L;
    }

    public long maxTradeVol()
    {
        return (buffer.getInt(offset + 87, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
    }


    public static int minPriceIncrementId()
    {
        return 969;
    }

    public static int minPriceIncrementSinceVersion()
    {
        return 0;
    }

    public static int minPriceIncrementEncodingOffset()
    {
        return 91;
    }

    public static int minPriceIncrementEncodingLength()
    {
        return 8;
    }

    public static String minPriceIncrementMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICE9Decoder minPriceIncrement = new PRICE9Decoder();

    /**
     * Minimum constant tick for the instrument, sent only if instrument is non-VTT (Variable Tick table) eligible
     *
     * @return PRICE9Decoder : Minimum constant tick for the instrument, sent only if instrument is non-VTT (Variable Tick table) eligible
     */
    public PRICE9Decoder minPriceIncrement()
    {
        minPriceIncrement.wrap(buffer, offset + 91);
        return minPriceIncrement;
    }

    public static int displayFactorId()
    {
        return 9787;
    }

    public static int displayFactorSinceVersion()
    {
        return 0;
    }

    public static int displayFactorEncodingOffset()
    {
        return 99;
    }

    public static int displayFactorEncodingLength()
    {
        return 8;
    }

    public static String displayFactorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "float";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final Decimal9Decoder displayFactor = new Decimal9Decoder();

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     *
     * @return Decimal9Decoder : Contains the multiplier to convert the CME Globex display price to the conventional price
     */
    public Decimal9Decoder displayFactor()
    {
        displayFactor.wrap(buffer, offset + 99);
        return displayFactor;
    }

    public static int mainFractionId()
    {
        return 37702;
    }

    public static int mainFractionSinceVersion()
    {
        return 0;
    }

    public static int mainFractionEncodingOffset()
    {
        return 107;
    }

    public static int mainFractionEncodingLength()
    {
        return 1;
    }

    public static String mainFractionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short mainFractionNullValue()
    {
        return (short)255;
    }

    public static short mainFractionMinValue()
    {
        return (short)0;
    }

    public static short mainFractionMaxValue()
    {
        return (short)254;
    }

    public short mainFraction()
    {
        return ((short)(buffer.getByte(offset + 107) & 0xFF));
    }


    public static int subFractionId()
    {
        return 37703;
    }

    public static int subFractionSinceVersion()
    {
        return 0;
    }

    public static int subFractionEncodingOffset()
    {
        return 108;
    }

    public static int subFractionEncodingLength()
    {
        return 1;
    }

    public static String subFractionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short subFractionNullValue()
    {
        return (short)255;
    }

    public static short subFractionMinValue()
    {
        return (short)0;
    }

    public static short subFractionMaxValue()
    {
        return (short)254;
    }

    public short subFraction()
    {
        return ((short)(buffer.getByte(offset + 108) & 0xFF));
    }


    public static int priceDisplayFormatId()
    {
        return 9800;
    }

    public static int priceDisplayFormatSinceVersion()
    {
        return 0;
    }

    public static int priceDisplayFormatEncodingOffset()
    {
        return 109;
    }

    public static int priceDisplayFormatEncodingLength()
    {
        return 1;
    }

    public static String priceDisplayFormatMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static short priceDisplayFormatNullValue()
    {
        return (short)255;
    }

    public static short priceDisplayFormatMinValue()
    {
        return (short)0;
    }

    public static short priceDisplayFormatMaxValue()
    {
        return (short)254;
    }

    public short priceDisplayFormat()
    {
        return ((short)(buffer.getByte(offset + 109) & 0xFF));
    }


    public static int unitOfMeasureId()
    {
        return 996;
    }

    public static int unitOfMeasureSinceVersion()
    {
        return 0;
    }

    public static int unitOfMeasureEncodingOffset()
    {
        return 110;
    }

    public static int unitOfMeasureEncodingLength()
    {
        return 30;
    }

    public static String unitOfMeasureMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "String";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte unitOfMeasureNullValue()
    {
        return (byte)0;
    }

    public static byte unitOfMeasureMinValue()
    {
        return (byte)32;
    }

    public static byte unitOfMeasureMaxValue()
    {
        return (byte)126;
    }

    public static int unitOfMeasureLength()
    {
        return 30;
    }

    public byte unitOfMeasure(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 110 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String unitOfMeasureCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getUnitOfMeasure(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 110, dst, dstOffset, length);

        return length;
    }

    public String unitOfMeasure()
    {
        final byte[] dst = new byte[30];
        buffer.getBytes(this.offset + 110, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnitOfMeasure(final Appendable value)
    {
        for (int i = 0; i < 30 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 110 + i) & 0xFF;
            if (c == 0)
            {
                break;
            }
            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException e)
            {
                throw new java.io.UncheckedIOException(e);
            }
        }
    }


    public static int unitOfMeasureQtyId()
    {
        return 1147;
    }

    public static int unitOfMeasureQtySinceVersion()
    {
        return 0;
    }

    public static int unitOfMeasureQtyEncodingOffset()
    {
        return 140;
    }

    public static int unitOfMeasureQtyEncodingLength()
    {
        return 8;
    }

    public static String unitOfMeasureQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final Decimal9NULLDecoder unitOfMeasureQty = new Decimal9NULLDecoder();

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     *
     * @return Decimal9NULLDecoder : This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     */
    public Decimal9NULLDecoder unitOfMeasureQty()
    {
        unitOfMeasureQty.wrap(buffer, offset + 140);
        return unitOfMeasureQty;
    }

    public static int tradingReferencePriceId()
    {
        return 1150;
    }

    public static int tradingReferencePriceSinceVersion()
    {
        return 0;
    }

    public static int tradingReferencePriceEncodingOffset()
    {
        return 148;
    }

    public static int tradingReferencePriceEncodingLength()
    {
        return 8;
    }

    public static String tradingReferencePriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICENULL9Decoder tradingReferencePrice = new PRICENULL9Decoder();

    /**
     * Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     *
     * @return PRICENULL9Decoder : Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.
     */
    public PRICENULL9Decoder tradingReferencePrice()
    {
        tradingReferencePrice.wrap(buffer, offset + 148);
        return tradingReferencePrice;
    }

    public static int settlPriceTypeId()
    {
        return 731;
    }

    public static int settlPriceTypeSinceVersion()
    {
        return 0;
    }

    public static int settlPriceTypeEncodingOffset()
    {
        return 156;
    }

    public static int settlPriceTypeEncodingLength()
    {
        return 1;
    }

    public static String settlPriceTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "MultipleCharValue";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final SettlPriceTypeDecoder settlPriceType = new SettlPriceTypeDecoder();

    /**
     * Bitmap field of eight Boolean type indicators representing settlement price type
     *
     * @return SettlPriceTypeDecoder : Bitmap field of eight Boolean type indicators representing settlement price type
     */
    public SettlPriceTypeDecoder settlPriceType()
    {
        settlPriceType.wrap(buffer, offset + 156);
        return settlPriceType;
    }

    public static int openInterestQtyId()
    {
        return 5792;
    }

    public static int openInterestQtySinceVersion()
    {
        return 0;
    }

    public static int openInterestQtyEncodingOffset()
    {
        return 157;
    }

    public static int openInterestQtyEncodingLength()
    {
        return 4;
    }

    public static String openInterestQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int openInterestQtyNullValue()
    {
        return 2147483647;
    }

    public static int openInterestQtyMinValue()
    {
        return -2147483647;
    }

    public static int openInterestQtyMaxValue()
    {
        return 2147483647;
    }

    public int openInterestQty()
    {
        return buffer.getInt(offset + 157, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int clearedVolumeId()
    {
        return 5791;
    }

    public static int clearedVolumeSinceVersion()
    {
        return 0;
    }

    public static int clearedVolumeEncodingOffset()
    {
        return 161;
    }

    public static int clearedVolumeEncodingLength()
    {
        return 4;
    }

    public static String clearedVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int clearedVolumeNullValue()
    {
        return 2147483647;
    }

    public static int clearedVolumeMinValue()
    {
        return -2147483647;
    }

    public static int clearedVolumeMaxValue()
    {
        return 2147483647;
    }

    public int clearedVolume()
    {
        return buffer.getInt(offset + 161, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int highLimitPriceId()
    {
        return 1149;
    }

    public static int highLimitPriceSinceVersion()
    {
        return 0;
    }

    public static int highLimitPriceEncodingOffset()
    {
        return 165;
    }

    public static int highLimitPriceEncodingLength()
    {
        return 8;
    }

    public static String highLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICENULL9Decoder highLimitPrice = new PRICENULL9Decoder();

    /**
     * Allowable high limit price for the trading day
     *
     * @return PRICENULL9Decoder : Allowable high limit price for the trading day
     */
    public PRICENULL9Decoder highLimitPrice()
    {
        highLimitPrice.wrap(buffer, offset + 165);
        return highLimitPrice;
    }

    public static int lowLimitPriceId()
    {
        return 1148;
    }

    public static int lowLimitPriceSinceVersion()
    {
        return 0;
    }

    public static int lowLimitPriceEncodingOffset()
    {
        return 173;
    }

    public static int lowLimitPriceEncodingLength()
    {
        return 8;
    }

    public static String lowLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICENULL9Decoder lowLimitPrice = new PRICENULL9Decoder();

    /**
     * Allowable low limit price for the trading day
     *
     * @return PRICENULL9Decoder : Allowable low limit price for the trading day
     */
    public PRICENULL9Decoder lowLimitPrice()
    {
        lowLimitPrice.wrap(buffer, offset + 173);
        return lowLimitPrice;
    }

    public static int maxPriceVariationId()
    {
        return 1143;
    }

    public static int maxPriceVariationSinceVersion()
    {
        return 0;
    }

    public static int maxPriceVariationEncodingOffset()
    {
        return 181;
    }

    public static int maxPriceVariationEncodingLength()
    {
        return 8;
    }

    public static String maxPriceVariationMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICENULL9Decoder maxPriceVariation = new PRICENULL9Decoder();

    /**
     * Differential value for price banding.
     *
     * @return PRICENULL9Decoder : Differential value for price banding.
     */
    public PRICENULL9Decoder maxPriceVariation()
    {
        maxPriceVariation.wrap(buffer, offset + 181);
        return maxPriceVariation;
    }

    public static int decayQuantityId()
    {
        return 5818;
    }

    public static int decayQuantitySinceVersion()
    {
        return 0;
    }

    public static int decayQuantityEncodingOffset()
    {
        return 189;
    }

    public static int decayQuantityEncodingLength()
    {
        return 4;
    }

    public static String decayQuantityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int decayQuantityNullValue()
    {
        return 2147483647;
    }

    public static int decayQuantityMinValue()
    {
        return -2147483647;
    }

    public static int decayQuantityMaxValue()
    {
        return 2147483647;
    }

    public int decayQuantity()
    {
        return buffer.getInt(offset + 189, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int decayStartDateId()
    {
        return 5819;
    }

    public static int decayStartDateSinceVersion()
    {
        return 0;
    }

    public static int decayStartDateEncodingOffset()
    {
        return 193;
    }

    public static int decayStartDateEncodingLength()
    {
        return 2;
    }

    public static String decayStartDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "LocalMktDate";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int decayStartDateNullValue()
    {
        return 65535;
    }

    public static int decayStartDateMinValue()
    {
        return 0;
    }

    public static int decayStartDateMaxValue()
    {
        return 65534;
    }

    public int decayStartDate()
    {
        return (buffer.getShort(offset + 193, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int originalContractSizeId()
    {
        return 5849;
    }

    public static int originalContractSizeSinceVersion()
    {
        return 0;
    }

    public static int originalContractSizeEncodingOffset()
    {
        return 195;
    }

    public static int originalContractSizeEncodingLength()
    {
        return 4;
    }

    public static String originalContractSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Qty";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int originalContractSizeNullValue()
    {
        return 2147483647;
    }

    public static int originalContractSizeMinValue()
    {
        return -2147483647;
    }

    public static int originalContractSizeMaxValue()
    {
        return 2147483647;
    }

    public int originalContractSize()
    {
        return buffer.getInt(offset + 195, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int contractMultiplierId()
    {
        return 231;
    }

    public static int contractMultiplierSinceVersion()
    {
        return 0;
    }

    public static int contractMultiplierEncodingOffset()
    {
        return 199;
    }

    public static int contractMultiplierEncodingLength()
    {
        return 4;
    }

    public static String contractMultiplierMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int contractMultiplierNullValue()
    {
        return 2147483647;
    }

    public static int contractMultiplierMinValue()
    {
        return -2147483647;
    }

    public static int contractMultiplierMaxValue()
    {
        return 2147483647;
    }

    public int contractMultiplier()
    {
        return buffer.getInt(offset + 199, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int contractMultiplierUnitId()
    {
        return 1435;
    }

    public static int contractMultiplierUnitSinceVersion()
    {
        return 0;
    }

    public static int contractMultiplierUnitEncodingOffset()
    {
        return 203;
    }

    public static int contractMultiplierUnitEncodingLength()
    {
        return 1;
    }

    public static String contractMultiplierUnitMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static byte contractMultiplierUnitNullValue()
    {
        return (byte)127;
    }

    public static byte contractMultiplierUnitMinValue()
    {
        return (byte)-127;
    }

    public static byte contractMultiplierUnitMaxValue()
    {
        return (byte)127;
    }

    public byte contractMultiplierUnit()
    {
        return buffer.getByte(offset + 203);
    }


    public static int flowScheduleTypeId()
    {
        return 1439;
    }

    public static int flowScheduleTypeSinceVersion()
    {
        return 0;
    }

    public static int flowScheduleTypeEncodingOffset()
    {
        return 204;
    }

    public static int flowScheduleTypeEncodingLength()
    {
        return 1;
    }

    public static String flowScheduleTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "int";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static byte flowScheduleTypeNullValue()
    {
        return (byte)127;
    }

    public static byte flowScheduleTypeMinValue()
    {
        return (byte)-127;
    }

    public static byte flowScheduleTypeMaxValue()
    {
        return (byte)127;
    }

    public byte flowScheduleType()
    {
        return buffer.getByte(offset + 204);
    }


    public static int minPriceIncrementAmountId()
    {
        return 1146;
    }

    public static int minPriceIncrementAmountSinceVersion()
    {
        return 0;
    }

    public static int minPriceIncrementAmountEncodingOffset()
    {
        return 205;
    }

    public static int minPriceIncrementAmountEncodingLength()
    {
        return 8;
    }

    public static String minPriceIncrementAmountMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "Price";
            case PRESENCE: return "required";
        }

        return "";
    }

    private final PRICENULL9Decoder minPriceIncrementAmount = new PRICENULL9Decoder();

    /**
     * Monetary value equivalent to the minimum price fluctuation
     *
     * @return PRICENULL9Decoder : Monetary value equivalent to the minimum price fluctuation
     */
    public PRICENULL9Decoder minPriceIncrementAmount()
    {
        minPriceIncrementAmount.wrap(buffer, offset + 205);
        return minPriceIncrementAmount;
    }

    public static int userDefinedInstrumentId()
    {
        return 9779;
    }

    public static int userDefinedInstrumentSinceVersion()
    {
        return 0;
    }

    public static int userDefinedInstrumentEncodingOffset()
    {
        return 213;
    }

    public static int userDefinedInstrumentEncodingLength()
    {
        return 1;
    }

    public static String userDefinedInstrumentMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "char";
            case PRESENCE: return "required";
        }

        return "";
    }

    public static byte userDefinedInstrumentNullValue()
    {
        return (byte)0;
    }

    public static byte userDefinedInstrumentMinValue()
    {
        return (byte)32;
    }

    public static byte userDefinedInstrumentMaxValue()
    {
        return (byte)126;
    }

    public byte userDefinedInstrument()
    {
        return buffer.getByte(offset + 213);
    }


    public static int tradingReferenceDateId()
    {
        return 5796;
    }

    public static int tradingReferenceDateSinceVersion()
    {
        return 0;
    }

    public static int tradingReferenceDateEncodingOffset()
    {
        return 214;
    }

    public static int tradingReferenceDateEncodingLength()
    {
        return 2;
    }

    public static String tradingReferenceDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "";
            case TIME_UNIT: return "";
            case SEMANTIC_TYPE: return "LocalMktDate";
            case PRESENCE: return "optional";
        }

        return "";
    }

    public static int tradingReferenceDateNullValue()
    {
        return 65535;
    }

    public static int tradingReferenceDateMinValue()
    {
        return 0;
    }

    public static int tradingReferenceDateMaxValue()
    {
        return 65534;
    }

    public int tradingReferenceDate()
    {
        return (buffer.getShort(offset + 214, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    private final NoEventsDecoder noEvents = new NoEventsDecoder(this);

    public static long noEventsDecoderId()
    {
        return 864;
    }

    public static int noEventsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of repeating EventType entries
     *
     * @return NoEventsDecoder : Number of repeating EventType entries
     */
    public NoEventsDecoder noEvents()
    {
        noEvents.wrap(buffer);
        return noEvents;
    }

    /**
     * Number of repeating EventType entries
     */
    public static class NoEventsDecoder
        implements Iterable<NoEventsDecoder>, java.util.Iterator<NoEventsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionFuture54Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoEventsDecoder(final MDInstrumentDefinitionFuture54Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }
            index = -1;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (int)(buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (int)((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 9;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoEventsDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public NoEventsDecoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int eventTypeId()
        {
            return 865;
        }

        public static int eventTypeSinceVersion()
        {
            return 0;
        }

        public static int eventTypeEncodingOffset()
        {
            return 0;
        }

        public static int eventTypeEncodingLength()
        {
            return 1;
        }

        public static String eventTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "int";
                case PRESENCE: return "required";
            }

            return "";
        }

        public EventType eventType()
        {
            return EventType.get(((short)(buffer.getByte(offset + 0) & 0xFF)));
        }


        public static int eventTimeId()
        {
            return 1145;
        }

        public static int eventTimeSinceVersion()
        {
            return 0;
        }

        public static int eventTimeEncodingOffset()
        {
            return 1;
        }

        public static int eventTimeEncodingLength()
        {
            return 8;
        }

        public static String eventTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "UTCTimestamp";
                case PRESENCE: return "required";
            }

            return "";
        }

        public static long eventTimeNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long eventTimeMinValue()
        {
            return 0x0L;
        }

        public static long eventTimeMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public long eventTime()
        {
            return buffer.getLong(offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='EventType', referencedName='null', description='Code to represent the type of event', id=865, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=BEGIN_ENUM, name='EventType', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            builder.append("eventType=");
            builder.append(eventType());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='EventTime', referencedName='null', description='Date and Time of instument Activation or Expiration event sent as number of nanoseconds since Unix epoch', id=1145, version=0, deprecated=0, encodedLength=8, offset=1, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='UTCTimestamp'}}
            //Token{signal=ENCODING, name='uInt64', referencedName='null', description='uInt64', id=-1, version=0, deprecated=0, encodedLength=8, offset=1, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='UTCTimestamp'}}
            builder.append("eventTime=");
            builder.append(eventTime());
            builder.append(')');
            return builder;
        }
    }

    private final NoMDFeedTypesDecoder noMDFeedTypes = new NoMDFeedTypesDecoder(this);

    public static long noMDFeedTypesDecoderId()
    {
        return 1141;
    }

    public static int noMDFeedTypesDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of repeating FeedType entries
     *
     * @return NoMDFeedTypesDecoder : Number of repeating FeedType entries
     */
    public NoMDFeedTypesDecoder noMDFeedTypes()
    {
        noMDFeedTypes.wrap(buffer);
        return noMDFeedTypes;
    }

    /**
     * Number of repeating FeedType entries
     */
    public static class NoMDFeedTypesDecoder
        implements Iterable<NoMDFeedTypesDecoder>, java.util.Iterator<NoMDFeedTypesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionFuture54Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoMDFeedTypesDecoder(final MDInstrumentDefinitionFuture54Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }
            index = -1;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (int)(buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (int)((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 4;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoMDFeedTypesDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public NoMDFeedTypesDecoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int mDFeedTypeId()
        {
            return 1022;
        }

        public static int mDFeedTypeSinceVersion()
        {
            return 0;
        }

        public static int mDFeedTypeEncodingOffset()
        {
            return 0;
        }

        public static int mDFeedTypeEncodingLength()
        {
            return 3;
        }

        public static String mDFeedTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "String";
                case PRESENCE: return "required";
            }

            return "";
        }

        public static byte mDFeedTypeNullValue()
        {
            return (byte)0;
        }

        public static byte mDFeedTypeMinValue()
        {
            return (byte)32;
        }

        public static byte mDFeedTypeMaxValue()
        {
            return (byte)126;
        }

        public static int mDFeedTypeLength()
        {
            return 3;
        }

        public byte mDFeedType(final int index)
        {
            if (index < 0 || index >= 3)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = this.offset + 0 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String mDFeedTypeCharacterEncoding()
        {
            return "US-ASCII";
        }

        public int getMDFeedType(final byte[] dst, final int dstOffset)
        {
            final int length = 3;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(this.offset + 0, dst, dstOffset, length);

            return length;
        }

        public String mDFeedType()
        {
            final byte[] dst = new byte[3];
            buffer.getBytes(this.offset + 0, dst, 0, 3);

            int end = 0;
            for (; end < 3 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public void getMDFeedType(final Appendable value)
        {
            for (int i = 0; i < 3 ; ++i)
            {
                final int c = buffer.getByte(this.offset + 0 + i) & 0xFF;
                if (c == 0)
                {
                    break;
                }
                try
                {
                    value.append(c > 127 ? '?' : (char)c);
                }
                catch (final java.io.IOException e)
                {
                    throw new java.io.UncheckedIOException(e);
                }
            }
        }


        public static int marketDepthId()
        {
            return 264;
        }

        public static int marketDepthSinceVersion()
        {
            return 0;
        }

        public static int marketDepthEncodingOffset()
        {
            return 3;
        }

        public static int marketDepthEncodingLength()
        {
            return 1;
        }

        public static String marketDepthMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "int";
                case PRESENCE: return "required";
            }

            return "";
        }

        public static byte marketDepthNullValue()
        {
            return (byte)-128;
        }

        public static byte marketDepthMinValue()
        {
            return (byte)-127;
        }

        public static byte marketDepthMaxValue()
        {
            return (byte)127;
        }

        public byte marketDepth()
        {
            return buffer.getByte(offset + 3);
        }



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='MDFeedType', referencedName='null', description='Describes a class of service for a given data feed. GBX- Real Book, GBI-Implied Book', id=1022, version=0, deprecated=0, encodedLength=3, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
            //Token{signal=ENCODING, name='MDFeedType', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=3, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
            builder.append("mDFeedType=");
            for (int i = 0; i < mDFeedTypeLength() && mDFeedType(i) > 0; i++)
            {
                builder.append((char)mDFeedType(i));
            }
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='MarketDepth', referencedName='null', description='Book depth', id=264, version=0, deprecated=0, encodedLength=1, offset=3, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='Int8', referencedName='null', description='int8', id=-1, version=0, deprecated=0, encodedLength=1, offset=3, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            builder.append("marketDepth=");
            builder.append(marketDepth());
            builder.append(')');
            return builder;
        }
    }

    private final NoInstAttribDecoder noInstAttrib = new NoInstAttribDecoder(this);

    public static long noInstAttribDecoderId()
    {
        return 870;
    }

    public static int noInstAttribDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of repeating InstrAttribType entries
     *
     * @return NoInstAttribDecoder : Number of repeating InstrAttribType entries
     */
    public NoInstAttribDecoder noInstAttrib()
    {
        noInstAttrib.wrap(buffer);
        return noInstAttrib;
    }

    /**
     * Number of repeating InstrAttribType entries
     */
    public static class NoInstAttribDecoder
        implements Iterable<NoInstAttribDecoder>, java.util.Iterator<NoInstAttribDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionFuture54Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoInstAttribDecoder(final MDInstrumentDefinitionFuture54Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }
            index = -1;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (int)(buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (int)((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 4;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoInstAttribDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public NoInstAttribDecoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int instAttribTypeId()
        {
            return 871;
        }

        public static int instAttribTypeSinceVersion()
        {
            return 0;
        }

        public static int instAttribTypeEncodingOffset()
        {
            return 0;
        }

        public static int instAttribTypeEncodingLength()
        {
            return 0;
        }

        public static String instAttribTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "int";
                case PRESENCE: return "constant";
            }

            return "";
        }

        public static byte instAttribTypeNullValue()
        {
            return (byte)-128;
        }

        public static byte instAttribTypeMinValue()
        {
            return (byte)-127;
        }

        public static byte instAttribTypeMaxValue()
        {
            return (byte)127;
        }

        public byte instAttribType()
        {
            return (byte)24;
        }

        public static int instAttribValueId()
        {
            return 872;
        }

        public static int instAttribValueSinceVersion()
        {
            return 0;
        }

        public static int instAttribValueEncodingOffset()
        {
            return 0;
        }

        public static int instAttribValueEncodingLength()
        {
            return 4;
        }

        public static String instAttribValueMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "MultipleCharValue";
                case PRESENCE: return "required";
            }

            return "";
        }

        private final InstAttribValueDecoder instAttribValue = new InstAttribValueDecoder();

        /**
         * Bitmap field of 32 Boolean type instrument eligibility flags
         *
         * @return InstAttribValueDecoder : Bitmap field of 32 Boolean type instrument eligibility flags
         */
        public InstAttribValueDecoder instAttribValue()
        {
            instAttribValue.wrap(buffer, offset + 0);
            return instAttribValue;
        }


        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='InstAttribType', referencedName='null', description='Instrument eligibility attributes', id=871, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=CONSTANT, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='InstAttribType', referencedName='null', description='Eligibility', id=-1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=24, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=BEGIN_FIELD, name='InstAttribValue', referencedName='null', description='Bitmap field of 32 Boolean type instrument eligibility flags', id=872, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=26, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
            //Token{signal=BEGIN_SET, name='InstAttribValue', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=24, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
            builder.append("instAttribValue=");
            builder.append(instAttribValue());
            builder.append(')');
            return builder;
        }
    }

    private final NoLotTypeRulesDecoder noLotTypeRules = new NoLotTypeRulesDecoder(this);

    public static long noLotTypeRulesDecoderId()
    {
        return 1234;
    }

    public static int noLotTypeRulesDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of entries
     *
     * @return NoLotTypeRulesDecoder : Number of entries
     */
    public NoLotTypeRulesDecoder noLotTypeRules()
    {
        noLotTypeRules.wrap(buffer);
        return noLotTypeRules;
    }

    /**
     * Number of entries
     */
    public static class NoLotTypeRulesDecoder
        implements Iterable<NoLotTypeRulesDecoder>, java.util.Iterator<NoLotTypeRulesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionFuture54Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoLotTypeRulesDecoder(final MDInstrumentDefinitionFuture54Decoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }
            index = -1;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (int)(buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (int)((short)(buffer.getByte(limit + 2) & 0xFF));
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 5;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoLotTypeRulesDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        public NoLotTypeRulesDecoder next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int lotTypeId()
        {
            return 1093;
        }

        public static int lotTypeSinceVersion()
        {
            return 0;
        }

        public static int lotTypeEncodingOffset()
        {
            return 0;
        }

        public static int lotTypeEncodingLength()
        {
            return 1;
        }

        public static String lotTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "int";
                case PRESENCE: return "required";
            }

            return "";
        }

        public static byte lotTypeNullValue()
        {
            return (byte)-128;
        }

        public static byte lotTypeMinValue()
        {
            return (byte)-127;
        }

        public static byte lotTypeMaxValue()
        {
            return (byte)127;
        }

        public byte lotType()
        {
            return buffer.getByte(offset + 0);
        }


        public static int minLotSizeId()
        {
            return 1231;
        }

        public static int minLotSizeSinceVersion()
        {
            return 0;
        }

        public static int minLotSizeEncodingOffset()
        {
            return 1;
        }

        public static int minLotSizeEncodingLength()
        {
            return 4;
        }

        public static String minLotSizeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "";
                case TIME_UNIT: return "";
                case SEMANTIC_TYPE: return "Qty";
                case PRESENCE: return "required";
            }

            return "";
        }

        private final DecimalQtyDecoder minLotSize = new DecimalQtyDecoder();

        /**
         * Minimum quantity accepted for order entry. If tag 1093-LotType=4, this value is the minimum quantity for order entry expressed in the applicable units, specified in tag 996-UnitOfMeasure, e.g. megawatts
         *
         * @return DecimalQtyDecoder : Minimum quantity accepted for order entry. If tag 1093-LotType=4, this value is the minimum quantity for order entry expressed in the applicable units, specified in tag 996-UnitOfMeasure, e.g. megawatts
         */
        public DecimalQtyDecoder minLotSize()
        {
            minLotSize.wrap(buffer, offset + 1);
            return minLotSize;
        }


        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='LotType', referencedName='null', description='This tag is required to interpret the value in tag 1231-MinLotSize', id=1093, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='Int8', referencedName='null', description='int8', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            builder.append("lotType=");
            builder.append(lotType());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='MinLotSize', referencedName='null', description='Minimum quantity accepted for order entry. If tag 1093-LotType=4, this value is the minimum quantity for order entry expressed in the applicable units, specified in tag 996-UnitOfMeasure, e.g. megawatts', id=1231, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
            //Token{signal=BEGIN_COMPOSITE, name='DecimalQty', referencedName='null', description='A number representing quantity', id=-1, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
            builder.append("minLotSize=");
            minLotSize().appendTo(builder);
            builder.append(')');
            return builder;
        }
    }


    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[MDInstrumentDefinitionFuture54](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        //Token{signal=BEGIN_FIELD, name='MatchEventIndicator', referencedName='null', description='Bitmap field of eight Boolean type indicators reflecting the end of updates for a given Globex event', id=5799, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        //Token{signal=BEGIN_SET, name='MatchEventIndicator', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=0, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        builder.append("matchEventIndicator=");
        builder.append(matchEventIndicator());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TotNumReports', referencedName='null', description='Total number of instruments in the Replay loop. Used on Replay Feed only ', id=911, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt32NULL', referencedName='null', description='uInt32 optional', id=-1, version=0, deprecated=0, encodedLength=4, offset=1, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=4294967295, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("totNumReports=");
        builder.append(totNumReports());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityUpdateAction', referencedName='null', description='Last Security update action on Incremental feed, 'D' or 'M' is used when a mid-week deletion or modification (i.e. extension) occurs', id=980, version=0, deprecated=0, encodedLength=1, offset=5, componentTokenCount=7, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=BEGIN_ENUM, name='SecurityUpdateAction', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=5, componentTokenCount=5, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        builder.append("securityUpdateAction=");
        builder.append(securityUpdateAction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LastUpdateTime', referencedName='null', description='Timestamp of when the instrument was last added, modified or deleted', id=779, version=0, deprecated=0, encodedLength=8, offset=6, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='UTCTimestamp'}}
        //Token{signal=ENCODING, name='uInt64', referencedName='null', description='uInt64', id=-1, version=0, deprecated=0, encodedLength=8, offset=6, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT64, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='UTCTimestamp'}}
        builder.append("lastUpdateTime=");
        builder.append(lastUpdateTime());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MDSecurityTradingStatus', referencedName='null', description='Identifies the current state of the instrument. In Security Definition message this tag is available in the Instrument Replay feed only ', id=1682, version=0, deprecated=0, encodedLength=1, offset=14, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=BEGIN_ENUM, name='SecurityTradingStatus', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=14, componentTokenCount=13, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("mDSecurityTradingStatus=");
        builder.append(mDSecurityTradingStatus());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ApplID', referencedName='null', description='The channel ID as defined in the XML Configuration file', id=1180, version=0, deprecated=0, encodedLength=2, offset=15, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int16', referencedName='null', description='int16', id=-1, version=0, deprecated=0, encodedLength=2, offset=15, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("applID=");
        builder.append(applID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MarketSegmentID', referencedName='null', description='Identifies the market segment, populated for all CME Globex instruments', id=1300, version=0, deprecated=0, encodedLength=1, offset=17, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8', referencedName='null', description='uInt8', id=-1, version=0, deprecated=0, encodedLength=1, offset=17, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("marketSegmentID=");
        builder.append(marketSegmentID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnderlyingProduct', referencedName='null', description='Product complex', id=462, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8', referencedName='null', description='uInt8', id=-1, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("underlyingProduct=");
        builder.append(underlyingProduct());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityExchange', referencedName='null', description='Exchange used to identify a security', id=207, version=0, deprecated=0, encodedLength=4, offset=19, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Exchange'}}
        //Token{signal=ENCODING, name='SecurityExchange', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=19, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Exchange'}}
        builder.append("securityExchange=");
        for (int i = 0; i < securityExchangeLength() && securityExchange(i) > 0; i++)
        {
            builder.append((char)securityExchange(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityGroup', referencedName='null', description='Security Group Code.', id=1151, version=0, deprecated=0, encodedLength=6, offset=23, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='SecurityGroup', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=23, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("securityGroup=");
        for (int i = 0; i < securityGroupLength() && securityGroup(i) > 0; i++)
        {
            builder.append((char)securityGroup(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Asset', referencedName='null', description='The underlying asset code also known as Product Code', id=6937, version=0, deprecated=0, encodedLength=6, offset=29, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='Asset', referencedName='null', description='Asset', id=-1, version=0, deprecated=0, encodedLength=6, offset=29, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("asset=");
        for (int i = 0; i < assetLength() && asset(i) > 0; i++)
        {
            builder.append((char)asset(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Symbol', referencedName='null', description='Instrument Name or Symbol ', id=55, version=0, deprecated=0, encodedLength=20, offset=35, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='Symbol', referencedName='null', description='Symbol', id=-1, version=0, deprecated=0, encodedLength=20, offset=35, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("symbol=");
        for (int i = 0; i < symbolLength() && symbol(i) > 0; i++)
        {
            builder.append((char)symbol(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityID', referencedName='null', description='Unique instrument ID', id=48, version=0, deprecated=0, encodedLength=4, offset=55, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int32', referencedName='null', description='int32', id=-1, version=0, deprecated=0, encodedLength=4, offset=55, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("securityID=");
        builder.append(securityID());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityIDSource', referencedName='null', description='Identifies class or source of tag 48-SecurityID value', id=22, version=0, deprecated=0, encodedLength=0, offset=59, componentTokenCount=3, encoding=Encoding{presence=CONSTANT, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=ENCODING, name='SecurityIDSource', referencedName='null', description='SecurityIDSource', id=-1, version=0, deprecated=0, encodedLength=0, offset=59, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=56, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=BEGIN_FIELD, name='SecurityType', referencedName='null', description='Security Type', id=167, version=0, deprecated=0, encodedLength=6, offset=59, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='SecurityType', referencedName='null', description='SecurityType', id=-1, version=0, deprecated=0, encodedLength=6, offset=59, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("securityType=");
        for (int i = 0; i < securityTypeLength() && securityType(i) > 0; i++)
        {
            builder.append((char)securityType(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='CFICode', referencedName='null', description='ISO standard instrument categorization code', id=461, version=0, deprecated=0, encodedLength=6, offset=65, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='CFICode', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=6, offset=65, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("cFICode=");
        for (int i = 0; i < cFICodeLength() && cFICode(i) > 0; i++)
        {
            builder.append((char)cFICode(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaturityMonthYear', referencedName='null', description='This field provides the actual calendar date for contract maturity', id=200, version=0, deprecated=0, encodedLength=5, offset=71, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MonthYear'}}
        //Token{signal=BEGIN_COMPOSITE, name='MaturityMonthYear', referencedName='null', description='Year, Month and Date', id=-1, version=0, deprecated=0, encodedLength=5, offset=71, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MonthYear'}}
        builder.append("maturityMonthYear=");
        maturityMonthYear().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Currency', referencedName='null', description='Identifies currency used for price', id=15, version=0, deprecated=0, encodedLength=3, offset=76, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Currency'}}
        //Token{signal=ENCODING, name='Currency', referencedName='null', description='Currency', id=-1, version=0, deprecated=0, encodedLength=3, offset=76, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Currency'}}
        builder.append("currency=");
        for (int i = 0; i < currencyLength() && currency(i) > 0; i++)
        {
            builder.append((char)currency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SettlCurrency', referencedName='null', description='Identifies currency used for settlement, if different from trading currency', id=120, version=0, deprecated=0, encodedLength=3, offset=79, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Currency'}}
        //Token{signal=ENCODING, name='Currency', referencedName='null', description='Currency', id=-1, version=0, deprecated=0, encodedLength=3, offset=79, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Currency'}}
        builder.append("settlCurrency=");
        for (int i = 0; i < settlCurrencyLength() && settlCurrency(i) > 0; i++)
        {
            builder.append((char)settlCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MatchAlgorithm', referencedName='null', description='Matching algorithm ', id=1142, version=0, deprecated=0, encodedLength=1, offset=82, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=ENCODING, name='CHAR', referencedName='null', description='char', id=-1, version=0, deprecated=0, encodedLength=1, offset=82, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
        builder.append("matchAlgorithm=");
        builder.append(matchAlgorithm());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinTradeVol', referencedName='null', description='The minimum trading volume for a security', id=562, version=0, deprecated=0, encodedLength=4, offset=83, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='uInt32', referencedName='null', description='uInt32', id=-1, version=0, deprecated=0, encodedLength=4, offset=83, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("minTradeVol=");
        builder.append(minTradeVol());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaxTradeVol', referencedName='null', description='The maximum trading volume for a security', id=1140, version=0, deprecated=0, encodedLength=4, offset=87, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='uInt32', referencedName='null', description='uInt32', id=-1, version=0, deprecated=0, encodedLength=4, offset=87, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("maxTradeVol=");
        builder.append(maxTradeVol());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinPriceIncrement', referencedName='null', description='Minimum constant tick for the instrument, sent only if instrument is non-VTT (Variable Tick table) eligible', id=969, version=0, deprecated=0, encodedLength=8, offset=91, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICE9', referencedName='null', description='Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=91, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("minPriceIncrement=");
        minPriceIncrement().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='DisplayFactor', referencedName='null', description='Contains the multiplier to convert the CME Globex display price to the conventional price', id=9787, version=0, deprecated=0, encodedLength=8, offset=99, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='float'}}
        //Token{signal=BEGIN_COMPOSITE, name='Decimal9', referencedName='null', description='Decimal with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=99, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='float'}}
        builder.append("displayFactor=");
        displayFactor().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MainFraction', referencedName='null', description='Price Denominator of Main Fraction', id=37702, version=0, deprecated=0, encodedLength=1, offset=107, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=107, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("mainFraction=");
        builder.append(mainFraction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SubFraction', referencedName='null', description='Price Denominator of Sub Fraction', id=37703, version=0, deprecated=0, encodedLength=1, offset=108, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=108, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("subFraction=");
        builder.append(subFraction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PriceDisplayFormat', referencedName='null', description='Number of decimals in fractional display price', id=9800, version=0, deprecated=0, encodedLength=1, offset=109, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=109, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("priceDisplayFormat=");
        builder.append(priceDisplayFormat());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnitOfMeasure', referencedName='null', description='Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex', id=996, version=0, deprecated=0, encodedLength=30, offset=110, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='UnitOfMeasure', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=30, offset=110, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("unitOfMeasure=");
        for (int i = 0; i < unitOfMeasureLength() && unitOfMeasure(i) > 0; i++)
        {
            builder.append((char)unitOfMeasure(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnitOfMeasureQty', referencedName='null', description='This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure', id=1147, version=0, deprecated=0, encodedLength=8, offset=140, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=BEGIN_COMPOSITE, name='Decimal9NULL', referencedName='null', description='Optional Decimal with constant exponent -9 ', id=-1, version=9, deprecated=0, encodedLength=8, offset=140, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("unitOfMeasureQty=");
        unitOfMeasureQty().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingReferencePrice', referencedName='null', description='Reference price for prelisted instruments or the last calculated Settlement whether it be Theoretical, Preliminary or a Final Settle of the session.', id=1150, version=0, deprecated=0, encodedLength=8, offset=148, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL9', referencedName='null', description='Optional Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=148, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("tradingReferencePrice=");
        tradingReferencePrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SettlPriceType', referencedName='null', description='Bitmap field of eight Boolean type indicators representing settlement price type', id=731, version=0, deprecated=0, encodedLength=1, offset=156, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        //Token{signal=BEGIN_SET, name='SettlPriceType', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=156, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        builder.append("settlPriceType=");
        builder.append(settlPriceType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenInterestQty', referencedName='null', description='The total open interest for the market at the close of the prior trading session.', id=5792, version=0, deprecated=0, encodedLength=4, offset=157, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=157, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("openInterestQty=");
        builder.append(openInterestQty());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ClearedVolume', referencedName='null', description='The total cleared volume of instrument traded during the prior trading session.', id=5791, version=0, deprecated=0, encodedLength=4, offset=161, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=161, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("clearedVolume=");
        builder.append(clearedVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HighLimitPrice', referencedName='null', description='Allowable high limit price for the trading day', id=1149, version=0, deprecated=0, encodedLength=8, offset=165, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL9', referencedName='null', description='Optional Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=165, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("highLimitPrice=");
        highLimitPrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LowLimitPrice', referencedName='null', description='Allowable low limit price for the trading day', id=1148, version=0, deprecated=0, encodedLength=8, offset=173, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL9', referencedName='null', description='Optional Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=173, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("lowLimitPrice=");
        lowLimitPrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaxPriceVariation', referencedName='null', description='Differential value for price banding.', id=1143, version=0, deprecated=0, encodedLength=8, offset=181, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL9', referencedName='null', description='Optional Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=181, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("maxPriceVariation=");
        maxPriceVariation().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='DecayQuantity', referencedName='null', description='Indicates the quantity that a contract will decay daily by once the decay start date is reached', id=5818, version=0, deprecated=0, encodedLength=4, offset=189, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=189, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("decayQuantity=");
        builder.append(decayQuantity());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='DecayStartDate', referencedName='null', description='Indicates the date at which a decaying contract will begin to decay', id=5819, version=0, deprecated=0, encodedLength=2, offset=193, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        //Token{signal=ENCODING, name='LocalMktDate', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=193, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        builder.append("decayStartDate=");
        builder.append(decayStartDate());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OriginalContractSize', referencedName='null', description='Fixed contract value assigned to each product', id=5849, version=0, deprecated=0, encodedLength=4, offset=195, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=195, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("originalContractSize=");
        builder.append(originalContractSize());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ContractMultiplier', referencedName='null', description='Number of deliverable units per instrument, e.g., peak days in maturity month or number of calendar days in maturity month', id=231, version=0, deprecated=0, encodedLength=4, offset=199, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=199, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("contractMultiplier=");
        builder.append(contractMultiplier());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ContractMultiplierUnit', referencedName='null', description='Indicates the type of multiplier being applied to the product. Optionally used in combination with tag 231-ContractMultiplier', id=1435, version=0, deprecated=0, encodedLength=1, offset=203, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int8NULL', referencedName='null', description='int8 optional', id=-1, version=0, deprecated=0, encodedLength=1, offset=203, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=127, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("contractMultiplierUnit=");
        builder.append(contractMultiplierUnit());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='FlowScheduleType', referencedName='null', description='The schedule according to which the electricity is delivered in a physical contract, or priced in a financial contract. Specifies whether the contract is defined according to the Easter Peak, Eastern Off-Peak, Western Peak or Western Off-Peak.', id=1439, version=0, deprecated=0, encodedLength=1, offset=204, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int8NULL', referencedName='null', description='int8 optional', id=-1, version=0, deprecated=0, encodedLength=1, offset=204, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=127, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("flowScheduleType=");
        builder.append(flowScheduleType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinPriceIncrementAmount', referencedName='null', description='Monetary value equivalent to the minimum price fluctuation', id=1146, version=0, deprecated=0, encodedLength=8, offset=205, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL9', referencedName='null', description='Optional Price with constant exponent -9', id=-1, version=9, deprecated=0, encodedLength=8, offset=205, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("minPriceIncrementAmount=");
        minPriceIncrementAmount().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UserDefinedInstrument', referencedName='null', description='User-defined instruments flag', id=9779, version=0, deprecated=0, encodedLength=1, offset=213, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=ENCODING, name='UserDefinedInstrument', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=213, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
        builder.append("userDefinedInstrument=");
        builder.append(userDefinedInstrument());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingReferenceDate', referencedName='null', description='Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice', id=5796, version=0, deprecated=0, encodedLength=2, offset=214, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        //Token{signal=ENCODING, name='LocalMktDate', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=214, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        builder.append("tradingReferenceDate=");
        builder.append(tradingReferenceDate());
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoEvents', referencedName='null', description='Number of repeating EventType entries', id=864, version=0, deprecated=0, encodedLength=9, offset=216, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noEvents=[");
        NoEventsDecoder noEvents = noEvents();
        if (noEvents.count() > 0)
        {
            while (noEvents.hasNext())
            {
                noEvents.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoMDFeedTypes', referencedName='null', description='Number of repeating FeedType entries', id=1141, version=0, deprecated=0, encodedLength=4, offset=-1, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noMDFeedTypes=[");
        NoMDFeedTypesDecoder noMDFeedTypes = noMDFeedTypes();
        if (noMDFeedTypes.count() > 0)
        {
            while (noMDFeedTypes.hasNext())
            {
                noMDFeedTypes.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoInstAttrib', referencedName='null', description='Number of repeating InstrAttribType entries', id=870, version=0, deprecated=0, encodedLength=4, offset=-1, componentTokenCount=35, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noInstAttrib=[");
        NoInstAttribDecoder noInstAttrib = noInstAttrib();
        if (noInstAttrib.count() > 0)
        {
            while (noInstAttrib.hasNext())
            {
                noInstAttrib.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoLotTypeRules', referencedName='null', description='Number of entries', id=1234, version=0, deprecated=0, encodedLength=5, offset=-1, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noLotTypeRules=[");
        NoLotTypeRulesDecoder noLotTypeRules = noLotTypeRules();
        if (noLotTypeRules.count() > 0)
        {
            while (noLotTypeRules.hasNext())
            {
                noLotTypeRules.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}
