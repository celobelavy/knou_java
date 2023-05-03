public class Date {
    int year;
    String month;
    int day;
    Date() {
        this.year = 2023;
        this.month = "4월";
        this.day = 23;
    }
    Date(int year) {
        this.year  = year;
        this.month = "4월";
        this.day = 23;
    }
    Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public String toString() {
        return "Date [year = " + year + ", month = " + month + ", day = " + day + "]";
    }
}
