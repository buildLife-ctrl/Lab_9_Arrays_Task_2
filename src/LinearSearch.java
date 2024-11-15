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

        //user inputs value for us to find
        int inputValue = InputHelper.getRangedInt(scan, "Enter a random number between 1 and 100 for us to find:", 1, 100);
        //finds how many times the value is shown and finds the position of the value the first time it is shown
        for (int i = 0; i < num.length; i++) {
            if (inputValue == num[i]) {
                arrayPosition = i;
                valuePostition = i + 1;
                valueAmount++;
                System.out.println("The number " + inputValue + " was found at array position " + arrayPosition + " and value position " + valuePostition + ".");
            }
        }
        //if the value is not found, states it, otherwise outputs the amount of times the value exists
        if (arrayPosition == 0) {
            System.out.println("Your value does not exist in this set of integers.");
        } else {
            System.out.println("The number " + inputValue + " was found " + valueAmount + " times.");
        }

        //resets for 2nd time
        arrayPosition = 0;
        valuePostition = 0;
        //second time it asks
        int inputValue2 = InputHelper.getRangedInt(scan, "\nEnter a random number between 1 and 100 for us to find:", 1, 100);
        //finds the place of the first inputted value.
        for (int i = 0; i < num.length; i++) {
            if (inputValue2 == num[i]) {
                arrayPosition = i;
                valuePostition = i + 1;
                break;
            }
        }
        //states where the first inputted value was found
        if (arrayPosition == 0) {
            System.out.println("Your value does not exist in this set of integers.");
        } else {
            System.out.println("The number " + inputValue2 + " was found at array position " + arrayPosition + " and value position " + valuePostition + ".");
        }
    }
}
