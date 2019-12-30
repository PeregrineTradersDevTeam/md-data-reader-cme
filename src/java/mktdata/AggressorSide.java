/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum AggressorSide
{
    /**
     * No Aggressor
     */
    NoAggressor((short)0),

    /**
     * Buy
     */
    Buy((short)1),

    /**
     * Sell
     */
    Sell((short)2),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((short)255);

    private final short value;

    AggressorSide(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static AggressorSide get(final short value)
    {
        switch (value)
        {
            case 0: return NoAggressor;
            case 1: return Buy;
            case 2: return Sell;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
