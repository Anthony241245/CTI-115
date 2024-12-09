import java.util.Scanner;

/**
 * M7HW2
 */
public class M7HW2  
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
}