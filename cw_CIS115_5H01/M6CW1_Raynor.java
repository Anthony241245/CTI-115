/**
 * M6CW1_Raynor
 */
import java.util.Scanner;
public class M6CW1_Raynor 
{

    public static void main(String[] args) 
    {
        /*double num = 1234567.666666666667;
        String number =(String.format("%,.2f", num));
        System.out.println(number);
        */
        Scanner k = new Scanner(System.in);
        getArea(k);

        k.close();

    }
    public static void getArea(Scanner k)
    {
      double area;
      System.out.print("Enter the area of a square: ");
      area = k.nextDouble();
      System.out.println("The area is: " + area);
    }
}