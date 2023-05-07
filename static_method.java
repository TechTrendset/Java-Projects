public class static_method {

    static int sum(int x, int y){

        int result;

        result = x + y;

        return result;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 10;
      

        sum(a,b); // calling method with out object

        System.out.println("The sum is:"+sum(a,b));
        





    }
    
}
