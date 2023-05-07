public class compare_strings {
    public static void main(String[] args) {
        String firstname = "PAREESA";
        String lastname = "PAREESAz";

        // To compare strings we use compareTo(parameter)
        // first character is compared as P is greater than A.

        /*
         * s1>s2 = +ve value
         * s1==s2 = equal value
         * s1<s2 = -ve value
         * 
         */

        if(firstname.compareTo(lastname)==0){
        System.out.println("Strings are Equal.");
        }else{
        System.out.println("Strings are not Equal.");
        }

        // or

        // if(firstname==lastname){
        // System.out.println("Strings are Equal.");
        // }else{
        // System.out.println("Strings are not Equal.");
        // } // will not work properly on many programs.

        // if(new String ("hello")==new String ("hello")){
        // System.out.println("Strings are Equal.");
        // }else{
        // System.out.println("Strings are not Equal.");
        // }// will not work properly on many programs.

        // java works differently for primitive data types and different for objects
        // above string is a object we created.

    }
}
