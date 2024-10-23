package Module_4;

import java.util.Scanner;

public class M4Hw1Raynor {
    public static void main(String[] args) 
    {
    /*Anthony Raynor
     * M4HW1
     * 10/23/2024
     */
    //declare varibles
     int widgets_sold, widgets_returned, net_widgets_sold;
     double widget_sales_amount, comm_amount,salary, comm_rate;
     final double WIDGET_PRICE = 4.79, BASE_SALARY = 2000;
     String name;

     //input
     Scanner in = new Scanner(System.in);
     System.out.print("Enter Sales person's name: ");
     name = in.next();
     System.out.print("Enter the number of widgets sold: ");
     widgets_sold = in.nextInt();
     System.out.print("Enter the number of widegts returned ");
     widgets_returned = in.nextInt();
     System.out.print("Enter the number of widegts sold ");
     net_widgets_sold = in.nextInt();

     //calculations
     net_widgets_sold = widgets_sold - widgets_returned;
     widget_sales_amount = net_widgets_sold * WIDGET_PRICE;
     
     
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
    System.out.println(comm_rate);
    
     
     //output
     System.out.println("Sales person: " + name);
     System.out.println("Net widgets sold: " + net_widgets_sold);
     System.out.println("Widget sales amount: " + widget_sales_amount);
     System.out.println("Commission amount: " + comm_amount);
     System.out.println("Salary: " + salary);
     in.close();
    }
}
