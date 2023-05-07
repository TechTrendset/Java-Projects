public class recursion1 {
    public static void printNumbers(int n){

        if(n==0){
            return; // base condition
        }
        System.out.println(n); //print
        printNumbers(n-1); //recursion
    }
    public static void main(String[] args) {

        int n=5;
        System.out.println("Print Numbers from 5 to 1:");
        printNumbers(n);
        
    }
    
}
