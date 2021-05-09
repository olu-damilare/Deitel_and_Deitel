package chapterFourteen;

public class DateFormat {
    private final int month;
    private final int day;
    private final int year;

    private String[] months = {"January", "February", "March", "April", "May", "June", "July",
                                "August", "September", "October", "November", "December"};

    public DateFormat(String date) {
        String[] splitDate = date.split("/");
        this.month = Integer.parseInt(splitDate[0]);
        this.day = Integer.parseInt(splitDate[1]);
        this.year = Integer.parseInt(splitDate[2]);
    }

    public int getNumericMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
       return months[month - 1];
    }

    @Override
    public String toString() {
        return getMonth() + " " + day + ", " + year;
    }
}
