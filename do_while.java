public class do_while {
    public static void main(String[] args) {
        System.out.println("***Using do-while loop***");

        int a = 0;

         do{
            System.out.println(a);
            a++;
         }while(a<5);

        System.out.println("********************************************************");


        System.out.println("***First n natural numbers***");
        int n = 1;

        do{
           System.out.println("\t "+n);
           n++;
        }while(n<=50);

        
    }
    
}
