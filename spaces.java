import java.util.Scanner;

public class spaces {
    public static void main(String[] args) {
        System.out.println("***To detect spaces in a string***");
        String myString = "This String contans  double and triple   spaces.";
        System.out.println(myString.indexOf("  "));// double space occurs at 19.
        System.out.println(myString.indexOf("   "));// triple space occurs at 38.

        String string = "Hello  my name is pareesa abbasi.";
        System.out.println(string.indexOf("  "));// double space occurs at 5.
        System.out.println(string.indexOf("   "));// no triple space returns -1.

        System.out.print("Enter a string to detect spaces:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
        sc.close();



    }
    
}
