import java.util.*;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first name: ");
        String firstname = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastname = sc.nextLine();
       
        String fullname = firstname+ " "+lastname;
        System.out.println(fullname);

        System.out.println();

     //   To print each character of string---> charAt

        for(int i=0; i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        sc.close();




    }
    
}
