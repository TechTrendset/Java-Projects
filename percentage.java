

import java.util.Scanner;

public class percentage {
   public static void main(String[] args) {
      System.out.println("***Calculate Percentage Of a Student in five subjects***");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the marks of first subject:");

      int first = sc.nextInt();

      System.out.println("Enter the marks of second subject:");

      int second = sc.nextInt();

      System.out.println("Enter the marks of third subject:");

      int third = sc.nextInt();

      System.out.println("Enter the marks of fourth subject:");

      int fourth = sc.nextInt();

      System.out.println("Enter the marks of fifth subject:");
      int fifth = sc.nextInt();

      sc.close();

      System.out.println("The sum of five subjects:");
      float sum = first + second + third + fourth + fifth;
      System.out.println(sum);

      System.out.println("The percentage of five subjects:");
      float per = (sum / 500) * 100;
      System.out.println(per+"%");

   }

}
