package lab2.task1;

import java.util.GregorianCalendar;

public class Main {
    private static void printDate(GregorianCalendar date) {
        System.out.printf("""
                Year: %s
                Month: %s
                Day of manth: %s
                -------------------------------------
                """, date.get(GregorianCalendar.YEAR),
                date.get(GregorianCalendar.MONTH) + 1,
                date.get(GregorianCalendar.DAY_OF_MONTH));
    }

    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();

        printDate(date);

        date.setTimeInMillis(1234567898765L);

        printDate(date);
    }

}
