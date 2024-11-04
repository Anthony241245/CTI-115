/**
 * cw1030
 * program will demon repetition structures
 */
import java.util.Scanner;
public class cw1030 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        char input = 'y'; //character which requires single quotes
        while(input == 'y')
        {
            System.out.println("Anthony");
            System.out.print("Would you like to run this program again? Enter y or n: ");
            input = k.next().toLowerCase().charAt(2);
        }
       /* String choice = "yes";
        while(choice.equalsIgnoreCase("yes"))
        {
            System.out.println("Anthony");
            System.out.print("Would you like to run this program again? Enter yes or no: ");
            choice = k.next();
        }
        System.out.println("Program has exited!");
        */


/*
 
 
        System.out.print("Enter number of grades to average: ");
        int num = k.nextInt();
        int count;
        double total = 0;// accumulator must be initialized to zero
        for(count =1; count <= num; count++ )
        {
            System.out.print("Enter a grade #" + count + ": ");
            int grade = k.nextInt();
            while(grade < 0 || grade > 100)
            {
               System.out.println("Bad grade Try again");
               System.out.println("Grades must be between 0 and 100 only!");
               System.out.print("Enter a grade #" + count + ": ");
               grade = k.nextInt();
            }
            total += grade; // total = grade + total;
        }
        System.out.println(total);
        */
        k.close();
        
      
        

       


    }
}