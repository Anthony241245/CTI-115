/**
 * Raynor_FinalExam
 * Anthony Raynor
 * 12/9/24
 */
import java.util.Scanner;
public class Raynor_FinalExam 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        displayinfo();
        double rate = getRate(k);
        int hours = getHours(k);
        double gross = calculateGrossPay(rate, hours);
        //System.out.println("The pay rate is $" + rate);
        //System.out.println("The hours worked are " + hours);
        //System.out.println("The gross pay is $" + gross);
        displayRHGrossPay(rate, hours, gross);
        k.close();
    }
    public static void displayinfo()
    {
        System.out.println("Anthony Raynor");
        System.out.println("12/9/24");
        System.out.println("Make a Method that will calculate the gross pay for an indiviual");
        
    }
    public static double getRate(Scanner k)
    {
        System.out.print("Enter pay rate: ");
        double pay_rate = k.nextDouble();
        return pay_rate;
    }
    public static int getHours(Scanner k)
    {
        System.out.print("Enter the amount of hours you worked: ");
        int hours_worked = k.nextInt();
        return hours_worked;
    }
    public static double calculateGrossPay( double rate, int hours)
    {
        double gross_pay;
        gross_pay = rate * hours;
        return gross_pay;
    }
    public static void displayRHGrossPay(double rate, int hours, double gross)
    {
        System.out.println("The pay rate is $" + rate);
        System.out.println("The hours worked are " + hours);
        System.out.println("The gross pay is $" + gross);
        
    }
    

    
}