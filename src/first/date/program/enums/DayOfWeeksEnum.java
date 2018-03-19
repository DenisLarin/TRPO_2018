package first.date.program.enums;

public enum DayOfWeeksEnum {
    понедельник(1), вторник(2), среда(3), четверг(4), пятница(5), суббота(6), воскресенье(7);

    private int numberDay;

    DayOfWeeksEnum(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }
    public static DayOfWeeksEnum findDay(String day){
        DayOfWeeksEnum returnedDay = null;
        for (DayOfWeeksEnum d: DayOfWeeksEnum.values()) {
            if(day.equals(d.toString().toLowerCase())){
                returnedDay = d;
                break;
            }
        }
        return returnedDay;
    }
}

