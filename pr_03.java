import java.util.Scanner;

public class pr_03 {
    public static void main(String[] args) {
        System.out.println("***The Number Entered By the user is greater or smaller***");
        Scanner sc= new Scanner(System.in);
        int n=56;
        int num=sc.nextInt();
        System.out.println(n>num);
        System.out.println("If the number is greater than the user entered number it will return true or else false.");
        sc.close();
    }
    
}
