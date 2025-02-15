// Exercise #3

import java.util.Scanner;

public class ReversingChains {
    public ReversingChains() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a chains of text: ");
        String text = scanner.nextLine();
        String inverted = "";

        for(int i = text.length() - 1; i >= 0; --i) {
            inverted = inverted + text.charAt(i);
        }

        System.out.println(" Text inverted: " + inverted);
        scanner.close();
    }
}
