/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum HaltReason
{
    /**
     * Group Schedule
     */
    GroupSchedule((short)0),

    /**
     * Surveillance Intervention 
     */
    SurveillanceIntervention((short)1),

    /**
     * Market Event 
     */
    MarketEvent((short)2),

    /**
     * Instrument Activation
     */
    InstrumentActivation((short)3),

    /**
     * Instrument Expiration
     */
    InstrumentExpiration((short)4),

    /**
     * Unknown
     */
    Unknown((short)5),

    /**
     * Recovery In Process
     */
    RecoveryInProcess((short)6),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    HaltReason(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static HaltReason get(final short value)
    {
        switch (value)
        {
            case 0: return GroupSchedule;
            case 1: return SurveillanceIntervention;
            case 2: return MarketEvent;
            case 3: return InstrumentActivation;
            case 4: return InstrumentExpiration;
            case 5: return Unknown;
            case 6: return RecoveryInProcess;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
