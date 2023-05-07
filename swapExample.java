public class swapExample {

    static void swap(int a, int b) {

        System.out.println("Before Swapping the value of a=" + a + " and b=" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping the value of a=" + a + " and b=" + b);

    }

    public static void main(String[] args) {

        int a=10;
        int b=20;

   
    System.out.println("Before Swapping the value of a= " + a + " and b= " + b+" in main");
    System.out.println("After Swapping the value of a= " + a + " and b= " + b+" in main stays same");

    System.out.println("\n\n");

       swap(a,b);

        
       

    }
}
