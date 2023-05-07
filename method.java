
// Sometimes our program grows in size, and we want to separate the logic 
// of the main method from the other methods.
// For instance, if we calculate the average of a number pair 5 times, 
// we can use methods to avoid repeating the logic. [DRY – Don’t Repeat Yourself]
// Syntax of a Method
// A method is a function written inside a class. 
// Since Java is an object-oriented language, we need to write 
// the method inside some class.

public class method {

    static int logic(int x, int y) {

        int z;

        if (x > y) {

            z = x + y;
        } else {

            z = (x + y) * 5;
        }

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

        // Calling method using object creation

        c = logic(a, b); // To call method

        System.out.println("The value of c is: " + c);

        int a1 = 4;
        int b1 = 3;
        int c1;

        c1 = logic(a1, b1); // we can use the same object that we created.

        System.out.println("The value of c1 is: " + c1);

    }

}
