package theory.DateTime;

import java.util.Calendar;
import java.util.Date;

public class ConvertDateToCalendar {
    public static void main(String[] args) {
        // convert date to Calendar
        Date dateNow = new Date();
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(dateNow);
        System.out.println(calNow.get(Calendar.YEAR));

        // convert calendar to date
        Calendar calNow2 = Calendar.getInstance();
        calNow2.set(2001, 8, 29);
        Date dateNow2 = calNow2.getTime();
        System.out.println(dateNow2);
    }
}
