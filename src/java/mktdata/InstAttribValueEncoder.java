/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public class InstAttribValueEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 9;
    public static final int ENCODED_LENGTH = 4;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public InstAttribValueEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public InstAttribValueEncoder clear()
    {
        buffer.putInt(offset, (int)0L, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /**
     * 1=Electronic Match Eligible
     *
     * @param value true if ElectronicMatchEligible is set or false if not
     */
    public InstAttribValueEncoder electronicMatchEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 0) : bits & ~(1 << 0);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int electronicMatchEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 0) : bits & ~(1 << 0);
    }

    /**
     * 1=Order Cross Eligible
     *
     * @param value true if OrderCrossEligible is set or false if not
     */
    public InstAttribValueEncoder orderCrossEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 1) : bits & ~(1 << 1);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int orderCrossEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 1) : bits & ~(1 << 1);
    }

    /**
     * 1=Block Trade Eligible
     *
     * @param value true if BlockTradeEligible is set or false if not
     */
    public InstAttribValueEncoder blockTradeEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 2) : bits & ~(1 << 2);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int blockTradeEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 2) : bits & ~(1 << 2);
    }

    /**
     * 1=EFP Eligible
     *
     * @param value true if EFPEligible is set or false if not
     */
    public InstAttribValueEncoder eFPEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 3) : bits & ~(1 << 3);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int eFPEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 3) : bits & ~(1 << 3);
    }

    /**
     * 1=EBF Eligible
     *
     * @param value true if EBFEligible is set or false if not
     */
    public InstAttribValueEncoder eBFEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 4) : bits & ~(1 << 4);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int eBFEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 4) : bits & ~(1 << 4);
    }

    /**
     * 1=EFS Eligible
     *
     * @param value true if EFSEligible is set or false if not
     */
    public InstAttribValueEncoder eFSEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 5) : bits & ~(1 << 5);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int eFSEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 5) : bits & ~(1 << 5);
    }

    /**
     * 1=EFR Eligible
     *
     * @param value true if EFREligible is set or false if not
     */
    public InstAttribValueEncoder eFREligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 6) : bits & ~(1 << 6);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int eFREligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 6) : bits & ~(1 << 6);
    }

    /**
     * 1=OTC Eligible
     *
     * @param value true if OTCEligible is set or false if not
     */
    public InstAttribValueEncoder oTCEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 7) : bits & ~(1 << 7);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int oTCEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 7) : bits & ~(1 << 7);
    }

    /**
     * 1=iLink Indicative Mass Quoting Eligible
     *
     * @param value true if iLinkIndicativeMassQuotingEligible is set or false if not
     */
    public InstAttribValueEncoder iLinkIndicativeMassQuotingEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 8) : bits & ~(1 << 8);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int iLinkIndicativeMassQuotingEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 8) : bits & ~(1 << 8);
    }

    /**
     * 1=Negative Strike Eligible
     *
     * @param value true if NegativeStrikeEligible is set or false if not
     */
    public InstAttribValueEncoder negativeStrikeEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 9) : bits & ~(1 << 9);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int negativeStrikeEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 9) : bits & ~(1 << 9);
    }

    /**
     * 1=Negative Price Outright Eligible
     *
     * @param value true if NegativePriceOutrightEligible is set or false if not
     */
    public InstAttribValueEncoder negativePriceOutrightEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 10) : bits & ~(1 << 10);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int negativePriceOutrightEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 10) : bits & ~(1 << 10);
    }

    /**
     * 1=Indicates product has fractional display price
     *
     * @param value true if IsFractional is set or false if not
     */
    public InstAttribValueEncoder isFractional(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 11) : bits & ~(1 << 11);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int isFractional(final int bits, final boolean value)
    {
        return value ? bits | (1 << 11) : bits & ~(1 << 11);
    }

    /**
     * 1=Volatility Quoted Option
     *
     * @param value true if VolatilityQuotedOption is set or false if not
     */
    public InstAttribValueEncoder volatilityQuotedOption(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 12) : bits & ~(1 << 12);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int volatilityQuotedOption(final int bits, final boolean value)
    {
        return value ? bits | (1 << 12) : bits & ~(1 << 12);
    }

    /**
     * 1=RFQ Cross Eligible
     *
     * @param value true if RFQCrossEligible is set or false if not
     */
    public InstAttribValueEncoder rFQCrossEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 13) : bits & ~(1 << 13);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int rFQCrossEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 13) : bits & ~(1 << 13);
    }

    /**
     * 1=Zero Price Outright Eligible
     *
     * @param value true if ZeroPriceOutrightEligible is set or false if not
     */
    public InstAttribValueEncoder zeroPriceOutrightEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 14) : bits & ~(1 << 14);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int zeroPriceOutrightEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 14) : bits & ~(1 << 14);
    }

    /**
     * 1=Decaying Product Eligibility
     *
     * @param value true if DecayingProductEligibility is set or false if not
     */
    public InstAttribValueEncoder decayingProductEligibility(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 15) : bits & ~(1 << 15);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int decayingProductEligibility(final int bits, final boolean value)
    {
        return value ? bits | (1 << 15) : bits & ~(1 << 15);
    }

    /**
     * 1=Variable Product Eligibility
     *
     * @param value true if VariableProductEligibility is set or false if not
     */
    public InstAttribValueEncoder variableProductEligibility(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 16) : bits & ~(1 << 16);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int variableProductEligibility(final int bits, final boolean value)
    {
        return value ? bits | (1 << 16) : bits & ~(1 << 16);
    }

    /**
     * 1=Daily Product Eligibility
     *
     * @param value true if DailyProductEligibility is set or false if not
     */
    public InstAttribValueEncoder dailyProductEligibility(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 17) : bits & ~(1 << 17);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int dailyProductEligibility(final int bits, final boolean value)
    {
        return value ? bits | (1 << 17) : bits & ~(1 << 17);
    }

    /**
     * 1=GT Orders Eligibility
     *
     * @param value true if GTOrdersEligibility is set or false if not
     */
    public InstAttribValueEncoder gTOrdersEligibility(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 18) : bits & ~(1 << 18);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int gTOrdersEligibility(final int bits, final boolean value)
    {
        return value ? bits | (1 << 18) : bits & ~(1 << 18);
    }

    /**
     * 1=Implied Matching Eligibility
     *
     * @param value true if ImpliedMatchingEligibility is set or false if not
     */
    public InstAttribValueEncoder impliedMatchingEligibility(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 19) : bits & ~(1 << 19);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int impliedMatchingEligibility(final int bits, final boolean value)
    {
        return value ? bits | (1 << 19) : bits & ~(1 << 19);
    }

    /**
     * 1=Triangulation Eligible
     *
     * @param value true if TriangulationEligible is set or false if not
     */
    public InstAttribValueEncoder triangulationEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 20) : bits & ~(1 << 20);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int triangulationEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 20) : bits & ~(1 << 20);
    }

    /**
     * 1=Variable Cab Eligible
     *
     * @param value true if VariableCabEligible is set or false if not
     */
    public InstAttribValueEncoder variableCabEligible(final boolean value)
    {
        int bits = buffer.getInt(offset, java.nio.ByteOrder.LITTLE_ENDIAN);
        bits = value ? bits | (1 << 21) : bits & ~(1 << 21);
        buffer.putInt(offset, bits, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int variableCabEligible(final int bits, final boolean value)
    {
        return value ? bits | (1 << 21) : bits & ~(1 << 21);
    }
}
