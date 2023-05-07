import java.util.Scanner;

public class percentage1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of first subject:");

        float first = sc.nextFloat();

        System.out.println("Enter the marks of second subject:");

        float second = sc.nextFloat();

        System.out.println("Enter the marks of third subject:");

        float third = sc.nextFloat();

        System.out.println("Enter the marks of fourth subject:");

        float fourth = sc.nextFloat();

        System.out.println("Enter the marks of fifth subject:");

        float fifth = sc.nextFloat();

        float sum = (first + second + third + fourth + fifth);

        System.out.println("The Sum of five subjects is:" + sum);

        float percentage = (sum / 500) * 100;

        System.out.println("The Percentage of five subjects is:" + percentage);

        sc.close();

    }

}
