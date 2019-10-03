
public class Date {
    public static final String[] MONTHNAMES = {"January", "February",  "March", "April",
            "May", "June", "July", "August",  "September", "October", "November", "December"};
    public String LongFormOfDate() {
        return "the "+this.day+"th of "+MONTHNAMES[this.month-1]+", "+this.year;
    }
    public Date(String date) {
        this.day = Integer.parseInt(date.substring(0,2));
        this.month = Integer.parseInt(date.substring(3,5));
        this.year = Integer.parseInt(date.substring(6,10));
    }
    public Date() {
        super();
        java.time.LocalDate today = java.time.LocalDate.now();
        this.day = today.getDayOfMonth();
        this.month = today.getMonthValue();
        this.year = today.getYear();
    }
    public Date(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }
    private int day;
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    private int month;
    private int year;
    public String toString() {
        return this.day+"."+this.month+"."+this.year;
    }
    public boolean equals(Date another) {
        if (this.day == another.day && this.month == another.month && this.year == another.year) {
            return true;
        }
        else return false;
    }
    public static int getStringMonth(String string) {
        for(int i=0;i<12;i++)
            if(string.equalsIgnoreCase((MONTHNAMES[i]))) {
                return i+1;
            }
        return 0;
    }
}
