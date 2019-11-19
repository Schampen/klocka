public class Clock {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    /**
     * Constructs a new Clock
     */
    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructs a Clock
     * @param hour sets the hours
     * @param minute sets the minutes
     */
    public Clock(int hour, int minute) {
        hours = new NumberDisplay(24);
        hours.setValue(hour);
        minutes = new NumberDisplay(60);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Increases the value of the clock
     */
    public void timeTick() {
        if (minutes.getValue() == 59) {
            hours.increment();
            minutes.increment();
        } else {
            minutes.increment();
        }
        updateDisplay();
    }

    /**
     * Sets the time
     * @param hour sets the hours
     * @param minute sets the minutes
     */
    public void setTime(int hour ,int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Returns the Clock value
     * @return
     */
    public String getTime() {
        return displayString;
    }

    /**
     * Updates the displayString value
     */
    private void updateDisplay() {
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
