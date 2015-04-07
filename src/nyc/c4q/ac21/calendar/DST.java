package nyc.c4q.ac21.calendar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Daylight Savings Time (DST) computations.
 */
public class DST
{

    /**
     * Populates hash maps with the start and end time for DST in each year.
     *
     * @param startDates A hash map of the start date of DST in each year.
     * @param endDates   A hash map of the end date of DST in each year.
     */
    public static void getDSTDates(HashMap<Integer, Calendar> startDates, HashMap<Integer, Calendar> endDates)
    {
        ArrayList<String> lines = FileTools.readLinesFromFile("dst.csv");
        //ArrayList<Calendar> Clines = new ArrayList<Calendar>();
        for(int i = 0; i < lines.size(); i++)
        {
            String start = lines.get(0);
            String end = lines.get(1);
            Calendar stdate = DateTools.parseDate(start);
            Calendar endate = DateTools.parseDate(end);
            Integer styear = Integer.parseInt(DateTools.getYear(stdate));
            Integer enyear = Integer.parseInt(DateTools.getYear(endate));

            if(! startDates.containsKey(styear))
            {
                startDates.put(styear, stdate);
            }
            if(! endDates.containsKey(enyear))
            {
                endDates.put(enyear, endate);
            }

        }
    }

    /**
     * Returns true if 'date' is during Daylight Savings Time.
     *
     * @param date The date to check.
     * @return True if DST is in effect on this date.
     */
    public static boolean isDST(Calendar date)
    {
        // Create hash maps to contain the start and end dates for DST in each year.
        HashMap<Integer, Calendar> dstStartDates = new HashMap<Integer, Calendar>();
        HashMap<Integer, Calendar> dstEndDates = new HashMap<Integer, Calendar>();
        DST.getDSTDates(dstStartDates, dstEndDates);

        Integer year = Integer.parseInt(DateTools.getYear(date));

        if(date.after(dstStartDates.get(year)) && date.before(dstEndDates.get(year)))
        {
            return true;
        }
        else if(date.equals(dstStartDates.get(year)) || date.equals(dstEndDates.get(year)))
        {
            return true;
        }
        return false;
    }

}
