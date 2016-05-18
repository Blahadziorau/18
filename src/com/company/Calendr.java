package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by USER on 18.05.2016.
 */
public class Calendr {
    public static void main(String... args){
        Calendar calendar = new GregorianCalendar(2010, Calendar.APRIL, 10 ,12 , 24);
        calendar.set(Calendar.DST_OFFSET, 20*60*60*1000);
        SimpleDateFormat format=new SimpleDateFormat("d MMMM YYYY H mm");
        System.out.println(format.format(calendar.getTime()));
    }
}
