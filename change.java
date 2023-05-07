public class change {

    static void change1(int a){

        a=10;

    }

    static void change2(int [] array){

      array [0] = 12;

    }




    public static void main(String[] args) {

        int x = 5;
        

        // Changing the Integer:

        System.out.println("\n***Case 1: Changing the Integer***\n");

        change1(x);

        System.out.println("The value of x after changing is: "+x);
        System.out.println("The value of x before and after the change is same.\n");


        // Changing the Array:

        int [] marks = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("\n***Case 2: Changing the Array***\n");

        change2(marks);

        System.out.println("The value of x after changing is: "+marks[0]);
        System.out.println("The value of x before and after the change is different.");

        
    }
    
}
