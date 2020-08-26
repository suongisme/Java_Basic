package theory.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateExample {
    public static void main(String[] args) {
        SimpleDateFormat formatDate = new SimpleDateFormat("MMMM, dd yyyy hh:mm:ss");
        Date dateCurrent = new Date();
        System.out.println("Date Current 1: "+formatDate.format(dateCurrent));

        try {
            Thread.sleep(TimeUnit.MILLISECONDS.toSeconds(5000));
        } catch (Exception e) {
            e.getStackTrace();
        }

        long millisecondCurrent = System.currentTimeMillis();
        Date dateCurrent2 = new Date(millisecondCurrent);
        System.out.println("Date Current 2: "+formatDate.format(dateCurrent2));
        System.out.println();

        // i < 0: dateCurrent < dateCurrent2
        // i = 0: dateCurrent = dateCurrent2
        // i > 0: dateCurrent > dateCurrent2
        int i = dateCurrent.compareTo(dateCurrent2);
        System.out.println("Date Current 1 CompareTo Date Current 2: "+i);

        boolean before = dateCurrent.before(dateCurrent2);
        System.out.println("Date Current 1 Before Date Current 2 is: " + before);

        boolean after = dateCurrent.after(dateCurrent2);
        System.out.println("Date Current 1 After Date Current 2 is: " + after);

    }
}
