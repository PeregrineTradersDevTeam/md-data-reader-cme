/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum SecurityTradingEvent
{
    /**
     * No Event
     */
    NoEvent((short)0),

    /**
     * No Cancel
     */
    NoCancel((short)1),

    /**
     * Reset Statistics
     */
    ResetStatistics((short)4),

    /**
     * Implied Matching ON
     */
    ImpliedMatchingON((short)5),

    /**
     * Implied Matching OFF
     */
    ImpliedMatchingOFF((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    SecurityTradingEvent(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static SecurityTradingEvent get(final short value)
    {
        switch (value)
        {
            case 0: return NoEvent;
            case 1: return NoCancel;
            case 4: return ResetStatistics;
            case 5: return ImpliedMatchingON;
            case 6: return ImpliedMatchingOFF;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
