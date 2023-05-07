
import java.util.Scanner;

//  Write a program to find out whether a student is pass or fail; 
// if it requires a total of 40% and at least 33% in each subject to pass. 
// Assume 3 subjects and take marks as input from the user.


public class average {
    public static void main(String[] args) {
        System.out.println("Calculate the Average of three subjects");

        byte n1,n2,n3;
        System.out.print("Enter your marks in English: ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextByte();

        System.out.print("Enter your marks in Physics: ");
        n2 = sc.nextByte();

        System.out.print("Enter your marks in Physics: ");
        n3 = sc.nextByte();

        sc.close();

        float average = (n1+n2+n3)/3.0f;

        System.out.println("The Average is: "+ average);

        if(average>=40 && n1>33 && n2>33 && n3>33 )
        {
            System.out.println("Congratulations! You have been promoted");
        
        }
        else{
            System.out.println("Work Hard. You have failed.");

        }
       


    }
    
}
