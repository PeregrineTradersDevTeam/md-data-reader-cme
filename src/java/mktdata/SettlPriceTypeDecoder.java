/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class SettlPriceTypeDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final int ENCODED_LENGTH = 1;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public SettlPriceTypeDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public boolean isEmpty()
    {
        return 0 == buffer.getByte(offset);
    }

    /**
     * 1=FinalDaily, 0=Preliminary
     *
     * @return true if FinalDaily is set or false if not
     */
    public boolean finalDaily()
    {
        return 0 != (buffer.getByte(offset) & (1 << 0));
    }

    public static boolean finalDaily(final byte value)
    {
        return 0 != (value & (1 << 0));
    }

    /**
     * 1=Actual, 0=Theoretically Calculated
     *
     * @return true if Actual is set or false if not
     */
    public boolean actual()
    {
        return 0 != (buffer.getByte(offset) & (1 << 1));
    }

    public static boolean actual(final byte value)
    {
        return 0 != (value & (1 << 1));
    }

    /**
     * 1=Rounded, 0=Non-Rounded or Undefined
     *
     * @return true if Rounded is set or false if not
     */
    public boolean rounded()
    {
        return 0 != (buffer.getByte(offset) & (1 << 2));
    }

    public static boolean rounded(final byte value)
    {
        return 0 != (value & (1 << 2));
    }

    /**
     * 1=Intraday, 0=Undefined
     *
     * @return true if Intraday is set or false if not
     */
    public boolean intraday()
    {
        return 0 != (buffer.getByte(offset) & (1 << 3));
    }

    public static boolean intraday(final byte value)
    {
        return 0 != (value & (1 << 3));
    }

    /**
     * Bits 4-6 are reserved
     *
     * @return true if ReservedBits is set or false if not
     */
    public boolean reservedBits()
    {
        return 0 != (buffer.getByte(offset) & (1 << 4));
    }

    public static boolean reservedBits(final byte value)
    {
        return 0 != (value & (1 << 4));
    }

    /**
     * 1=Entire set is NULL, 0=not NULL
     *
     * @return true if NullValue is set or false if not
     */
    public boolean nullValue()
    {
        return 0 != (buffer.getByte(offset) & (1 << 7));
    }

    public static boolean nullValue(final byte value)
    {
        return 0 != (value & (1 << 7));
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (finalDaily())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("finalDaily");
            atLeastOne = true;
        }
        if (actual())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("actual");
            atLeastOne = true;
        }
        if (rounded())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("rounded");
            atLeastOne = true;
        }
        if (intraday())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("intraday");
            atLeastOne = true;
        }
        if (reservedBits())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("reservedBits");
            atLeastOne = true;
        }
        if (nullValue())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("nullValue");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
