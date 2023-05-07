import java.util.Scanner;



//  Write a Java program to find out the day of the week 
// given the number [1 for Monday, 2 for Tuesday … and so on!]



public class day {
    public static void main(String[] args) {
        System.out.print("Enter an integer for the day:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        switch (num) {
        case 1:
        {
            System.out.println("Today is Monday.");
        }
        break;
        case 2:
        {
            System.out.println("Today is Tuesday.");
        }
        break;
        case 3:
        {
            System.out.println("Today is Wednesday.");
        }
        break;
        case 4:
        {
            System.out.println("Today is Thursday.");
        }
        break;
        case 5:
        {
            System.out.println("Today is Friday.");
        }
        break;
        case 6:
        {
            System.out.println("Today is Saturday.");
        }
        break;
        case 7:
        {
            System.out.println("Today is Sunday.");
        }
        break;
        default:
        System.out.println("Invalid Number.");

        }
    
    
   }

}
