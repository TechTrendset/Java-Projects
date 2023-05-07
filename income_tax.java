
 import java.util.Scanner;
 
 
 // Calculate income tax paid by an employee to the government as 
//  per the slabs mentioned below:

/*Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user.
*/


public class income_tax {
    public static void main(String[] args) {
        System.out.println("***Calculate the income tax paid by the employer***");
       float tax = 0;
       System.out.println("Enter your income in Lakhs per annum:");
       Scanner sc = new Scanner(System.in);
      
       float income = sc.nextFloat();
       sc.close();


       if (income < 2.5f){
        tax = tax + 0;
       }
       else if(income > 2.5f && income <=5.0f){
        tax = tax + 0.05f * (income - 2.5f);
       }
       else if(income > 5.0f && income <= 10.0f){
        tax = tax + 0.05f * (5.0f - 2.5f);
        tax = tax + 0.20f * (income - 5.0f);
       }
       else if(income > 10.0f ){
        tax = tax + 0.05f * (5.0f - 2.5f);
        tax = tax + 0.20f * (10.0f - 5.0f);
        tax = tax + 0.30f * (income - 10.0f);

       }
        
       System.out.println("The total tax paid by the employee is "+ tax + " lakhs.");

       }
       


    
    
    
    

    
    
    
    
    
    }

