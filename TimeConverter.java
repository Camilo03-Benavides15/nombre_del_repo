// Exercise #2

import java.util.Scanner;

public class TimeConverter {
    public TimeConverter() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the days: ");
        int days = scanner.nextInt();
        System.out.println(" Enter the hours: ");
        int hours = scanner.nextInt();
        System.out.println(" Enter the minutes ");
        int minutes = scanner.nextInt();
        System.out.println(" Enter the seconds: ");
        int seconds = scanner.nextInt();
        long millisecond = (long)days * 8640000L + (long)hours * 3600000L + (long)minutes * 60000L + (long)seconds * 1000L;
        System.out.println("The time in millisecond is: " + millisecond);
        scanner.close();
    }
}