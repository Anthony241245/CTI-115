/**
 * comparsion_operators
 */
public class comparsion_operators 
{

    public static void main(String[] args) 
    {
        //int z = 5/2;
        int z = 5%2;
        boolean x = 4 > 5 % 2;
        boolean y = 6/4-2<5;
        if(x && y)
            System.out.println("true");
        else
            System.out.println("false");
        
        System.out.println(z);
    }
}