package Java.I_Java8_Features;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesTimes {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm   dd-MM-yyyy");
        String formattedDT = formatter.format(localDateTime);
        //2025-03-14T21:47:17.920014400 -> 21:47   14-03-2025

        LocalDateTime myBirthDay = LocalDateTime.of(2002,6,22,12,00);
        LocalDateTime herBirthDay = LocalDateTime.of(2007,6,22,12,00);
        if(myBirthDay.isBefore(herBirthDay)){
            int result = myBirthDay.compareTo(herBirthDay); //-5 years,
            // it returns the first biggest diff
            System.out.println("I am older " + result + " years then her");
        } else if (myBirthDay.isEqual(herBirthDay)){

        }
        else if (myBirthDay.isAfter(herBirthDay)) {

        }


    }
}
