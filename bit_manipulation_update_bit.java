import java.util.Scanner;

public class bit_manipulation_update_bit {
    public static void main(String[] args) {
        // We can update the bit to 1 or 0 on any position.
        
        int n=5;
        int position=2;
        int bitmask=1<<position;
        System.out.println("Enter your operation 1 or 0:");
        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt();

        if(oper==1){
            // set
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }else{
            // clear 
            int Bitmask = ~(bitmask);
            int newNumber = Bitmask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
    
}
