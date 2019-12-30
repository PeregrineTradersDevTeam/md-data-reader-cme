/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum MDEntryType
{
    /**
     * Bid
     */
    Bid((byte)48),

    /**
     * Offer
     */
    Offer((byte)49),

    /**
     * Trade
     */
    Trade((byte)50),

    /**
     * Open Price
     */
    OpenPrice((byte)52),

    /**
     * Settlement Price
     */
    SettlementPrice((byte)54),

    /**
     * Trading Session High Price
     */
    TradingSessionHighPrice((byte)55),

    /**
     * Trading Session Low Price
     */
    TradingSessionLowPrice((byte)56),

    /**
     * Cleared Volume
     */
    ClearedVolume((byte)66),

    /**
     * Open Interest
     */
    OpenInterest((byte)67),

    /**
     * Implied Bid
     */
    ImpliedBid((byte)69),

    /**
     * Implied Offer
     */
    ImpliedOffer((byte)70),

    /**
     * Book Reset
     */
    BookReset((byte)74),

    /**
     * Session High Bid
     */
    SessionHighBid((byte)78),

    /**
     * Session Low Offer
     */
    SessionLowOffer((byte)79),

    /**
     * Fixing Price
     */
    FixingPrice((byte)87),

    /**
     * Electronic Volume
     */
    ElectronicVolume((byte)101),

    /**
     * Threshold Limits and Price Band Variation
     */
    ThresholdLimitsandPriceBandVariation((byte)103),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    MDEntryType(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static MDEntryType get(final byte value)
    {
        switch (value)
        {
            case 48: return Bid;
            case 49: return Offer;
            case 50: return Trade;
            case 52: return OpenPrice;
            case 54: return SettlementPrice;
            case 55: return TradingSessionHighPrice;
            case 56: return TradingSessionLowPrice;
            case 66: return ClearedVolume;
            case 67: return OpenInterest;
            case 69: return ImpliedBid;
            case 70: return ImpliedOffer;
            case 74: return BookReset;
            case 78: return SessionHighBid;
            case 79: return SessionLowOffer;
            case 87: return FixingPrice;
            case 101: return ElectronicVolume;
            case 103: return ThresholdLimitsandPriceBandVariation;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
