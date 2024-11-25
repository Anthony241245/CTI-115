/**
 * M6HW1_Brown
 * Donte' Brown
 * This program calculates employee gross pay.
 */
import java.util.Scanner;
public class M6HW1_Brown 
{

    public static void main(String[] args) 
    {
        // variables
        float hours, payrate, gross;
        String name, user_response = "yes";
        //Scanner
        Scanner in = new Scanner(System.in);
        
        // While statement to reset the program
        while (user_response.equalsIgnoreCase("yes")) {
            // input
            System.out.print("Enter employee's name: ");
            name = in.next();
            System.out.print("Enter " + name + "'s hours worked: ");
            hours = in.nextInt();
            System.out.print("Enter " + name + "'s payrate: ");
            payrate = in.nextInt();
            // Calculations
            gross = payrate * hours;
            // Display results
            System.out.println("Employee name: " + name);
            System.out.println(name + "'s Payrate: " + payrate);
            System.out.println(name + "'s hours worked: " + hours);
            System.out.println(name + "'s Grosspay: " + gross);

            System.out.print("Would you like to run the program again? Enter yes to run again or no to end the program: ");
            user_response = in.next();
        }
        System.out.println("Program has ended.");
        in.close();
        
    }
}
