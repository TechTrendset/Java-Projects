public class method1 {

    int logic(int x, int y) {

        int z;

        if (x > y) {

            z = x + y;
        } else {

            z = (x + y) * 5;
        }

        x=67; // Values of a and b will not change.

        return z;

    }

    public static void main(String[] args) {
        System.out.println("To avoid repeating the same method we should use methods");

        System.out.println("\n***Methods***\n");

        int a = 5;
        int b = 7;
        int c;

        // The static keyword is used to associate a method of a given class with the
        // class rather than the object.
        // You can call a static method without creating an instance of the class.
        // In Java, the main() method is static, so that JVM can call the main() method
        // directly without allocating any extra memory for object creation.
        // All the objects share the static method in a class.
        // To call the method without static we will create an object

        System.out.println("\n***Calling method using object creation***\n");
   
        method1 obj = new method1(); // Object creation
     // a constructor is used to provide any values at the time of object creation. 
 //     |class name| obj = new |class name| () ;
        c = obj.logic(a, b); // Method call upon an object.
        
       
        System.out.println("The value of c is: " + c);

        int a1 = 4;
        int b1 = 3;
        int c1;

        c1 = obj.logic(a1, b1); // we can use the same object that we created.

        System.out.println("The value of c1 is: " + c1);

    }

}
