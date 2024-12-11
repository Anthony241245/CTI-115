/**
 * Raynor_FINALEXAM
 * Anthony Raynor
 * 12/11/24
 * Making a program that calculates the user acquisition cost
 */
import java.util.Scanner;
public class Raynor_FINALEXAM 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        displayInfo();
        double A = getAdvertisingCost(k);
        double M = getMarketingCost(k);
        double S = getSalesStaffCommm(k);
        int NC = getNewCustomers(k);
        double CAC = calCustomerAcqCost(k, A, M, S, NC);
        System.out.println("");
        System.out.println("");
        displayCAC(k, A, M, S, NC, CAC);






        k.close();
    }
    public static void displayInfo()
    {
        System.out.println("Anthony Raynor");
        System.out.println("12/11/24");
        System.out.println("Making a program that calculates the user acquisition cost");
    }
    public static double getAdvertisingCost(Scanner k)
    {
        System.out.print("Enter advertising cost: ");
        double  AdvertisingCost = k.nextDouble();
        return AdvertisingCost;
    }
    public static double getMarketingCost(Scanner k)
    {
        System.out.print("Enter Marketing  cost: ");
        double MarketingCost = k.nextDouble();
        return MarketingCost;
    }
    public static double getSalesStaffCommm(Scanner k)
    {
        System.out.print("Enter total sales staff commissions: ");
        double SalesStaffComm = k.nextDouble();
        return SalesStaffComm;
    }
    public static int getNewCustomers(Scanner k)
    {
        System.out.print("Enter the amount of new customers: ");
        int NewCustomers = k.nextInt();
        return NewCustomers;
    }
    public static double calCustomerAcqCost(Scanner k, double A, double M, double S, int NC)
    {
        double CalCustomerAcqC;
        CalCustomerAcqC = (A + M + S) / NC;
        return CalCustomerAcqC;
    }
    public static void displayCAC(Scanner k, double A, double M, double S, int NC, double CAC)
    {
        System.out.println("Advertising Cost: $" + A);
        System.out.println("Marketing Personal Salaries: $" + M);
        System.out.println("Sales Staff Commissions: $" + S);
        System.out.println("New Customers Acquired: " + NC);
        System.out.println("Customer Acquisition Cost: $" + CAC);


    }
}