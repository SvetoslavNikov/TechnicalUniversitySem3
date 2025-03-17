package Java.Project_A_to_H_included;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock4 {

    public static void main(String[] args) {
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\Lenovo\\IdeaProjects\\old\\TechnicalUniversitySem3\\src\\Java\\Project_A_to_H_included\\mixkit-short-rooster-crowing-2470.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }
        }

        AlarmClock3 alarmClock = new AlarmClock3(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}

class AlarmClock3 implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    // Constructor name fixed to match class name
    AlarmClock3(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        // Run until the alarm time is reached
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                // Display the current time
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        // Alarm time reached, print message and play sound
        System.out.println("\n*ALARM NOISES*");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Wait for user to press Enter to stop the alarm
            System.out.print("Press Enter to stop the alarm: ");
            scanner.nextLine();

            clip.stop();
            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
