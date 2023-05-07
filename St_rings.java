import java.util.*;

public class St_rings {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("What is your full name: ");
        String fullname = sc.nextLine();
        System.out.println("Your name is "+fullname);
        

        // concatination#
        System.out.println("Enter first name: ");

        String firstname = sc.nextLine();
        System.out.println("Enter last name: ");

        String lastname = sc.nextLine();
        System.out.println(firstname .concat( lastname));

        // or
        String fullname1 = firstname+ " "+lastname;
        System.out.println(fullname1);

        // length
        System.out.println(fullname1.length()); //total characters

        sc.close();

        


    }
    
}
