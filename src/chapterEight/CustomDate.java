package chapterEight;

public class CustomDate {
    private final int month;
    private final int day;
    private final int year;

    public CustomDate(int month, int day, int year) {
        validateDay(day);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private void validateDay(int day) {
        if(day < 1 || day > 31)
            throw new IllegalArgumentException("Invalid day input");
    }

    @Override
    public String toString() {
        return String.format("%02d%s%02d%s%d", month, "/", day, "/", year);
    }
}
