package chapterEight;

public class CustomDate {
    private int month;
    private final int day;
    private final int year;
    private String stringMonth;

    public CustomDate(int month, int day, int year) {
        validateDay(day);
        validateMonth(month);
        validateYear(year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public CustomDate(String month, int day, int year) {
        validateDay(day);
        validateYear(year);
        validateStringMonth(month);
        stringMonth = month;
        this.day = day;
        this.year = year;
    }

    public CustomDate(int day, int year) {
        validateYear(year);
        validateYearRoundDayValue(day);
        this.day = day;
        this.year = year;
    }

    private void validateYearRoundDayValue(int day) {
        if(day < 1 || day > 366)
            throw new IllegalArgumentException("Invalid day input");
    }

    private void validateDay(int day) {
        if(day < 1 || day > 31)
            throw new IllegalArgumentException("Invalid day input");
    }
    private void validateMonth(int month) {
        if(month < 1 || month > 12)
            throw new IllegalArgumentException("Invalid month input");
    }

    private void validateYear(int year) {
        if(year < 1900 || year > 2050)
            throw new IllegalArgumentException("Invalid year input");
    }
    private void validateStringMonth(String month){
        month = month.toUpperCase();
        boolean validYear = month.equals("JANUARY") || month.equals("FEBRUARY") || month.equals("MARCH") || month.equals("APRIL")
                || month.equals("MAY") || month.equals("JUNE") || month.equals("JULY") || month.equals("AUGUST") || month.equals("SEPTEMBER")
                || month.equals("OCTOBER") || month.equals("NOVEMBER") || month.equals("DECEMBER");
        if(!validYear)
            throw new IllegalArgumentException("Invalid year input");
    }

    @Override
    public String toString() {
        return String.format("%02d%s%02d%s%04d", month, "/", day, "/", year);
    }

    public String getDate() {
        return stringMonth + " " + day + ", " + year;
    }

    public String getDayValueDate() {
        return String.format("%03d%s%d", day, " ", year);
    }
}
