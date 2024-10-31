package Module_4;

import java.util.Scanner;

/**
 * M4HW2_Raynor
 */
public class M4HW2_Raynor {

    public static void main(String[] args)
    {
       String  age, citizen, felony, county;
       Scanner k = new Scanner(System.in);
       System.out.print("Are you 18 years or older? Enter yes or no: ");
       age = k.next();
       if (age.equalsIgnoreCase("yes")) {
            System.out.println("You pass the age requirements. You are eligible to vote");
       }
        else{
            System.out.println("You cannot vote due to age requirements");

        }
            System.out.print("Are You a citizen of the U.S.? Enter yes or no: ");  
            citizen = k.next();
            if (citizen.equalsIgnoreCase("yes")){
                System.out.println("You pass the citizenship requirement. You are eligible to vote");
          }
            else{
                System.out.println("You cannot vote due to not being a U.S. citizen");
            }
                
                System.out.print("Are you serving a felony sentence or on probation? Enter yes or no: ");
                felony=k.next();
                if (felony.equalsIgnoreCase("yes")){
                    System.out.print("Either you are serving a felony sentence or on probation. You aren't eligible to vote");
                }
                else{
                    System.out.println("You aren't serving a felony sentence or on probation. You are eligible to vote");
                }

                    System.out.print("Have you live in the U.S. for 30 days? Enter yes or no: ");
                    county=k.next();
                    if(county.equalsIgnoreCase("yes")){
                        System.out.print("You pass the 30 day requirements. You are eligible to vote");
                    }
                    else{
                        System.out.println("You cannot vote due to not living in the U.S. for 30 days");
                        k.close();
                    }

                    
        
        
       
            
            
    
       



    }
}
