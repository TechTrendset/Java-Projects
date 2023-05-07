import java.util.Scanner;



public class switchcase {
    public static void main(String[] args) {
        System.out.print("Enter your age 18, 23 or 60:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();

        switch (age) {
            case 18:{
                System.out.println("You are going to be an adult.");
            }
                break;
            case 23:{
                System.out.println("You are going to have a job.");
            }
                break;
             case 60:{
                    System.out.println("You are retired.");
                    break;
                }
            default:
                System.out.println("Keep calm and enjoy your life.");
            
   
        }
        System.out.println("Thank You!");
    }
    
}
