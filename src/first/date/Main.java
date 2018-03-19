package first.date;

import first.date.program.Date;

public class Main {
    public static void main(String[] args) {
        String dateinISO = "2018-03-16T18:00:00Z";
        Date date = new Date(dateinISO);
//        System.out.println(date.getNextDay());
        System.out.println(date.getStartOfWeek());
//        System.out.println(date.getEndOfWeek());
//        System.out.println(date.getStartOfMonth());
    }
}
