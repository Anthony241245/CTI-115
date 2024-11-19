/**
 * M5HW2_Raynor
 * Anthony Raynor
 * 11/18/24
 * M5HW2
 */
import java.util.Scanner;
public class M5HW2_Raynor 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        //variables
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) 
        {
            final double WIDGET_PRICE = 4.79, BASE_SALARY = 2000;
            int widgets_sold, totalwidgetsold = 0, weeks = 4+1, i, widgets_returned,totalwidgets_returned=0, net_widgets_sold;
            double widget_sales_amount, comm_amount,comm_rate, salary;
            String name;
            System.out.println("Enter Salesperson name: ");
            name = k.nextLine();

            for(i = 1; i < weeks; i ++)
            {
               System.out.print("Enter Widgets sold for week # " + i +": ");
               widgets_sold = k.nextInt();
               totalwidgetsold += widgets_sold;

            }
            System.out.println("Total widgets Sold: " + totalwidgetsold);
            //widgets returned loop
            for(i = 1; i < weeks; i ++)
            {
               System.out.print("Enter Widgets returned for week # " + i +": ");
               widgets_returned = k.nextInt();
                totalwidgets_returned += widgets_returned;
    
            }
            System.out.println("Total widgets returned: " + totalwidgets_returned);
            net_widgets_sold = totalwidgetsold - totalwidgets_returned;
            System.out.println("Net Widgets Sold: " + net_widgets_sold);
            widget_sales_amount = net_widgets_sold * WIDGET_PRICE;
            System.out.println("Widget Sales Amount: $" + widget_sales_amount);
            //decision structure
            if(net_widgets_sold <=100)
                comm_rate = .1;
            else if (net_widgets_sold < 200)
                comm_rate = .15;
            if(net_widgets_sold < 300)
                comm_rate = .2;
            else 
                comm_rate = .25;
            comm_amount = comm_rate * widget_sales_amount;
            salary = comm_amount + BASE_SALARY;
            System.out.println("Commision Amount: $" + comm_amount);
            System.out.println("Month Salary: $" + salary);

            
            System.out.println();
            //System.out.println("M5HW2 solution");
            System.out.println();
            System.out.print("Would you like to run this program again? Enter yes or no: ");
            choice = k.next();
        }
        
        

        k.close();
        System.out.println();
        System.out.println("Program has exited!");
        
        
    }
}