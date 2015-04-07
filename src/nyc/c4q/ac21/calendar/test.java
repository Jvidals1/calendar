package nyc.c4q.ac21.calendar;

/**
 * Created by c4q-vanice on 3/30/15.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class test {
    public static void main(String[] args) {
        System.out.println(DST.isDST(DateTools.parseDate("2020-03-08")));

    }
}
