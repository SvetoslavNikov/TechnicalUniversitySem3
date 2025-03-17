package Java.Project_A_to_H_included;

import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {
        //input for the time
        LocalTime alarm = setAlarmHour();
        while(alarm.isAfter(LocalTime.now())){
            System.out.println(LocalTime.now());
            Thread.sleep(1000);
        }
        System.out.println("Hi");

    }

    public static LocalTime setAlarmHour(){
        Scanner scan = new Scanner(System.in);
        LocalTime time;
        while(true) {
            System.out.println("Enter time in format: HH:MM:SS");
            try {
                time = LocalTime.parse(scan.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect format!");
            }
        }
        System.out.println("Alarm set for: " + time);
        return time;
    }


}



