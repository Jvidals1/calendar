package nyc.c4q.ac21.calendar;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Calendar;
import java.util.HashMap;

public class CalendarPrinter {

    /**
     * Prints a calendar for a month.
     * <p/>
     * Prints the calendar in the traditional format with one week per line.
     * Each week starts on Sunday and shows the days of month for days in
     * that week.  The current date is marked with an asterisk.
     * <p/>
     * For example, for 2015-04-03, prints this:
     * DateTools.getMonthNames()
     * April 2015
     * 1   2   3*  4
     * 5   6   7   8   9  10  11
     * 12  13  14  15  16  17  18
     * 19  20  21  22  23  24  25
     * 26  27  28  29  30
     *
     * @param date The date containing the month to print.
     */
    public static void printMonthCalendar(Calendar date) {
        System.out.println("printMonthCalendar");
        // FIXME: Write this.
        // Use these methods to help you:
        //   DateTools.getMonthNames()

        //Create a Hashmap that prints monthNames
        HashMap<Integer, String> monthNames = DateTools.getMonthNames();
       // System.out.print(monthNames.get(Calendar.MONTH -1) + " " + DateTools.formatYear(date)); //Jan is defined at integer 0 and we are subtracting 1 to display the input date.
        System.out.print(DateTools.formatDate(printMonthCalendar(s);

        //   DateTools.getNextDay() to loop through days in the month.

    }

    public static int getNumOfDaysMonth(int year, int month) {

        //For months w/31 days
        if (Calendar.JANUARY == month || Calendar.MARCH == month || Calendar.MAY == month || Calendar.JULY == month ||
                Calendar.AUGUST == month || Calendar.OCTOBER == month || Calendar.DECEMBER == month)
            return 31;
        //For months w/ 30 days
        if ( Calendar.APRIL == month || Calendar.JUNE == month || Calendar.SEPTEMBER == month || Calendar.NOVEMBER == month)
            return 30;
        //For February Leap Year ,
        if (Calendar.FEBRUARY == month)
                if (isLeapYear(year))
                    return 29;    //Leap year day
                else              //Not Leap year
                    return 28;

            return 0;            //Not in the the month of Feb.

        }

    //Reference Wikipedia Leap Year for explanation. Link: http://en.wikipedia.org/wiki/Leap_year
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;

        return false;
    }


    /** Print month body */
    static void printMonthBody(int startDay, int numOfDaysInMonth) {
        // Create a space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numOfDaysInMonth; i++) {
            if (i < 10)
                System.out.print("   " + i);
            else
                System.out.print("  " + i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


}


