package theory.regualarexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingMatcherAndPattern {


    public static void main(String[] args) {
        usingGroup();
    }

    public static void usingGroup() {
        final String TEXT = "int aa = 100; int b = 200; float c = 300; int suong != 500";
        final String REGEX = "(?<declare>\\s*(int|float)\\s+[a-z]+\\s*)(?<compare> (=|!=))(?<value>\\s*\\d+\\s*)";

        Pattern pa = Pattern.compile(REGEX);
        Matcher ma = pa.matcher(TEXT);

        while (ma.find()) {
            System.out.println("Group: "+ma.group());
            System.out.println("Declare: "+ma.group("declare"));
            System.out.println("Compare: "+ma.group("compare"));
            System.out.println("value: "+ma.group("value"));
            System.out.println("------------------------------------");
        }
    }

    public static void usingLookingAt() {
        final String COUNTRY1 = "iran";
        final String COUNTRY2 = "iraq";

        final String REGEX = "^|.[ae]";

        Pattern pa = Pattern.compile(REGEX, 2);
        Matcher ma = pa.matcher(COUNTRY1);

        System.out.println("LookingAt: "+ma.lookingAt());
        System.out.println("Match: "+ma.matches());

        ma.reset(COUNTRY2);
        System.out.println("LookingAt: "+ma.lookingAt());
        System.out.println("Match: "+ma.matches());
    }


    public static void usingNormal() {
        final String TEXT = "This \t is a \t\t\t String";
        String regex = "\\s+";
        Pattern pa = Pattern.compile(regex);
        Matcher ma = pa.matcher(TEXT);

        findMatch(ma);
        findMatch(ma);
        findMatch(ma);
        findMatch(ma);
    }

    public static void findMatch(Matcher x) {
        boolean isFound = x.find();
        System.out.println("Found: "+isFound);
        if (isFound) {
            int start = x.start();
            int end = x.end();
            String group = x.group();
            System.out.println("Start: "+start+" = "+"End: "+end+" = "+"Group: "+group );
        } else {
            System.out.println("Not Found This Regex!");
        }

    }
}
