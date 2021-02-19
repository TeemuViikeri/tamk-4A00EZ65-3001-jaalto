public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        try {
            validate(hours, minutes, seconds);
        } catch (IllegalHourException | IllegalMinuteException | IllegalSecondException e) {
            e.printStackTrace();
            System.exit(1);
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private void validate(int hours, int minutes, int seconds)
            throws IllegalHourException, IllegalMinuteException, IllegalSecondException {
        if (hours < 0 || hours > 23) {
            throw new IllegalHourException("Hours are invalid: not in range 0..23.");
        }

        if (minutes < 0 || minutes > 59) {
            throw new IllegalMinuteException("Minutes are invalid: not in range 0..59.");
        }

        if (seconds < 0 || seconds > 59) {
            throw new IllegalSecondException("Seconds are invalid: not in range 0..59.");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
