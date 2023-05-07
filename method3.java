public class method3 {

    int logic_sum(int a , int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {

        // calling method using object creation

        int a =32;
        int b=3;
        int c;

        method3 obj = new method3();

        c = obj.logic_sum(a,b); // method called upon an object

        System.out.println("The value is: "+c);

        
    }
    
}
