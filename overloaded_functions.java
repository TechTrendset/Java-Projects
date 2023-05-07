public class overloaded_functions {

    // We can not perform 'method overloading' by changing the return type of methods.

    static void say(){
        System.out.println("Good Morning!,Have a nice day.");
    }


    static void say(int a){
        System.out.println("Good Morning!,Have a nice day " + a);
    }


    static void say(int a, int b){
        System.out.println("Good Morning!,Have a nice day " + a);
        System.out.println("Good Morning!,Have a nice day " + b);

    }

    // static int say(int a, int b){
    //     System.out.println("Good Morning!,Have a nice day " + a);
    //     System.out.println("Good Morning!,Have a nice day " + b);

    // }








public static void main(String[] args) {


    say();

    say(31);
     
    say(67,89);
}


    
    
}
