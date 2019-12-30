/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum MDEntryTypeStatistics
{
    /**
     * Open Price
     */
    OpenPrice((byte)52),

    /**
     * High Trade
     */
    HighTrade((byte)55),

    /**
     * Low Trade
     */
    LowTrade((byte)56),

    /**
     * Highest Bid
     */
    HighestBid((byte)78),

    /**
     * Lowest Offer
     */
    LowestOffer((byte)79),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    MDEntryTypeStatistics(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static MDEntryTypeStatistics get(final byte value)
    {
        switch (value)
        {
            case 52: return OpenPrice;
            case 55: return HighTrade;
            case 56: return LowTrade;
            case 78: return HighestBid;
            case 79: return LowestOffer;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
