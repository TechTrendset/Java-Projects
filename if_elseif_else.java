import java.util.Scanner;

public class if_elseif_else {
    public static void main(String[] args) {
        System.out.print("Enter Your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced.");
        }
        else if(age>46){
            System.out.println("You are not very experienced.");
        }
        else if(age>34){
            System.out.println("You are less experienced.");
        }
        else{
            System.out.println("You are not experienced.");
        }
        sc.close();
    }
    
}
