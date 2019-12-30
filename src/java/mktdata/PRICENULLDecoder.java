/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.DirectBuffer;

/**
 * Price NULL
 */
@SuppressWarnings("all")
public class PRICENULLDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final int ENCODED_LENGTH = 8;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public PRICENULLDecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
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

    public static int mantissaEncodingOffset()
    {
        return 0;
    }

    public static int mantissaEncodingLength()
    {
        return 8;
    }

    public static int mantissaSinceVersion()
    {
        return 0;
    }

    public static long mantissaNullValue()
    {
        return 9223372036854775807L;
    }

    public static long mantissaMinValue()
    {
        return -9223372036854775807L;
    }

    public static long mantissaMaxValue()
    {
        return 9223372036854775807L;
    }

    public long mantissa()
    {
        return buffer.getLong(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int exponentEncodingOffset()
    {
        return 8;
    }

    public static int exponentEncodingLength()
    {
        return 0;
    }

    public static int exponentSinceVersion()
    {
        return 0;
    }

    public static byte exponentNullValue()
    {
        return (byte)-128;
    }

    public static byte exponentMinValue()
    {
        return (byte)-127;
    }

    public static byte exponentMaxValue()
    {
        return (byte)127;
    }

    public byte exponent()
    {
        return (byte)-7;
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('(');
        //Token{signal=ENCODING, name='mantissa', referencedName='null', description='mantissa', id=-1, version=0, deprecated=0, encodedLength=8, offset=0, componentTokenCount=1, encoding=Encoding{presence=OPTIONAL, primitiveType=INT64, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=9223372036854775807, constValue=null, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append("mantissa=");
        builder.append(mantissa());
        builder.append('|');
        //Token{signal=ENCODING, name='exponent', referencedName='null', description='exponent', id=-1, version=0, deprecated=0, encodedLength=0, offset=8, componentTokenCount=1, encoding=Encoding{presence=CONSTANT, primitiveType=INT8, byteOrder=LITTLE_ENDIAN, minValue=null, maxValue=null, nullValue=null, constValue=-7, characterEncoding='null', epoch='null', timeUnit=null, semanticType='null'}}
        builder.append(')');

        return builder;
    }
}
