public class logical_operators {
    public static void main(String[] args) {
        System.out.println("Logical Operator AND &&");
        boolean a = true;
        boolean b = false;
        boolean c = true;


        if(a && b && c){
            System.out.println("Yes it is true.");
        }
        else{
            System.out.println("No it's not true.");
        }

        

        boolean d = true;
        boolean e = true;
        boolean f = true;


        if(d && e && f){
            System.out.println("Yes it is true.");
        }
        else{
            System.out.println("No it's not true.");
        }

        System.out.println("*****************************************************************************************");


        System.out.println("Logical Operator OR ||"); //Atleast one true.
        boolean a1 = false;
        boolean b1 = false;
        boolean c1 = true;


        if(a1 || b1 || c1){
            System.out.println("Yes it is true.");
        }
        else{
            System.out.println("No it's not true.");
        }
        System.out.println("*****************************************************************************************");


        System.out.println("Logical Operator NOT !"); //Atleast one true.
        boolean a2 = false;
        boolean b2 = false;
        boolean c2 = true;
        
           System.out.println("Not !a2 is "+!a2); // Inverts the true or false.
           System.out.println("Not !b2 is "+!b2);
           System.out.println("Not !c2 is "+!c2);

















    }
    
}
