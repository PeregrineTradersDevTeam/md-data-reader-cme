/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.MutableDirectBuffer;
import org.agrona.DirectBuffer;

/**
 * AdminLogout
 */
@SuppressWarnings("all")
public class AdminLogout16Decoder
{
    public static final int BLOCK_LENGTH = 180;
    public static final int TEMPLATE_ID = 16;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final AdminLogout16Decoder parentMessage = this;
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
        return "5";
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public AdminLogout16Decoder wrap(
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

    public static int textId()
    {
        return 58;
    }

    public static int textSinceVersion()
    {
        return 0;
    }

    public static int textEncodingOffset()
    {
        return 0;
    }

    public static int textEncodingLength()
    {
        return 180;
    }

    public static String textMetaAttribute(final MetaAttribute metaAttribute)
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

    public static byte textNullValue()
    {
        return (byte)0;
    }

    public static byte textMinValue()
    {
        return (byte)32;
    }

    public static byte textMaxValue()
    {
        return (byte)126;
    }

    public static int textLength()
    {
        return 180;
    }

    public byte text(final int index)
    {
        if (index < 0 || index >= 180)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = this.offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String textCharacterEncoding()
    {
        return "US-ASCII";
    }

    public int getText(final byte[] dst, final int dstOffset)
    {
        final int length = 180;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(this.offset + 0, dst, dstOffset, length);

        return length;
    }

    public String text()
    {
        final byte[] dst = new byte[180];
        buffer.getBytes(this.offset + 0, dst, 0, 180);

        int end = 0;
        for (; end < 180 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public void getText(final Appendable value)
    {
        for (int i = 0; i < 180 ; ++i)
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



    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        final int originalLimit = limit();
        limit(offset + actingBlockLength);
        builder.append("[AdminLogout16](sbeTemplateId=");
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
        //Token{signal=BEGIN_FIELD, name='Text', referencedName='null', description='Free format text string. May include logout confirmation or reason for logout', id=58, version=0, deprecated=0, encodedLength=180, offset=0, componentTokenCount=3, encoding=Encoding{presence=REQUIRED, primitiveType=null, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='String'}}
        //Token{signal=ENCODING, name='Text', referencedName='null', description='Text', id=-1, version=0, deprecated=0, encodedLength=180, offset=0, componentTokenCount=1, encoding=Encoding{presence=REQUIRED, primitiveType=CHAR, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=null, characterEncoding='US-ASCII', epoch='null', timeUnit=null, semanticType='String'}}
        builder.append("text=");
        for (int i = 0; i < textLength() && text(i) > 0; i++)
        {
            builder.append((char)text(i));
        }

        limit(originalLimit);

        return builder;
    }
}
