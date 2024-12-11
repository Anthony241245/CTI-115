import java.util.Scanner;

/**
 * M7HW1_Raynor
 * Anthony Raynor
 * 12/9/24
 * 
 */

public class M7HW1_Raynor 
{

    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();
                int widgetsSold = getSales();
                int widgetsReturned = getReturns();
                int netWidgetsSold = calWidSold(widgetsSold, widgetsReturned);
                System.out.println(netWidgetsSold);
                displayValues(netWidgetsSold, widgetsReturned, netWidgetsSold, widgetsSold, widgetsReturned, netWidgetsSold);
                // all calls to your function/methods should come from runProgram()  method only
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = in.next();
                System.out.println();
            }
        in.close();
        System.out.println("Program has terminated!");
    }
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Anthony");
        System.out.println();
        System.out.println("M7HW1 solution");
        System.out.println();
    }
    // create your functions/methods here
    public static int getSales()
    {
        int total = 0;
        int count, week;
        Scanner k = new Scanner(System.in);
            
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets sold in week " + count + ": ");
            week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int getReturns()
    {
        int total = 0;
        int count, week;
        Scanner k = new Scanner(System.in);
            
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets returned in week " + count + ": ");
            week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int calWidSold(int widgetsSold, int widgetsReturned)
    {
        return widgetsSold - widgetsReturned;

    }
    public static double calWidSalesAmt(double netWidgetsSold) 
    {
        double widgetPrice = 10.00;  
        return netWidgetsSold * widgetPrice;
    }
    public static double calComm(double netWidgetsSold, double salesAmount) 
    {
        double commissionRate = 0.05; 
        if (netWidgetsSold >= 100) {
            commissionRate = 0.10;  
        } else if (netWidgetsSold < 50) {
            commissionRate = 0.03;  
        }
        return salesAmount * commissionRate;
    }
    public static double calSalary(double commission) 
    {
        double baseSalary = 2000;  
        return baseSalary + commission;
    }
    public static void displayValues(double sales, double returns, double netWidgetsSold, double salesAmount, double commission, double totalSalary) 
    {
        System.out.println("Weekly Sales Amount "+ sales);
        System.out.println("Weekly Returns Amount:"+ returns);
        System.out.println("Net Widgets Sold:"+ netWidgetsSold);
        System.out.println("Total Sales Amount:"+ salesAmount);
        System.out.println("Commission Earned: "+ commission);
        System.out.println("Total Monthly Salary:"+ totalSalary);
    }
}


   
