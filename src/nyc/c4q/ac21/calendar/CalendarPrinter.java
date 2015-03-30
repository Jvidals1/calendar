package nyc.c4q.ac21.calendar;

import java.util.Calendar;
import java.util.HashMap;

public class CalendarPrinter
{

    /**
     * Prints a calendar for a month.
     *
     * Prints the calendar in the traditional format with one week per line.
     * Each week starts on Sunday and shows the days of month for days in
     * that week.  The current date is marked with an asterisk.
     *
     * For example, for 2015-04-03, prints this:
     *DateTools.getMonthNames()
     *     April 2015
     *                  1   2   3*  4
     *      5   6   7   8   9  10  11
     *     12  13  14  15  16  17  18
     *     19  20  21  22  23  24  25
     *     26  27  28  29  30
     *
     * @param date
     *   The date containing the month to print.
     */
    public static void printMonthCalendar(Calendar date) {
        System.out.println("printMonthCalendar");
        // FIXME: Write this.
        // Use these methods to help you:
        //   DateTools.getMonthNames()

        HashMap<Integer,String> monthNames = DateTools.getMonthNames();
        System.out.print(monthNames.get(date.MONTH -1) + " " + DateTools.formatYear(date)); //Jan is defined at integer 0 and we are subtracting 1 to display the input date.


        //   DateTools.getNextDay() to loop through days in the month.



    }

}
