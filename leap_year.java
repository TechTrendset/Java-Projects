import java.util.Scanner;


// Write a Java program to find whether a year entered by the user is
// a leap year or not.

/*  1.If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2.If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3.If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4.The year is a leap year (it has 366 days).
5.The year is not a leap year (it has 365 days).*/

public class leap_year {
    public static void main(String[] args) {
        System.out.print("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if(year%4==0 && year%100==0 && year%400==0 ){
            System.out.println("The year is a leap year (it has 366 days).");
        }
        else{
            System.out.println("The year is not a leap year (it has 365 days).");

        }
      
















    }
    
}
