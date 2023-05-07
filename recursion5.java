public class recursion5 {
    public static int factorial(int n){

        if(n==1 || n==0){
            return 1;
        }


        int fac_n_sub_1 =  factorial(n-1); // outer loop // recursion
        int fac_n = n*fac_n_sub_1;
        return fac_n; 
    }
    public static void main(String[] args) {
        int n=5;
        int ans = factorial(n);
        System.out.println(ans);
        
    }
}
