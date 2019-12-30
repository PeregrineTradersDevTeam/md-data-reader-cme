/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum SecurityUpdateAction
{
    /**
     * Add
     */
    Add((byte)65),

    /**
     * Delete
     */
    Delete((byte)68),

    /**
     * Modify
     */
    Modify((byte)77),

    /**
     * To be used to represent not present or null.
     */
    NULL_VAL((byte)0);

    private final byte value;

    SecurityUpdateAction(final byte value)
    {
        this.value = value;
    }

    public byte value()
    {
        return value;
    }

    public static SecurityUpdateAction get(final byte value)
    {
        switch (value)
        {
            case 65: return Add;
            case 68: return Delete;
            case 77: return Modify;
        }

        if ((byte)0 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
