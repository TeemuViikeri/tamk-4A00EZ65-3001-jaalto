import java.time.Year;
import java.util.Calendar;

public class Date extends Time {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day, int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);

        try {
            validate(year, month, day);
        } catch (IllegalYearException | IllegalMonthException | IllegalDayException e) {
            e.printStackTrace();
            System.exit(1);
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    private void validate(int year, int month, int day)
            throws IllegalYearException, IllegalMonthException, IllegalDayException {
        if (year < 1) {
            throw new IllegalYearException("Year is invalid: must be over 0.");
        }

        if (month < 1 || month > 12) {
            throw new IllegalMonthException("Month is invalid: not in range 1..12.");
        }

        switch (month - 1) {
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.OCTOBER:
            case Calendar.DECEMBER:
                if (day < 1 || day > 31) {
                    throw new IllegalDayException("Day is invalid: not in range 1..31.");
                }
                break;
            case Calendar.FEBRUARY:
                if (Year.of(year).isLeap()) {
                    if (day < 1 || day > 29) {
                        throw new IllegalDayException("Day is invalid: not in range 1..29.");
                    }
                } else {
                    if (day < 1 || day > 28) {
                        throw new IllegalDayException("Day is invalid: not in range 1..28.");
                    }
                }
                break;
            default:
                if (day < 1 || day > 30) {
                    throw new IllegalDayException("Day is invalid: not in range 1..30.");
                }
                break;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("Time is: %04d-%02d-%02d %s", year, month, day, super.toString());
    }
}
