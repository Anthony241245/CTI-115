package Module_4;

/**
 * Module4_Widget
 */
import java.util.Scanner;
 public class Module4_Widget 
{


    public static void main(String[] args) 
    {
        //variables
        int quarter1, quarter2, quarter3, quarter4, annual_Widgets;
        double saleTax, salesAmount, total;
        final double TAX = .07, PRICE = 4.79;
        //create scanner variable to hold input form the keyboard
        Scanner k = new Scanner(System.in);
        
        //input
        System.out.print("Enter sales for quarter one: ");
        quarter1 = k.nextInt();
        System.out.print("Enter sales for quarter two: ");
        quarter2 = k.nextInt();
        System.out.print("Enter sales for quarter three: ");
        quarter3 = k.nextInt();
        System.out.print("Enter sales for quarter four: ");
        quarter4 = k.nextInt();
        

        //calculations
        annual_Widgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmount = annual_Widgets * PRICE;
        saleTax = salesAmount * TAX;
        total = saleTax + salesAmount;

        //output

    System.out.println("Annual Widgets Sold: " + annual_Widgets);
    System.out.println("Widgets Sales Amount: " + salesAmount);
    System.out.println("Sales Tax Collected: " + saleTax);
    System.out.println("Total Amount: " + total);
    k.close();
        
    }
}


