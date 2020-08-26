package theory.DateTime;

import java.util.concurrent.TimeUnit;

public class CurrentTimeExample {
    // this method to sum from 0 to 100
    public static int sum() {
        int sum = 0;
        for (int i=0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    // revise sum method
    // parameter is the number of revise
    public static void doJob(int x) {
        for (int i = 0; i <= x; i++) {
            int s = sum();
            System.out.println(i+": "+s);
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        doJob(1000000);

        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("Start Time: " +startTime+" Milliseconds");
        System.out.println("End Time: "+endTime+" Milliseconds");

        // distance from start to end: Milliseconds
        long totalMilliseconds = endTime-startTime;
        System.out.println("Total: "+totalMilliseconds+" Milliseconds");

        // distance from start to end: Seconds
        // convert millisecond to second
        long totalSeconds = TimeUnit.SECONDS.convert(totalMilliseconds, TimeUnit.MILLISECONDS);
        System.out.println("Total: " +totalSeconds+" Seconds");

        // distance from start to end: Minutes
        // convert second to minute
        double totalMinute = TimeUnit.MINUTES.convert(totalSeconds, TimeUnit.SECONDS);
        System.out.println("Total: " + totalMinute+" Minutes");

        // distance from start to end: Hours
        // convert minute to hour
        long totalHour = TimeUnit.SECONDS.toHours((long)totalMinute);
        System.out.println("Total: "+totalHour+" Hours");
        System.out.println("-------------------------------------------");

        // beside
        long minutes = 60;
        long hours = TimeUnit.MINUTES.toHours(minutes);
        System.out.println("P/s: "+minutes+" minute = "+hours+" hour");
    }

}
