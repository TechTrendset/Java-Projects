public class recursion2 {
    public static void printNumbers(int n){

        if(n==6){   // base condition
            return;
        }
        System.out.println(n); //print
        printNumbers(n+1); //recursion
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println("Print Numbers from 1 to 5 using recursion:");
        printNumbers(n);
        
    
        
    }
    
}
