import java.util.Scanner;


public class multiplication_table {
    

    public static void main(String[] args) {
        System.out.println("***Multiplication Table***");
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product;
       for(int i=1; i<=10; i++){
        product=n*i;
        System.out.printf("\t \t %dx%d=%d\n",n,i,product);
       }

        System.out.println("****************************************************************\n");

        System.out.println("***Multiplication Table In Reverse Order***");
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        sc.close();
        int product1;
       for(int j=10; j>=1; j--){
        product1=num*j;
        System.out.printf("\t \t %dx%d=%d\n",num,j,product1);
        
       }  
    }



}

