/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum SecurityTradingStatus
{
    /**
     * Trading Halt
     */
    TradingHalt((short)2),

    /**
     * Close
     */
    Close((short)4),

    /**
     * New Price Indication
     */
    NewPriceIndication((short)15),

    /**
     * Ready To Trade
     */
    ReadyToTrade((short)17),

    /**
     * Not Available For Trading
     */
    NotAvailableForTrading((short)18),

    /**
     * Unknown or Invalid
     */
    UnknownorInvalid((short)20),

    /**
     * Pre Open
     */
    PreOpen((short)21),

    /**
     * Pre Cross
     */
    PreCross((short)24),

    /**
     * Cross
     */
    Cross((short)25),

    /**
     * Post Close
     */
    PostClose((short)26),

    /**
     * No Change
     */
    NoChange((short)103),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SecurityTradingStatus(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static SecurityTradingStatus get(final short value)
    {
        switch (value)
        {
            case 2: return TradingHalt;
            case 4: return Close;
            case 15: return NewPriceIndication;
            case 17: return ReadyToTrade;
            case 18: return NotAvailableForTrading;
            case 20: return UnknownorInvalid;
            case 21: return PreOpen;
            case 24: return PreCross;
            case 25: return Cross;
            case 26: return PostClose;
            case 103: return NoChange;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
