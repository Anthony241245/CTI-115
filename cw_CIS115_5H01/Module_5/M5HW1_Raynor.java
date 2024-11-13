import java.util.Scanner;

/**
 * M5HW1_Raynor
 */
public class M5HW1_Raynor 
{

    public static void main(String[] args) 
    {
        char input = 'y';
    while (input == 'y')
    {
      double average,total = 0;  
      int count =0, num;   
        char grade;
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter number of grades to average: ");
        int num_grades = k.nextInt();

            do
            {
               
                count++;
                System.out.print("Enter grade #"  + count + ": ");  
                num = k.nextInt();
 
             while (num < 0 || num > 100)
             {
             System.out.println("Error! Please input valid grade");
             System.out.println("Grades must be from 0-100");
             System.out.print("Enter grade #"  + count + " again: ");  
             num = k.nextInt();
             }
             total = total + num;
                
            }
            while(count < num_grades);
               
              average = total / num_grades;  
                    
            
            
            if (average >= 90)
                {
                    grade = 'A';
                }
            else if (average >= 80)
                {
                    grade = 'B';
                }
            else if (average >= 70)
                {
                    grade = 'C';
                }
            else if (average >= 60)
                {
                    grade = 'D';
                }
            else
                {
                    grade = 'F';
                }
            
            System.out.println("Grade is " + grade); 
           
               System.out.print("Would you like to run this program again Enter y or n: ");
               input = k.next().toLowerCase().charAt(0);
        }
    }
}