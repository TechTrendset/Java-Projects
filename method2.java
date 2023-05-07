public class method2 {

    static int logic(int a,int b){
        

        int c = a+b;

        return c;

    }

    public static void main(String[] args) {

        // calling a method without object creation

        int x = 3;
        int y = 13;
        int result;

        result=logic(x,y);

        System.out.println("The result is "+result);
        
    }
    
}
