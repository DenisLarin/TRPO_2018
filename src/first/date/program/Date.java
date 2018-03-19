package first.date.program;


import first.date.program.Interfaces.DateI;
import first.date.program.enums.DayOfWeeksEnum;
import first.date.program.enums.MonthEnum;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date implements DateI {
    private int year;
    private int month;
    private int day;
    private int hours;
    private int minute;
    private int seconds;
    private boolean isUnnormalYear;
    private String ISOdate;

    public Date(String ISOdate) {
        this.ISOdate = ISOdate;
        Pattern dmy = Pattern.compile("^([\\d]{4}).(\\d{2}).(\\d{2})");
        Pattern time = Pattern.compile("([0-1]\\d|2[0-3]).([0-5]\\d).([0-5]\\d)");
        Matcher dmyMatcher = dmy.matcher(ISOdate);

        if (dmyMatcher.find()) {
            this.year = Integer.valueOf(ISOdate.substring(0, 4));
            this.month = Integer.valueOf(ISOdate.substring(5, 7));
            this.day = Integer.valueOf(ISOdate.substring(8, 10));
        }
        ISOdate = dmyMatcher.replaceFirst("");
        Matcher timeMatcher = time.matcher(ISOdate);
        if (timeMatcher.find()) {
            this.hours = Integer.valueOf(ISOdate.substring(timeMatcher.start(), 3));
            this.minute = Integer.valueOf(ISOdate.substring(4, 6));
            this.seconds = Integer.valueOf(ISOdate.substring(7, timeMatcher.end()));
        }
        checkYear();
    }

    private void checkYear() {
        if (month % 4 != 0)
            isUnnormalYear = false;
        else if (month % 100 == 0 && month % 400 == 0)
            isUnnormalYear = false;
        else isUnnormalYear = true;
    }

    @Override
    public String getNextDay() {
        makeDefaultTime();
        String nextDayString = "";
        if (MonthEnum.getByIndex(month).toString().equals("Февраль")) {
            int days = isUnnormalYear ? MonthEnum.Февраль.getDayInUnnormalMonth() : MonthEnum.Февраль.getDayInMonth();
            if (days > this.day + 1)
                this.day++;
            else
                getNextMonth();
        } else {
            if (MonthEnum.getByIndex(month).getDayInMonth() > this.day + 1)
                this.day++;
            else
                getNextMonth();
        }
        return parseStringToISO();
    }

    public void swipeDay(int numberSwipeDay) {
        if (numberSwipeDay == 0)
            return;
        if (MonthEnum.getByIndex(month).getDayInMonth() + numberSwipeDay <= 0) {
            swipeMonth(1);
        } else {
            this.day += numberSwipeDay;
        }
    }

    public void swipeMonth(int numberSwipeMonth) {
        if (numberSwipeMonth == 0)
            return;
        if(MonthEnum.getByIndex(month).getIndexMonth() - numberSwipeMonth <=0)
            swipeYear(0);
        else
            month+=numberSwipeMonth;
    }

    public void swipeYear(int numberSwipeYear) {
        if (numberSwipeYear == 0)
            return;
        this.year+=numberSwipeYear;
        checkYear();
    }
    public void swipeYear(int numberSwipeYear, boolean isreverseSwipe){
        if(isreverseSwipe)
            swipeYear(numberSwipeYear*-1);
        else swipeYear(numberSwipeYear);
    }


    public void swipeMonth(int numberSwipeMonth, boolean isreverseSwipe) {
        if (isreverseSwipe)
            swipeMonth(numberSwipeMonth * -1);
        else
            swipeMonth(numberSwipeMonth);
    }


    public void swipeDay(int numberSwipeDay, boolean isreverseSwipe) {
        if (isreverseSwipe)
            swipeDay(numberSwipeDay * -1);
        else
            swipeDay(numberSwipeDay);
    }

    private void makeDefaultTime() {
        this.seconds = 0;
        this.minute = 0;
        this.hours = 0;
    }

    private String parseStringToISO() {
        String parsedString = "";
        String timeDel = ":";
        String mDel = "-";

        parsedString = this.year + mDel + (this.month < 10 ? "0" : "") + this.month + mDel + (this.day < 10 ? "0" : "") + this.day + "T" + (this.hours < 10 ? "0" : "") + this.hours + timeDel + (this.minute < 10 ? "0" : "") + this.minute + timeDel + (this.seconds < 10 ? "0" : "") + this.seconds + "Z";

        return parsedString;
    }

    @Override
    public String getStartOfWeek() {
        makeDefaultTime();
        int numberDayInWeek = getNumberDay();
        swipeDay(numberDayInWeek-1,true);
        return parseStringToISO();
    }
    private int getNumberDay(){
        String temp = this.year + "-" + this.month + "-" + this.day;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
        java.util.Date dayWeek = null;
        try {
            dayWeek = format.parse(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DayOfWeeksEnum.findDay(new SimpleDateFormat("EEEE", new Locale("ru")).format(dayWeek)).getNumberDay();
    }

    @Override
    public String getEndOfWeek() {
        makeDefaultTime();
        int numberDayInWeek = getNumberDay();
        swipeDay(7-numberDayInWeek);
        return parseStringToISO();
    }

    @Override
    public String getStartOfMonth() {
        makeDefaultTime();
        makeDefaultDate();
        return parseStringToISO();
    }

    private void makeDefaultDate() {
        this.day = 1;
    }


    private void getNextMonth() {
        if (MonthEnum.getByIndex(month).toString().equals("Январь"))
            getNextYear();
        else
            this.month++;
    }

    private void getNextYear() {
        this.year++;
        checkYear();
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hours=" + hours +
                ", minute=" + minute +
                ", seconds=" + seconds +
                '}';
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getISOdate() {
        return ISOdate;
    }

    public void setISOdate(String ISOdate) {
        this.ISOdate = ISOdate;
    }
}

