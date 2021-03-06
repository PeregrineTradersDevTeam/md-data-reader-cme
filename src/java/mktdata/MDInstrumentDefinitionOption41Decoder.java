/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

/**
 * MDInstrumentDefinitionOption
 */
@SuppressWarnings("all")
public class MDInstrumentDefinitionOption41Decoder
{
    public static final int BLOCK_LENGTH = 213;
    public static final int TEMPLATE_ID = 41;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final MDInstrumentDefinitionOption41Decoder parentMessage = this;
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

    public MDInstrumentDefinitionOption41Decoder wrap(
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


    public static int putOrCallId()
    {
        return 201;
    }

    public static int putOrCallSinceVersion()
    {
        return 0;
    }

    public static int putOrCallEncodingOffset()
    {
        return 71;
    }

    public static int putOrCallEncodingLength()
    {
        return 1;
    }

    public static String putOrCallMetaAttribute(final MetaAttribute metaAttribute)
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

    public PutOrCall putOrCall()
    {
        return PutOrCall.get(((short)(buffer.getByte(offset + 71) & 0xFF)));
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
        return 72;
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
        maturityMonthYear.wrap(buffer, offset + 72);
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
        return 77;
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

        final int pos = this.offset + 77 + (index * 1);

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

        buffer.getBytes(this.offset + 77, dst, dstOffset, length);

        return length;
    }

    public String currency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 77, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 77 + i) & 0xFF;
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


    public static int strikePriceId()
    {
        return 202;
    }

    public static int strikePriceSinceVersion()
    {
        return 0;
    }

    public static int strikePriceEncodingOffset()
    {
        return 80;
    }

    public static int strikePriceEncodingLength()
    {
        return 8;
    }

    public static String strikePriceMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICENULLDecoder strikePrice = new PRICENULLDecoder();

    /**
     * Strike Price for an option instrument
     *
     * @return PRICENULLDecoder : Strike Price for an option instrument
     */
    public PRICENULLDecoder strikePrice()
    {
        strikePrice.wrap(buffer, offset + 80);
        return strikePrice;
    }

    public static int strikeCurrencyId()
    {
        return 947;
    }

    public static int strikeCurrencySinceVersion()
    {
        return 0;
    }

    public static int strikeCurrencyEncodingOffset()
    {
        return 88;
    }

    public static int strikeCurrencyEncodingLength()
    {
        return 3;
    }

    public static String strikeCurrencyMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte strikeCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte strikeCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte strikeCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int strikeCurrencyLength()
    {
        return 3;
    }

    public byte strikeCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 88 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String strikeCurrencyCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getStrikeCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 88, dst, dstOffset, length);

        return length;
    }

    public String strikeCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 88, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getStrikeCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 88 + i) & 0xFF;
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
        return 91;
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

        final int pos = this.offset + 91 + (index * 1);

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

        buffer.getBytes(this.offset + 91, dst, dstOffset, length);

        return length;
    }

    public String settlCurrency()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(this.offset + 91, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getSettlCurrency(final Appendable value)
    {
        for (int i = 0; i < 3 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 91 + i) & 0xFF;
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


    public static int minCabPriceId()
    {
        return 9850;
    }

    public static int minCabPriceSinceVersion()
    {
        return 0;
    }

    public static int minCabPriceEncodingOffset()
    {
        return 94;
    }

    public static int minCabPriceEncodingLength()
    {
        return 8;
    }

    public static String minCabPriceMetaAttribute(final MetaAttribute metaAttribute)
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

    private final PRICENULLDecoder minCabPrice = new PRICENULLDecoder();

    /**
     * Defines cabinet price for outright options products
     *
     * @return PRICENULLDecoder : Defines cabinet price for outright options products
     */
    public PRICENULLDecoder minCabPrice()
    {
        minCabPrice.wrap(buffer, offset + 94);
        return minCabPrice;
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
        return 102;
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
        return buffer.getByte(offset + 102);
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
        return 103;
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
        return (buffer.getInt(offset + 103, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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
        return 107;
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
        return (buffer.getInt(offset + 107, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF_FFFFL);
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
        return 111;
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

    private final PRICENULLDecoder minPriceIncrement = new PRICENULLDecoder();

    /**
     * Minimum constant tick for the instrument
     *
     * @return PRICENULLDecoder : Minimum constant tick for the instrument
     */
    public PRICENULLDecoder minPriceIncrement()
    {
        minPriceIncrement.wrap(buffer, offset + 111);
        return minPriceIncrement;
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
        return 119;
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

    private final PRICENULLDecoder minPriceIncrementAmount = new PRICENULLDecoder();

    /**
     * Monetary value equivalent to the minimum price fluctuation
     *
     * @return PRICENULLDecoder : Monetary value equivalent to the minimum price fluctuation
     */
    public PRICENULLDecoder minPriceIncrementAmount()
    {
        minPriceIncrementAmount.wrap(buffer, offset + 119);
        return minPriceIncrementAmount;
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
        return 127;
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

    private final FLOATDecoder displayFactor = new FLOATDecoder();

    /**
     * Contains the multiplier to convert the CME Globex display price to the conventional price
     *
     * @return FLOATDecoder : Contains the multiplier to convert the CME Globex display price to the conventional price
     */
    public FLOATDecoder displayFactor()
    {
        displayFactor.wrap(buffer, offset + 127);
        return displayFactor;
    }

    public static int tickRuleId()
    {
        return 6350;
    }

    public static int tickRuleSinceVersion()
    {
        return 0;
    }

    public static int tickRuleEncodingOffset()
    {
        return 135;
    }

    public static int tickRuleEncodingLength()
    {
        return 1;
    }

    public static String tickRuleMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte tickRuleNullValue()
    {
        return (byte)127;
    }

    public static byte tickRuleMinValue()
    {
        return (byte)-127;
    }

    public static byte tickRuleMaxValue()
    {
        return (byte)127;
    }

    public byte tickRule()
    {
        return buffer.getByte(offset + 135);
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
        return 136;
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
        return ((short)(buffer.getByte(offset + 136) & 0xFF));
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
        return 137;
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
        return ((short)(buffer.getByte(offset + 137) & 0xFF));
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
        return 138;
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
        return ((short)(buffer.getByte(offset + 138) & 0xFF));
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
        return 139;
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

        final int pos = this.offset + 139 + (index * 1);

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

        buffer.getBytes(this.offset + 139, dst, dstOffset, length);

        return length;
    }

    public String unitOfMeasure()
    {
        final byte[] dst = new byte[30];
        buffer.getBytes(this.offset + 139, dst, 0, 30);

        int end = 0;
        for (; end < 30 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getUnitOfMeasure(final Appendable value)
    {
        for (int i = 0; i < 30 ; ++i)
        {
            final int c = buffer.getByte(this.offset + 139 + i) & 0xFF;
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
        return 169;
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

    private final PRICENULLDecoder unitOfMeasureQty = new PRICENULLDecoder();

    /**
     * This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     *
     * @return PRICENULLDecoder : This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure
     */
    public PRICENULLDecoder unitOfMeasureQty()
    {
        unitOfMeasureQty.wrap(buffer, offset + 169);
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
        return 177;
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

    private final PRICENULLDecoder tradingReferencePrice = new PRICENULLDecoder();

    /**
     * Reference price - the most recently available Settlement whether it be Theoretical, Preliminary or a Final Settle of the session
     *
     * @return PRICENULLDecoder : Reference price - the most recently available Settlement whether it be Theoretical, Preliminary or a Final Settle of the session
     */
    public PRICENULLDecoder tradingReferencePrice()
    {
        tradingReferencePrice.wrap(buffer, offset + 177);
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
        return 185;
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
        settlPriceType.wrap(buffer, offset + 185);
        return settlPriceType;
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
        return 186;
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
        return buffer.getInt(offset + 186, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return 190;
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
        return buffer.getInt(offset + 190, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return 194;
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

    private final PRICENULLDecoder lowLimitPrice = new PRICENULLDecoder();

    /**
     * Allowable low limit price for the trading day 
     *
     * @return PRICENULLDecoder : Allowable low limit price for the trading day 
     */
    public PRICENULLDecoder lowLimitPrice()
    {
        lowLimitPrice.wrap(buffer, offset + 194);
        return lowLimitPrice;
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
        return 202;
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

    private final PRICENULLDecoder highLimitPrice = new PRICENULLDecoder();

    /**
     * Allowable high limit price for the trading day
     *
     * @return PRICENULLDecoder : Allowable high limit price for the trading day
     */
    public PRICENULLDecoder highLimitPrice()
    {
        highLimitPrice.wrap(buffer, offset + 202);
        return highLimitPrice;
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
        return 210;
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
        return buffer.getByte(offset + 210);
    }


    public static int tradingReferenceDateId()
    {
        return 5796;
    }

    public static int tradingReferenceDateSinceVersion()
    {
        return 6;
    }

    public static int tradingReferenceDateEncodingOffset()
    {
        return 211;
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
        if (parentMessage.actingVersion < 6)
        {
            return 65535;
        }

        return (buffer.getShort(offset + 211, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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
     * Number of EventType entries
     *
     * @return NoEventsDecoder : Number of EventType entries
     */
    public NoEventsDecoder noEvents()
    {
        noEvents.wrap(buffer);
        return noEvents;
    }

    /**
     * Number of EventType entries
     */
    public static class NoEventsDecoder
        implements Iterable<NoEventsDecoder>, java.util.Iterator<NoEventsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoEventsDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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
     * Number of FeedType entries
     *
     * @return NoMDFeedTypesDecoder : Number of FeedType entries
     */
    public NoMDFeedTypesDecoder noMDFeedTypes()
    {
        noMDFeedTypes.wrap(buffer);
        return noMDFeedTypes;
    }

    /**
     * Number of FeedType entries
     */
    public static class NoMDFeedTypesDecoder
        implements Iterable<NoMDFeedTypesDecoder>, java.util.Iterator<NoMDFeedTypesDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoMDFeedTypesDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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
     * Number of InstrAttribType entries
     *
     * @return NoInstAttribDecoder : Number of InstrAttribType entries
     */
    public NoInstAttribDecoder noInstAttrib()
    {
        noInstAttrib.wrap(buffer);
        return noInstAttrib;
    }

    /**
     * Number of InstrAttribType entries
     */
    public static class NoInstAttribDecoder
        implements Iterable<NoInstAttribDecoder>, java.util.Iterator<NoInstAttribDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoInstAttribDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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
         * Bitmap field of 32 Boolean type Instrument eligibility flags
         *
         * @return InstAttribValueDecoder : Bitmap field of 32 Boolean type Instrument eligibility flags
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
            //Token{signal=BEGIN_FIELD, name='InstAttribType', referencedName='null', description='Instrument Eligibility Attributes', id=871, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=3, encoding=Encoding{presence=CONSTANT, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='InstAttribType', referencedName='null', description='Eligibility', id=-1, version=0, deprecated=0, encodedLength=0, offset=0, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=24, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=BEGIN_FIELD, name='InstAttribValue', referencedName='null', description='Bitmap field of 32 Boolean type Instrument eligibility flags', id=872, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=26, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
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
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoLotTypeRulesDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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

    private final NoUnderlyingsDecoder noUnderlyings = new NoUnderlyingsDecoder(this);

    public static long noUnderlyingsDecoderId()
    {
        return 711;
    }

    public static int noUnderlyingsDecoderSinceVersion()
    {
        return 0;
    }

    /**
     * Number of underlying instruments
     *
     * @return NoUnderlyingsDecoder : Number of underlying instruments
     */
    public NoUnderlyingsDecoder noUnderlyings()
    {
        noUnderlyings.wrap(buffer);
        return noUnderlyings;
    }

    /**
     * Number of underlying instruments
     */
    public static class NoUnderlyingsDecoder
        implements Iterable<NoUnderlyingsDecoder>, java.util.Iterator<NoUnderlyingsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoUnderlyingsDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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
            return 24;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoUnderlyingsDecoder> iterator()
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

        public NoUnderlyingsDecoder next()
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

        public static int underlyingSecurityIDId()
        {
            return 309;
        }

        public static int underlyingSecurityIDSinceVersion()
        {
            return 0;
        }

        public static int underlyingSecurityIDEncodingOffset()
        {
            return 0;
        }

        public static int underlyingSecurityIDEncodingLength()
        {
            return 4;
        }

        public static String underlyingSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int underlyingSecurityIDNullValue()
        {
            return -2147483648;
        }

        public static int underlyingSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int underlyingSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public int underlyingSecurityID()
        {
            return buffer.getInt(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int underlyingSecurityIDSourceId()
        {
            return 305;
        }

        public static int underlyingSecurityIDSourceSinceVersion()
        {
            return 0;
        }

        public static int underlyingSecurityIDSourceEncodingOffset()
        {
            return 4;
        }

        public static int underlyingSecurityIDSourceEncodingLength()
        {
            return 0;
        }

        public static String underlyingSecurityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte underlyingSecurityIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte underlyingSecurityIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte underlyingSecurityIDSourceMaxValue()
        {
            return (byte)126;
        }

        private static final byte[] UNDERLYINGSECURITYIDSOURCE_VALUE = { 56 };

        public static int underlyingSecurityIDSourceLength()
        {
            return 1;
        }

        public byte underlyingSecurityIDSource(final int index)
        {
            return UNDERLYINGSECURITYIDSOURCE_VALUE[index];
        }

        public int getUnderlyingSecurityIDSource(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(UNDERLYINGSECURITYIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

            return bytesCopied;
        }

        public byte underlyingSecurityIDSource()
        {
            return (byte)56;
        }


        public static int underlyingSymbolId()
        {
            return 311;
        }

        public static int underlyingSymbolSinceVersion()
        {
            return 0;
        }

        public static int underlyingSymbolEncodingOffset()
        {
            return 4;
        }

        public static int underlyingSymbolEncodingLength()
        {
            return 20;
        }

        public static String underlyingSymbolMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte underlyingSymbolNullValue()
        {
            return (byte)0;
        }

        public static byte underlyingSymbolMinValue()
        {
            return (byte)32;
        }

        public static byte underlyingSymbolMaxValue()
        {
            return (byte)126;
        }

        public static int underlyingSymbolLength()
        {
            return 20;
        }

        public byte underlyingSymbol(final int index)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = this.offset + 4 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String underlyingSymbolCharacterEncoding()
        {
            return "US-ASCII";
        }

        public int getUnderlyingSymbol(final byte[] dst, final int dstOffset)
        {
            final int length = 20;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(this.offset + 4, dst, dstOffset, length);

            return length;
        }

        public String underlyingSymbol()
        {
            final byte[] dst = new byte[20];
            buffer.getBytes(this.offset + 4, dst, 0, 20);

            int end = 0;
            for (; end < 20 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public void getUnderlyingSymbol(final Appendable value)
        {
            for (int i = 0; i < 20 ; ++i)
            {
                final int c = buffer.getByte(this.offset + 4 + i) & 0xFF;
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



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='UnderlyingSecurityID', referencedName='null', description='Unique Instrument ID as qualified by the exchange per tag 305-UnderlyingSecurityIDSource', id=309, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='Int32', referencedName='null', description='int32', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            builder.append("underlyingSecurityID=");
            builder.append(underlyingSecurityID());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='UnderlyingSecurityIDSource', referencedName='null', description='This value is always '8' for CME', id=305, version=0, deprecated=0, encodedLength=0, offset=4, componentTokenCount=3, encoding=Encoding{presence=CONSTANT, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
            //Token{signal=ENCODING, name='SecurityIDSource', referencedName='null', description='SecurityIDSource', id=-1, version=0, deprecated=0, encodedLength=0, offset=4, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=56, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
            //Token{signal=BEGIN_FIELD, name='UnderlyingSymbol', referencedName='null', description='Underlying Instrument Symbol (Contract Name)', id=311, version=0, deprecated=0, encodedLength=20, offset=4, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
            //Token{signal=ENCODING, name='UnderlyingSymbol', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=20, offset=4, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
            builder.append("underlyingSymbol=");
            for (int i = 0; i < underlyingSymbolLength() && underlyingSymbol(i) > 0; i++)
            {
                builder.append((char)underlyingSymbol(i));
            }
            builder.append(')');
            return builder;
        }
    }

    private final NoRelatedInstrumentsDecoder noRelatedInstruments = new NoRelatedInstrumentsDecoder(this);

    public static long noRelatedInstrumentsDecoderId()
    {
        return 1647;
    }

    public static int noRelatedInstrumentsDecoderSinceVersion()
    {
        return 7;
    }

    /**
     * Number of related instruments group
     *
     * @return NoRelatedInstrumentsDecoder : Number of related instruments group
     */
    public NoRelatedInstrumentsDecoder noRelatedInstruments()
    {
        if (parentMessage.actingVersion < 7)
        {
            noRelatedInstruments.count = 0;
            noRelatedInstruments.index = -1;
            return noRelatedInstruments;
        }

        noRelatedInstruments.wrap(buffer);
        return noRelatedInstruments;
    }

    /**
     * Number of related instruments group
     */
    public static class NoRelatedInstrumentsDecoder
        implements Iterable<NoRelatedInstrumentsDecoder>, java.util.Iterator<NoRelatedInstrumentsDecoder>
    {
        public static final int HEADER_SIZE = 3;
        private final MDInstrumentDefinitionOption41Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        NoRelatedInstrumentsDecoder(final MDInstrumentDefinitionOption41Decoder parentMessage)
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
            return 24;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<NoRelatedInstrumentsDecoder> iterator()
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

        public NoRelatedInstrumentsDecoder next()
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

        public static int relatedSecurityIDId()
        {
            return 1650;
        }

        public static int relatedSecurityIDSinceVersion()
        {
            return 0;
        }

        public static int relatedSecurityIDEncodingOffset()
        {
            return 0;
        }

        public static int relatedSecurityIDEncodingLength()
        {
            return 4;
        }

        public static String relatedSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
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

        public static int relatedSecurityIDNullValue()
        {
            return -2147483648;
        }

        public static int relatedSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int relatedSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public int relatedSecurityID()
        {
            return buffer.getInt(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
        }


        public static int relatedSecurityIDSourceId()
        {
            return 1651;
        }

        public static int relatedSecurityIDSourceSinceVersion()
        {
            return 0;
        }

        public static int relatedSecurityIDSourceEncodingOffset()
        {
            return 4;
        }

        public static int relatedSecurityIDSourceEncodingLength()
        {
            return 0;
        }

        public static String relatedSecurityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte relatedSecurityIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte relatedSecurityIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte relatedSecurityIDSourceMaxValue()
        {
            return (byte)126;
        }

        private static final byte[] RELATEDSECURITYIDSOURCE_VALUE = { 56 };

        public static int relatedSecurityIDSourceLength()
        {
            return 1;
        }

        public byte relatedSecurityIDSource(final int index)
        {
            return RELATEDSECURITYIDSOURCE_VALUE[index];
        }

        public int getRelatedSecurityIDSource(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(RELATEDSECURITYIDSOURCE_VALUE, 0, dst, offset, bytesCopied);

            return bytesCopied;
        }

        public byte relatedSecurityIDSource()
        {
            return (byte)56;
        }


        public static int relatedSymbolId()
        {
            return 1649;
        }

        public static int relatedSymbolSinceVersion()
        {
            return 0;
        }

        public static int relatedSymbolEncodingOffset()
        {
            return 4;
        }

        public static int relatedSymbolEncodingLength()
        {
            return 20;
        }

        public static String relatedSymbolMetaAttribute(final MetaAttribute metaAttribute)
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

        public static byte relatedSymbolNullValue()
        {
            return (byte)0;
        }

        public static byte relatedSymbolMinValue()
        {
            return (byte)32;
        }

        public static byte relatedSymbolMaxValue()
        {
            return (byte)126;
        }

        public static int relatedSymbolLength()
        {
            return 20;
        }

        public byte relatedSymbol(final int index)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            final int pos = this.offset + 4 + (index * 1);

            return buffer.getByte(pos);
        }


        public static String relatedSymbolCharacterEncoding()
        {
            return "US-ASCII";
        }

        public int getRelatedSymbol(final byte[] dst, final int dstOffset)
        {
            final int length = 20;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
            }

            buffer.getBytes(this.offset + 4, dst, dstOffset, length);

            return length;
        }

        public String relatedSymbol()
        {
            final byte[] dst = new byte[20];
            buffer.getBytes(this.offset + 4, dst, 0, 20);

            int end = 0;
            for (; end < 20 && dst[end] != 0; ++end);

            return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
        }


        public void getRelatedSymbol(final Appendable value)
        {
            for (int i = 0; i < 20 ; ++i)
            {
                final int c = buffer.getByte(this.offset + 4 + i) & 0xFF;
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



        public String toString()
        {
            return appendTo(new StringBuilder(100)).toString();
        }

        public StringBuilder appendTo(final StringBuilder builder)
        {
            builder.append('(');
            //Token{signal=BEGIN_FIELD, name='RelatedSecurityID', referencedName='null', description='Related Security ID', id=1650, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            //Token{signal=ENCODING, name='Int32', referencedName='null', description='int32', id=-1, version=0, deprecated=0, encodedLength=4, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
            builder.append("relatedSecurityID=");
            builder.append(relatedSecurityID());
            builder.append('|');
            //Token{signal=BEGIN_FIELD, name='RelatedSecurityIDSource', referencedName='null', description='Related Security ID source', id=1651, version=0, deprecated=0, encodedLength=0, offset=4, componentTokenCount=3, encoding=Encoding{presence=CONSTANT, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
            //Token{signal=ENCODING, name='SecurityIDSource', referencedName='null', description='SecurityIDSource', id=-1, version=0, deprecated=0, encodedLength=0, offset=4, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=56, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
            //Token{signal=BEGIN_FIELD, name='RelatedSymbol', referencedName='null', description='Related instrument Symbol', id=1649, version=0, deprecated=0, encodedLength=20, offset=4, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
            //Token{signal=ENCODING, name='Symbol', referencedName='null', description='Symbol', id=-1, version=0, deprecated=0, encodedLength=20, offset=4, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
            builder.append("relatedSymbol=");
            for (int i = 0; i < relatedSymbolLength() && relatedSymbol(i) > 0; i++)
            {
                builder.append((char)relatedSymbol(i));
            }
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
        builder.append("[MDInstrumentDefinitionOption41](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='MDSecurityTradingStatus', referencedName='null', description='Identifies the current state of the instrument. The data is available in the Instrument Replay feed only ', id=1682, version=0, deprecated=0, encodedLength=1, offset=14, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
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
        //Token{signal=BEGIN_FIELD, name='UnderlyingProduct', referencedName='null', description='Indicates the product complex', id=462, version=0, deprecated=0, encodedLength=1, offset=18, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
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
        //Token{signal=BEGIN_FIELD, name='SecurityGroup', referencedName='null', description='Security Group Code ', id=1151, version=0, deprecated=0, encodedLength=6, offset=23, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
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
        //Token{signal=BEGIN_FIELD, name='Symbol', referencedName='null', description='Instrument Name or Symbol. Previously used as Instrument Group Code ', id=55, version=0, deprecated=0, encodedLength=20, offset=35, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='Symbol', referencedName='null', description='Symbol', id=-1, version=0, deprecated=0, encodedLength=20, offset=35, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("symbol=");
        for (int i = 0; i < symbolLength() && symbol(i) > 0; i++)
        {
            builder.append((char)symbol(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SecurityID', referencedName='null', description='Unique Instrument ID', id=48, version=0, deprecated=0, encodedLength=4, offset=55, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
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
        //Token{signal=BEGIN_FIELD, name='PutOrCall', referencedName='null', description='Indicates whether an option instrument is a put or call', id=201, version=0, deprecated=0, encodedLength=1, offset=71, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=BEGIN_ENUM, name='PutOrCall', referencedName='null', description='null', id=-1, version=3, deprecated=0, encodedLength=1, offset=71, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("putOrCall=");
        builder.append(putOrCall());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaturityMonthYear', referencedName='null', description='This field provides the actual calendar date for contract maturity', id=200, version=0, deprecated=0, encodedLength=5, offset=72, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MonthYear'}}
        //Token{signal=BEGIN_COMPOSITE, name='MaturityMonthYear', referencedName='null', description='Year, Month and Date', id=-1, version=0, deprecated=0, encodedLength=5, offset=72, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MonthYear'}}
        builder.append("maturityMonthYear=");
        maturityMonthYear().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='Currency', referencedName='null', description='Identifies currency used for price', id=15, version=0, deprecated=0, encodedLength=3, offset=77, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Currency'}}
        //Token{signal=ENCODING, name='Currency', referencedName='null', description='Currency', id=-1, version=0, deprecated=0, encodedLength=3, offset=77, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Currency'}}
        builder.append("currency=");
        for (int i = 0; i < currencyLength() && currency(i) > 0; i++)
        {
            builder.append((char)currency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StrikePrice', referencedName='null', description='Strike Price for an option instrument', id=202, version=0, deprecated=0, encodedLength=8, offset=80, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=80, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("strikePrice=");
        strikePrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='StrikeCurrency', referencedName='null', description='Currency in which the StrikePrice is denominated', id=947, version=0, deprecated=0, encodedLength=3, offset=88, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Currency'}}
        //Token{signal=ENCODING, name='Currency', referencedName='null', description='Currency', id=-1, version=0, deprecated=0, encodedLength=3, offset=88, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Currency'}}
        builder.append("strikeCurrency=");
        for (int i = 0; i < strikeCurrencyLength() && strikeCurrency(i) > 0; i++)
        {
            builder.append((char)strikeCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SettlCurrency', referencedName='null', description='Identifies currency used for settlement, if different from trade price currency', id=120, version=0, deprecated=0, encodedLength=3, offset=91, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Currency'}}
        //Token{signal=ENCODING, name='Currency', referencedName='null', description='Currency', id=-1, version=0, deprecated=0, encodedLength=3, offset=91, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='Currency'}}
        builder.append("settlCurrency=");
        for (int i = 0; i < settlCurrencyLength() && settlCurrency(i) > 0; i++)
        {
            builder.append((char)settlCurrency(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinCabPrice', referencedName='null', description='Defines cabinet price for outright options products', id=9850, version=0, deprecated=0, encodedLength=8, offset=94, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=94, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("minCabPrice=");
        minCabPrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MatchAlgorithm', referencedName='null', description='Matching algorithm', id=1142, version=0, deprecated=0, encodedLength=1, offset=102, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=ENCODING, name='CHAR', referencedName='null', description='char', id=-1, version=0, deprecated=0, encodedLength=1, offset=102, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
        builder.append("matchAlgorithm=");
        builder.append(matchAlgorithm());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinTradeVol', referencedName='null', description='The minimum trading volume for a security.', id=562, version=0, deprecated=0, encodedLength=4, offset=103, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='uInt32', referencedName='null', description='uInt32', id=-1, version=0, deprecated=0, encodedLength=4, offset=103, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("minTradeVol=");
        builder.append(minTradeVol());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MaxTradeVol', referencedName='null', description='The maximum trading volume for a security.', id=1140, version=0, deprecated=0, encodedLength=4, offset=107, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='uInt32', referencedName='null', description='uInt32', id=-1, version=0, deprecated=0, encodedLength=4, offset=107, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=UINT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("maxTradeVol=");
        builder.append(maxTradeVol());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinPriceIncrement', referencedName='null', description='Minimum constant tick for the instrument', id=969, version=0, deprecated=0, encodedLength=8, offset=111, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=111, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("minPriceIncrement=");
        minPriceIncrement().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MinPriceIncrementAmount', referencedName='null', description='Monetary value equivalent to the minimum price fluctuation', id=1146, version=0, deprecated=0, encodedLength=8, offset=119, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=119, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("minPriceIncrementAmount=");
        minPriceIncrementAmount().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='DisplayFactor', referencedName='null', description='Contains the multiplier to convert the CME Globex display price to the conventional price', id=9787, version=0, deprecated=0, encodedLength=8, offset=127, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='float'}}
        //Token{signal=BEGIN_COMPOSITE, name='FLOAT', referencedName='null', description='Decimal', id=-1, version=0, deprecated=0, encodedLength=8, offset=127, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='float'}}
        builder.append("displayFactor=");
        displayFactor().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TickRule', referencedName='null', description='VTT code referencing variable tick table ', id=6350, version=0, deprecated=0, encodedLength=1, offset=135, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='Int8NULL', referencedName='null', description='int8 optional', id=-1, version=0, deprecated=0, encodedLength=1, offset=135, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=127, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("tickRule=");
        builder.append(tickRule());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='MainFraction', referencedName='null', description='Price Denominator of Main Fraction', id=37702, version=0, deprecated=0, encodedLength=1, offset=136, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=136, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("mainFraction=");
        builder.append(mainFraction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SubFraction', referencedName='null', description='Price Denominator of Sub Fraction', id=37703, version=0, deprecated=0, encodedLength=1, offset=137, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=137, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("subFraction=");
        builder.append(subFraction());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='PriceDisplayFormat', referencedName='null', description='Number of decimals in fractional display price', id=9800, version=0, deprecated=0, encodedLength=1, offset=138, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        //Token{signal=ENCODING, name='uInt8NULL', referencedName='null', description='uInt8NULL', id=-1, version=0, deprecated=0, encodedLength=1, offset=138, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=255, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='int'}}
        builder.append("priceDisplayFormat=");
        builder.append(priceDisplayFormat());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnitOfMeasure', referencedName='null', description='Unit of measure for the products' original contract size. This will be populated for all products listed on CME Globex', id=996, version=0, deprecated=0, encodedLength=30, offset=139, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='UnitOfMeasure', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=30, offset=139, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("unitOfMeasure=");
        for (int i = 0; i < unitOfMeasureLength() && unitOfMeasure(i) > 0; i++)
        {
            builder.append((char)unitOfMeasure(i));
        }
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UnitOfMeasureQty', referencedName='null', description='This field contains the contract size for each instrument. Used in combination with tag 996-UnitofMeasure', id=1147, version=0, deprecated=0, encodedLength=8, offset=169, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=169, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("unitOfMeasureQty=");
        unitOfMeasureQty().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingReferencePrice', referencedName='null', description='Reference price - the most recently available Settlement whether it be Theoretical, Preliminary or a Final Settle of the session', id=1150, version=0, deprecated=0, encodedLength=8, offset=177, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=177, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("tradingReferencePrice=");
        tradingReferencePrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='SettlPriceType', referencedName='null', description='Bitmap field of eight Boolean type indicators representing settlement price type', id=731, version=0, deprecated=0, encodedLength=1, offset=185, componentTokenCount=10, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        //Token{signal=BEGIN_SET, name='SettlPriceType', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=185, componentTokenCount=8, encoding=Encoding{presence=REQUIRED, primitiveType=UINT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='MultipleCharValue'}}
        builder.append("settlPriceType=");
        builder.append(settlPriceType());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='ClearedVolume', referencedName='null', description='The total cleared volume of instrument traded during the prior trading session', id=5791, version=0, deprecated=0, encodedLength=4, offset=186, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=186, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("clearedVolume=");
        builder.append(clearedVolume());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='OpenInterestQty', referencedName='null', description='The total open interest for the market at the close of the prior trading session.', id=5792, version=0, deprecated=0, encodedLength=4, offset=190, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        //Token{signal=ENCODING, name='Int32NULL', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=4, offset=190, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT32, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=2147483647, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Qty'}}
        builder.append("openInterestQty=");
        builder.append(openInterestQty());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='LowLimitPrice', referencedName='null', description='Allowable low limit price for the trading day ', id=1148, version=0, deprecated=0, encodedLength=8, offset=194, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=194, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("lowLimitPrice=");
        lowLimitPrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='HighLimitPrice', referencedName='null', description='Allowable high limit price for the trading day', id=1149, version=0, deprecated=0, encodedLength=8, offset=202, componentTokenCount=6, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        //Token{signal=BEGIN_COMPOSITE, name='PRICENULL', referencedName='null', description='Price NULL', id=-1, version=0, deprecated=0, encodedLength=8, offset=202, componentTokenCount=4, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='Price'}}
        builder.append("highLimitPrice=");
        highLimitPrice().appendTo(builder);
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='UserDefinedInstrument', referencedName='null', description='User-defined instruments flag', id=9779, version=0, deprecated=0, encodedLength=1, offset=210, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='char'}}
        //Token{signal=ENCODING, name='UserDefinedInstrument', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=1, offset=210, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='char'}}
        builder.append("userDefinedInstrument=");
        builder.append(userDefinedInstrument());
        builder.append('|');
        //Token{signal=BEGIN_FIELD, name='TradingReferenceDate', referencedName='null', description='Indicates session date corresponding to the settlement price in tag 1150-TradingReferencePrice', id=5796, version=6, deprecated=0, encodedLength=2, offset=211, componentTokenCount=3, encoding=Encoding{presence=OPTIONAL, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        //Token{signal=ENCODING, name='LocalMktDate', referencedName='null', description='null', id=-1, version=0, deprecated=0, encodedLength=2, offset=211, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=UINT16, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=65535, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='LocalMktDate'}}
        builder.append("tradingReferenceDate=");
        builder.append(tradingReferenceDate());
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoEvents', referencedName='null', description='Number of EventType entries', id=864, version=0, deprecated=0, encodedLength=9, offset=213, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
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
        //Token{signal=BEGIN_GROUP, name='NoMDFeedTypes', referencedName='null', description='Number of FeedType entries', id=1141, version=0, deprecated=0, encodedLength=4, offset=-1, componentTokenCount=12, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
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
        //Token{signal=BEGIN_GROUP, name='NoInstAttrib', referencedName='null', description='Number of InstrAttribType entries', id=870, version=0, deprecated=0, encodedLength=4, offset=-1, componentTokenCount=35, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
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
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoUnderlyings', referencedName='null', description='Number of underlying instruments', id=711, version=0, deprecated=0, encodedLength=24, offset=-1, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noUnderlyings=[");
        NoUnderlyingsDecoder noUnderlyings = noUnderlyings();
        if (noUnderlyings.count() > 0)
        {
            while (noUnderlyings.hasNext())
            {
                noUnderlyings.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');
        builder.append('|');
        //Token{signal=BEGIN_GROUP, name='NoRelatedInstruments', referencedName='null', description='Number of related instruments group', id=1647, version=7, deprecated=0, encodedLength=24, offset=-1, componentTokenCount=15, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("noRelatedInstruments=[");
        NoRelatedInstrumentsDecoder noRelatedInstruments = noRelatedInstruments();
        if (noRelatedInstruments.count() > 0)
        {
            while (noRelatedInstruments.hasNext())
            {
                noRelatedInstruments.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
}
