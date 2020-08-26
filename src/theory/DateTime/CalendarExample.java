package theory.DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

    public static void showCalendar(Calendar x) {
        int year = x.get(Calendar.YEAR);
        int month = x.get(Calendar.MONTH);
        int day = x.get(Calendar.DAY_OF_MONTH);
        int hour = x.get(Calendar.HOUR_OF_DAY);
        int minute = x.get(Calendar.MINUTE);
        int second = x.get(Calendar.SECOND);

        System.out.println("\t"+year + "-" +month +"-"+ day +" "+ hour +":"+ minute +":"+ second);
    }

    public static void main(String[] args) {
        // create calendar using timezone and locale on the computer
        Calendar calNow = Calendar.getInstance();
        System.out.println("Calendar default: ");
        showCalendar(calNow);

        // roll: don't change other field of calendar
        // just raise one day
        calNow.roll(Calendar.DAY_OF_MONTH, true);
        System.out.println("\nCalendar after roll 1 day");
        showCalendar(calNow);

        // just raise twenty hours, other field such as day, month, etc remain
        calNow.roll(Calendar.HOUR_OF_DAY, 20);
        System.out.println("\nCalendar after roll 20 hours");
        showCalendar(calNow);

        // add: can change other field of calendar
        // raise ten hours (Maybe, it also raise day of month)
        calNow.add(Calendar.HOUR_OF_DAY, 20);
        System.out.println("\nCalendar after add 20 hours");
        showCalendar(calNow);
    }
}
