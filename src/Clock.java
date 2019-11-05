public class Clock {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public Clock() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public Clock(int hour, int minute) {
        hours = new NumberDisplay(24);
        hours.setValue(hour);
        minutes = new NumberDisplay(60);
        minutes.setValue(minute);
        updateDisplay();
    }

    public void timeTick() {
        minutes.increment();
    }

    public void setTime(int hour ,int minute) {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime() {
        return displayString;
    }

    private void updateDisplay() {
        displayString = hours.getDisplayValue() + minutes.getDisplayValue();
    }
}
