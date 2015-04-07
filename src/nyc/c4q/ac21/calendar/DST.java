package nyc.c4q.ac21.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
 * Daylight Savings Time (DST) computations.
 */
public class DST {

    /**
     * Populates hash maps with the start and end time for DST in each year.
     * @param startDates
     *   A hash map of the start date of DST in each year.
     * @param endDates
     *   A hash map of the end date of DST in each year.
     */
    public static void getDSTDates(HashMap<Integer, Calendar> startDates, HashMap<Integer, Calendar> endDates) {
        ArrayList<String> lines = FileTools.readLinesFromFile("DST.csv");
        Calendar cal;
        String str;
        Integer year;

        for (String date : lines) {
            String[] parsed = date.split(",");

            for (int i=0; i<parsed.length; i++) {
                str = parsed[i];
                if (i % 2 == 0) {
                    year = Integer.valueOf(str.substring(0, 4));
                    cal = DateTools.parseDate(str);
                    startDates.put(year, cal);
                } else {
                    year = Integer.valueOf(str.substring(0, 4));
                    cal = DateTools.parseDate(str);
                    endDates.put(year, cal);
                }
            }
        }
    }


    // FIXME: Write this code!
    // Each line in the file is of the form "start,end", where both dates
    // are in the same year.  This represents the dates DST starts and
    // ends in this year.
    //
    // Use DateTools.parseDate.




    /**
     * Returns true if 'date' is during Daylight Savings Time.
     * @param date
     *   The date to check.
     * @return
     *   True if DST is in effect on this date.
     */
    public static boolean isDST(Calendar date) {
        // Create hash maps to contain the start and end dates for DST in each year.
        HashMap<Integer, Calendar> dstStartDates = new HashMap<Integer, Calendar>();
        HashMap<Integer, Calendar> dstEndDates = new HashMap<Integer, Calendar>();
        // Populate them.
        DST.getDSTDates(dstStartDates, dstEndDates);
        boolean isDst =false;
        int year = date.get(Calendar.YEAR);
        if(date.after(dstStartDates.get(year))&&date.before(dstEndDates.get(year))){
            isDst=true;
        }
        // FIXME: Write this code!
        return isDst;  // Change this!
    }
    public static void main(String[] args){
        System.out.println(isDST(DateTools.parseDate("2015-03-30")));
    }

}
