package com.company.java.assignment4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Assignment4 {
    public void getKYCDates() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        //int n =scanner.nextInt();
        int n = Integer.parseInt(scanner.nextLine());
        String dates;
        List<String> outputString=new ArrayList<>();
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");

        for (int i = 0; i < n; i++) {
            dates = scanner.nextLine();
            var date = dates.split(" ");

            Date signatureDate = formatter2.parse(date[0]);
            Date presentDate = formatter2.parse(date[1]);

            Calendar presentDateonCalender = Calendar.getInstance();
            presentDateonCalender.setTime(presentDate);

            // convert date to calendar
            Calendar signatureDateOnCalendar = Calendar.getInstance();
            signatureDateOnCalendar.setTime(signatureDate);
            signatureDateOnCalendar.set(Calendar.YEAR, presentDateonCalender.get(Calendar.YEAR));


            Calendar startingDate=Calendar.getInstance();
            startingDate.set(signatureDateOnCalendar.get(Calendar.YEAR),signatureDateOnCalendar.get(Calendar.MONTH),signatureDateOnCalendar.get(Calendar.DATE),0,0,0);
            Calendar endindDate=signatureDateOnCalendar;
            startingDate.add(Calendar.DAY_OF_MONTH, -30);

            if (startingDate.getTime().compareTo(presentDate)==1)
            {
                outputString.add("No Range");
                continue;
            }

            endindDate.add(Calendar.DAY_OF_MONTH, 30);

            if(!endindDate.before(presentDateonCalender))
            {
                endindDate=presentDateonCalender;
            }

            outputString.add(formatter2.format(startingDate.getTime()).toString() + " " + formatter2.format(endindDate.getTime()).toString());
        }
        for (String str:outputString) {
            System.out.println(str);
        }
    }
}