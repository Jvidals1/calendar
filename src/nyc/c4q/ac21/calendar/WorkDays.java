package nyc.c4q.ac21.calendar;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class WorkDays {

    /**
     * Builds a map from day of week to whether this is a work day.
     * @return
     *   A map with keys 'Calendar.MONDAY' through 'Calendar.SUNDAY', indicating whether each is a work day.
     */
    public static HashMap<Integer, Boolean> getWorkDays() {
        // FIXME: Write this.

        HashMap<Integer, Boolean> calendar = new HashMap<Integer, Boolean>();
        //workdays
        calendar.put(Calendar.SUNDAY, false);   //Sunday
        calendar.put(Calendar.MONDAY, true);    //Monday
        calendar.put(Calendar.TUESDAY, true);   //Tuesday
        calendar.put(Calendar.WEDNESDAY, true); //Wednesday
        calendar.put(Calendar.THURSDAY, true);  //Thursday
        calendar.put(Calendar.FRIDAY, true);    //Friday
        calendar.put(Calendar.SATURDAY, false); //Saturday

        return calendar;
    }

    public static void main(String[] args) {

     System.out.println(getWorkDays());
        System.out.println(getWorkDays().get(Calendar.SATURDAY));
        System.out.println(getWorkDays().get(1)); // entering an index
        System.out.print(Calendar.JANUARY);



    }

}
