import java.util.Scanner;

public class InputHelper {
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int num = 0;
        boolean check = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= min && num <= max) {
                    check = true;
                } else {
                    System.out.println("Input not within the range, please try again.");
                }
            } else {
                System.out.println("Invalid input, please try again.");
            }
            scan.nextLine();
        } while (!check);

        return num;
    }
}
