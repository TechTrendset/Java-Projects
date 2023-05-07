public class recursion21_guest {

    public static int call_guest(int n){

        if(n<=1){
           return 1;
        }

        // single
        int way1=call_guest(n-1);

        // pair
        int way2=(n-1)*call_guest(n-2);
        

        return way1+way2;
    }
    public static void main(String[] args) {

        int n=4;
        int totalGuest = call_guest(n);
        System.out.println(totalGuest);
        
    }
    
}
