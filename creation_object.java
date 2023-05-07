public class creation_object {

    // Method
    
    int sum(int x, int y){
       
        int result;

        result = x + y;
       
       
        return result;

        
    }


    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c;

        creation_object obj = new creation_object(); // creation of object

        c = obj.sum(a,b); // calling method upon object

        System.out.println("The sum is:"+c);


        








    }
    
}
