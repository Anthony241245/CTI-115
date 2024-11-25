/**
 * M6HW3_Raynor
 * Anthony Raynor
 * 11/25/24
 */
import java.util.Scanner;
public class M6HW3_Raynor 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        
        {
            final double BASE_SALARY = 500, WIDGET_PRICE = 0.10;
            int widgets_sold, widgets_returned, net_widgets_sold;
            double comm_amount, widget_sales_amount, comm_rate, salary;
            String name;
            System.out.print("Enter Salesperson name: ");
            name = k.nextLine();
            System.out.print("Enter the number of widgets sold: ");
            widgets_sold = k.nextInt();
            System.out.print("Enter the number of widgets returned: ");
            widgets_returned = k.nextInt();
            System.out.print("Enter the number of Net widgets sold: ");
            net_widgets_sold = k.nextInt();

            net_widgets_sold = widgets_sold - widgets_returned;
            widget_sales_amount = net_widgets_sold * WIDGET_PRICE;
        
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
        System.out.println(comm_rate);

        System.out.println("Sales person: " + name);
        System.out.println("Net widgets sold: " + net_widgets_sold);
        System.out.println("Widget sales amount: " + widget_sales_amount);
        System.out.println("Commission amount: " + comm_amount);
        

            k.close();
            
            
    

        } 
        
        }
    }