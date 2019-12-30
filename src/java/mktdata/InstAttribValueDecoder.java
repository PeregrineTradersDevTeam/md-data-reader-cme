/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public class InstAttribValueDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final int ENCODED_LENGTH = 4;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public InstAttribValueDecoder wrap(final DirectBuffer buffer, final int offset)
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
        return 0 == buffer.getInt(offset);
    }

    /**
     * 1=Electronic Match Eligible
     *
     * @return true if ElectronicMatchEligible is set or false if not
     */
    public boolean electronicMatchEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 0));
    }

    public static boolean electronicMatchEligible(final int value)
    {
        return 0 != (value & (1 << 0));
    }

    /**
     * 1=Order Cross Eligible
     *
     * @return true if OrderCrossEligible is set or false if not
     */
    public boolean orderCrossEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 1));
    }

    public static boolean orderCrossEligible(final int value)
    {
        return 0 != (value & (1 << 1));
    }

    /**
     * 1=Block Trade Eligible
     *
     * @return true if BlockTradeEligible is set or false if not
     */
    public boolean blockTradeEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 2));
    }

    public static boolean blockTradeEligible(final int value)
    {
        return 0 != (value & (1 << 2));
    }

    /**
     * 1=EFP Eligible
     *
     * @return true if EFPEligible is set or false if not
     */
    public boolean eFPEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 3));
    }

    public static boolean eFPEligible(final int value)
    {
        return 0 != (value & (1 << 3));
    }

    /**
     * 1=EBF Eligible
     *
     * @return true if EBFEligible is set or false if not
     */
    public boolean eBFEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 4));
    }

    public static boolean eBFEligible(final int value)
    {
        return 0 != (value & (1 << 4));
    }

    /**
     * 1=EFS Eligible
     *
     * @return true if EFSEligible is set or false if not
     */
    public boolean eFSEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 5));
    }

    public static boolean eFSEligible(final int value)
    {
        return 0 != (value & (1 << 5));
    }

    /**
     * 1=EFR Eligible
     *
     * @return true if EFREligible is set or false if not
     */
    public boolean eFREligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 6));
    }

    public static boolean eFREligible(final int value)
    {
        return 0 != (value & (1 << 6));
    }

    /**
     * 1=OTC Eligible
     *
     * @return true if OTCEligible is set or false if not
     */
    public boolean oTCEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 7));
    }

    public static boolean oTCEligible(final int value)
    {
        return 0 != (value & (1 << 7));
    }

    /**
     * 1=iLink Indicative Mass Quoting Eligible
     *
     * @return true if iLinkIndicativeMassQuotingEligible is set or false if not
     */
    public boolean iLinkIndicativeMassQuotingEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 8));
    }

    public static boolean iLinkIndicativeMassQuotingEligible(final int value)
    {
        return 0 != (value & (1 << 8));
    }

    /**
     * 1=Negative Strike Eligible
     *
     * @return true if NegativeStrikeEligible is set or false if not
     */
    public boolean negativeStrikeEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 9));
    }

    public static boolean negativeStrikeEligible(final int value)
    {
        return 0 != (value & (1 << 9));
    }

    /**
     * 1=Negative Price Outright Eligible
     *
     * @return true if NegativePriceOutrightEligible is set or false if not
     */
    public boolean negativePriceOutrightEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 10));
    }

    public static boolean negativePriceOutrightEligible(final int value)
    {
        return 0 != (value & (1 << 10));
    }

    /**
     * 1=Indicates product has fractional display price
     *
     * @return true if IsFractional is set or false if not
     */
    public boolean isFractional()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 11));
    }

    public static boolean isFractional(final int value)
    {
        return 0 != (value & (1 << 11));
    }

    /**
     * 1=Volatility Quoted Option
     *
     * @return true if VolatilityQuotedOption is set or false if not
     */
    public boolean volatilityQuotedOption()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 12));
    }

    public static boolean volatilityQuotedOption(final int value)
    {
        return 0 != (value & (1 << 12));
    }

    /**
     * 1=RFQ Cross Eligible
     *
     * @return true if RFQCrossEligible is set or false if not
     */
    public boolean rFQCrossEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 13));
    }

    public static boolean rFQCrossEligible(final int value)
    {
        return 0 != (value & (1 << 13));
    }

    /**
     * 1=Zero Price Outright Eligible
     *
     * @return true if ZeroPriceOutrightEligible is set or false if not
     */
    public boolean zeroPriceOutrightEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 14));
    }

    public static boolean zeroPriceOutrightEligible(final int value)
    {
        return 0 != (value & (1 << 14));
    }

    /**
     * 1=Decaying Product Eligibility
     *
     * @return true if DecayingProductEligibility is set or false if not
     */
    public boolean decayingProductEligibility()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 15));
    }

    public static boolean decayingProductEligibility(final int value)
    {
        return 0 != (value & (1 << 15));
    }

    /**
     * 1=Variable Product Eligibility
     *
     * @return true if VariableProductEligibility is set or false if not
     */
    public boolean variableProductEligibility()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 16));
    }

    public static boolean variableProductEligibility(final int value)
    {
        return 0 != (value & (1 << 16));
    }

    /**
     * 1=Daily Product Eligibility
     *
     * @return true if DailyProductEligibility is set or false if not
     */
    public boolean dailyProductEligibility()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 17));
    }

    public static boolean dailyProductEligibility(final int value)
    {
        return 0 != (value & (1 << 17));
    }

    /**
     * 1=GT Orders Eligibility
     *
     * @return true if GTOrdersEligibility is set or false if not
     */
    public boolean gTOrdersEligibility()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 18));
    }

    public static boolean gTOrdersEligibility(final int value)
    {
        return 0 != (value & (1 << 18));
    }

    /**
     * 1=Implied Matching Eligibility
     *
     * @return true if ImpliedMatchingEligibility is set or false if not
     */
    public boolean impliedMatchingEligibility()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 19));
    }

    public static boolean impliedMatchingEligibility(final int value)
    {
        return 0 != (value & (1 << 19));
    }

    /**
     * 1=Triangulation Eligible
     *
     * @return true if TriangulationEligible is set or false if not
     */
    public boolean triangulationEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 20));
    }

    public static boolean triangulationEligible(final int value)
    {
        return 0 != (value & (1 << 20));
    }

    /**
     * 1=Variable Cab Eligible
     *
     * @return true if VariableCabEligible is set or false if not
     */
    public boolean variableCabEligible()
    {
        return 0 != (buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN) & (1 << 21));
    }

    public static boolean variableCabEligible(final int value)
    {
        return 0 != (value & (1 << 21));
    }

    public String toString()
    {
        return appendTo(new StringBuilder(100)).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        builder.append('{');
        boolean atLeastOne = false;
        if (electronicMatchEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("electronicMatchEligible");
            atLeastOne = true;
        }
        if (orderCrossEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("orderCrossEligible");
            atLeastOne = true;
        }
        if (blockTradeEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("blockTradeEligible");
            atLeastOne = true;
        }
        if (eFPEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("eFPEligible");
            atLeastOne = true;
        }
        if (eBFEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("eBFEligible");
            atLeastOne = true;
        }
        if (eFSEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("eFSEligible");
            atLeastOne = true;
        }
        if (eFREligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("eFREligible");
            atLeastOne = true;
        }
        if (oTCEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("oTCEligible");
            atLeastOne = true;
        }
        if (iLinkIndicativeMassQuotingEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("iLinkIndicativeMassQuotingEligible");
            atLeastOne = true;
        }
        if (negativeStrikeEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("negativeStrikeEligible");
            atLeastOne = true;
        }
        if (negativePriceOutrightEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("negativePriceOutrightEligible");
            atLeastOne = true;
        }
        if (isFractional())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("isFractional");
            atLeastOne = true;
        }
        if (volatilityQuotedOption())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("volatilityQuotedOption");
            atLeastOne = true;
        }
        if (rFQCrossEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("rFQCrossEligible");
            atLeastOne = true;
        }
        if (zeroPriceOutrightEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("zeroPriceOutrightEligible");
            atLeastOne = true;
        }
        if (decayingProductEligibility())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("decayingProductEligibility");
            atLeastOne = true;
        }
        if (variableProductEligibility())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("variableProductEligibility");
            atLeastOne = true;
        }
        if (dailyProductEligibility())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("dailyProductEligibility");
            atLeastOne = true;
        }
        if (gTOrdersEligibility())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("gTOrdersEligibility");
            atLeastOne = true;
        }
        if (impliedMatchingEligibility())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("impliedMatchingEligibility");
            atLeastOne = true;
        }
        if (triangulationEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("triangulationEligible");
            atLeastOne = true;
        }
        if (variableCabEligible())
        {
            if (atLeastOne)
            {
                builder.append(',');
            }
            builder.append("variableCabEligible");
            atLeastOne = true;
        }
        builder.append('}');

        return builder;
    }
}
