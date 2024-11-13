import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int position = 0;
        int valueAmount = 0;
        int arrayPosition = 0;
        int valuePostition;

        //prints the random values assigned
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            position += 1;
            num[i] = rand.nextInt(101);
            System.out.println("Value " + position + " | " + num[i]);
        }

        int inputValue = InputHelper.getRangedInt(scan, "Enter a random number between 1 and 100:", 1, 100);
        for (int i = 0; i < num.length; i++) {
            if (inputValue == num[i]) {
                arrayPosition = i;
                valuePostition = i + 1;
                valueAmount++;
                if (valueAmount == 1) {
                    System.out.println("The number " + inputValue + " was found at array position " + arrayPosition + " and value position " + valuePostition + ".");
                }
            }
        }

        if (arrayPosition == 0) {
            System.out.println("Your value does not exist in this set of integers.");
        } else {
            System.out.println("The number " + inputValue + " was found " + valueAmount + " times.");
        }
    }
}
