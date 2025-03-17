package Java.Project_A_to_H_included;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock2 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime now = LocalTime.now();
        System.out.println(now);


        Runnable AlarmRunnable = new AlarmThread(setAlarmHour());
        Thread AlarmThread = new Thread(AlarmRunnable);
        AlarmThread.start();

        while(true){
            System.out.println("I am doing something else wtf");
            Thread.sleep(5000);
        }
    }


    public static LocalTime setAlarmHour(){
        Scanner scan = new Scanner(System.in);
        LocalTime time;
        while(true) {
            System.out.println("Enter time in format: HH:MM:SS");
            try {
                time = LocalTime.parse(scan.nextLine());
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Incorrect format!");
            }
        }
        System.out.println("Alarm set for: " + time);
        return time;
    }
}


class AlarmThread implements Runnable{

    private final LocalTime alarmTime;

    AlarmThread(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {
        LocalTime now = LocalTime.now();
        while(alarmTime.isAfter(now)){
            System.out.printf("Time is: %d: %d: %d\n",now.getHour(),now.getMinute(),now.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            now = LocalTime.now();
        }
        System.out.println("Wohooo alarming you");
        Thread.currentThread().interrupt();
        System.exit(0);
    }
}