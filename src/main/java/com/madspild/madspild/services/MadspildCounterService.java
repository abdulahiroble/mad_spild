package com.madspild.madspild.services;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MadspildCounterService {

    public String calcFoodWaste(){
        Calendar date1 = new GregorianCalendar(2020, Calendar.OCTOBER, 1);
        Calendar date2 = Calendar.getInstance();

        final double MADSPILD_PER_Dag = 227000.00/365;

        double numOfDays = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000.00/60/60/24;

        double product = MADSPILD_PER_Dag * numOfDays;

        double rounded = Math.round(product*10.0)/10.0;

        return "Madspild i den danske servicesektor siden Oktober den 1. 2020: "+rounded+" tons.";
    }
}
