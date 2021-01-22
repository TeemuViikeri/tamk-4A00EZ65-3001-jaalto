public class Date extends Time {
    private int years;
    private int months;
    private int days;

    public Date(int years, int months, int days, int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.years = years;
        this.months = months;
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return String.format("Time is: %04d-%02d-%02d %s", years, months, days, super.toString());
    }
}
