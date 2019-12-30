/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum MDEntryTypeDailyStatistics
{
    /**
     * Settlement Price
     */
    SettlementPrice((byte)54),

    /**
     * Cleared Volume
     */
    ClearedVolume((byte)66),

    /**
     * Open Interest
     */
    OpenInterest((byte)67),

    /**
     * Fixing Price
     */
    FixingPrice((byte)87),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    MDEntryTypeDailyStatistics(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static MDEntryTypeDailyStatistics get(final byte value)
    {
        switch (value)
        {
            case 54: return SettlementPrice;
            case 66: return ClearedVolume;
            case 67: return OpenInterest;
            case 87: return FixingPrice;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
