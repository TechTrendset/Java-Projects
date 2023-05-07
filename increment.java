public class increment {
    public static void main(String[] args) {

        // Increment and Decrement Operators

        int i = 90;

        System.out.println(i++); // ---> First i is assigned then incremented.
        System.out.println(i);
        System.out.println(++i); // ---> First Incremented then assigned.
        System.out.println(i);

        

        int y=7;
        int x=++y*8; // ++ increment operator has more precedence than the * operator.
        System.out.println("The value of x is:"+x); // x=64.

        char ch = 'A';
        System.out.println(++ch);


        

    }
    
}
