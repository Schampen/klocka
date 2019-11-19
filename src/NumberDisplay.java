public class NumberDisplay {
    private int limit;
    private int value;

    /**
     * Constructs a NumberDisplay
     * @param maxLimit limits the NumberDisplay
     */
    public NumberDisplay (int maxLimit) {
        this.limit = maxLimit;
        this.value = 0;
    }

    /**
     *
     * @return returns value
     */
    public int getValue() {
        return value;
    }

    /**
     * set a new value for Value
     * @param newValue a new value
     */
    public void setValue(int newValue) {
        if (newValue > 0 && newValue < limit) {
            this.value = newValue;
        }
    }

    /**
     * Returns the value of the NumberDisplay
     * @return
     */
    public String getDisplayValue() {
        String display = null;
        if (value > 9) {
            display = String.valueOf(value);
        } else if (value < 10) {
            display = "0" + value;
        }
        return display;
    }

    /**
     *  Increases the value of value by 1
     */
    public void increment() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }
}
