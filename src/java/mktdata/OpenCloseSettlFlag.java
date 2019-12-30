/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum OpenCloseSettlFlag
{
    /**
     * Daily Open Price
     */
    DailyOpenPrice((short)0),

    /**
     * Indicative Opening Price
     */
    IndicativeOpeningPrice((short)5),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    OpenCloseSettlFlag(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static OpenCloseSettlFlag get(final short value)
    {
        switch (value)
        {
            case 0: return DailyOpenPrice;
            case 5: return IndicativeOpeningPrice;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
