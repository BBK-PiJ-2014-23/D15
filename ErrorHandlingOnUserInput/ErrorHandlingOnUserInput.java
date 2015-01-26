import java.util.*;

/**
 * Write a description of class sdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ErrorHandlingOnUserInput
{
    public static void main (String[] args) {
        int current = 0;
        int total = 0;
        int i = 0;
        for (i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            try {
                current = sc.nextInt();
            } catch (InputMismatchException ex) {
                i--;
                System.out.println("What you entered is not an integer number!");
            }
            total += current;
        }
        int mean = total / i;
        System.out.println("The mean average is: " + mean);
    }
}
