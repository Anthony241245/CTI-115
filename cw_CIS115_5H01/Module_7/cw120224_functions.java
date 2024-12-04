/**
 * cw120224_functions
 */
import java.util.Scanner;
public class cw120224_functions 
{

    public static void main(String[] args) 
    {
      
        //all calls will come from main();
        Scanner in = new Scanner(System.in);
        int number = getNumGrades(in);
        int tot = getGrades(in, number);
        double ave = getAverage(number, tot);
        //System.out.println(ave);
        char letter = getLetterGrade(ave);
        System.out.println(letter);
        displayGrades(ave, letter);
        //System.out.println(tot);
        //System.out.println(number);
        in.close();

    }
    public static int getNumGrades(Scanner in)
    {
        System.out.print("Enter the # of grades to average: ");
        int num = in.nextInt();
        return num;
    }
    public static int getGrades(Scanner in, int n)
    {
        int i, grade, total = 0;
        for(i =0; i < n; i++)
        {
            System.out.print("Enter a grade: ");
            grade = in.nextInt();
            total += grade;
        }
        return total;
    }
    public static double getAverage(int num, double total)
    {
        return total / num;
        //int average = total / num;
        //return average;


    }
    public static char getLetterGrade(double ave) 
    {
        
        char letter;
        if (ave >= 89.5) 
        {
            letter = 'A';
            
        }
        else   
        {
            letter = 'B';
        
        }
        return letter;
        
        

        
    }
    public static void displayGrades(double average, char grade)
    {
        System.out.println(String.format("%.2f",average));
        System.out.println(grade);
    }
    
    

}