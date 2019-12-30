/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum PutOrCall
{
    /**
     * Put Option
     */
    Put((short)0),

    /**
     * Call Option
     */
    Call((short)1),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    PutOrCall(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static PutOrCall get(final short value)
    {
        switch (value)
        {
            case 0: return Put;
            case 1: return Call;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
