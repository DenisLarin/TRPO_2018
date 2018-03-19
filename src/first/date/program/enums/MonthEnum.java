package first.date.program.enums;

public enum MonthEnum {
    Январь(31, 1), Февраль(28, 2, 29), Март(31, 3), Апрель(30, 4), Май(31, 5), Июнь(30, 6),
    Июль(31, 7), Август(31, 8), Сентябрь(30, 9), Октябрь(31, 10), Ноябрь(30, 11), Декабрь(31, 12);

    private int dayInMonth;
    private int dayInUnnormalMonth;
    private int indexMonth;

    MonthEnum(int dayInMonth, int indexMonth) {
        this.dayInMonth = dayInMonth;
        this.indexMonth = indexMonth;
        this.dayInUnnormalMonth = -1;
    }

    MonthEnum(int dayInMonth, int indexMonth, int dayInUnnormalMonth) {
        this.dayInMonth = dayInMonth;
        this.dayInUnnormalMonth = dayInUnnormalMonth;
        this.indexMonth = indexMonth;
    }

    public int getDayInMonth() {
        return dayInMonth;
    }

    public void setDayInMonth(int dayInMonth) {
        this.dayInMonth = dayInMonth;
    }

    public int getDayInUnnormalMonth() {
        return dayInUnnormalMonth;
    }

    public void setDayInUnnormalMonth(int dayInUnnormalMonth) {
        this.dayInUnnormalMonth = dayInUnnormalMonth;
    }

    public int getIndexMonth() {
        return indexMonth;
    }

    public void setIndexMonth(int indexMonth) {
        this.indexMonth = indexMonth;
    }

    public static MonthEnum getByIndex(int indexMonth) {
        MonthEnum returnedMonth = null;
        for (MonthEnum m : MonthEnum.values()) {
            if(indexMonth == m.indexMonth) {
                returnedMonth = m;
                break;
            }
        }
        return returnedMonth;
    }
}
