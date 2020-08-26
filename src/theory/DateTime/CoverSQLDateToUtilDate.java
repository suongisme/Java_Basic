package theory.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoverSQLDateToUtilDate {
    public static void main(String[] args) throws ParseException {
        // date util
        Date dateUtil = new Date();

        // convert date util to date sql
        java.sql.Date dateSQL = new java.sql.Date(dateUtil.getTime());


        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = "29/08/2001";
        // convert String to Date
        Date dateConverted = format1.parse(dateString);

    }
}
