



public class String_methods {
    public static void main(String[] args) {
        String name = "PAREESA ABBASI";
        String name2 = "suhaib";
        String nonTrimmedString = "     PAREESA     ";
        System.out.println(name);
        int value = name.length(); // PAREESA ABBASI has 14 characters.Returns integer.
        System.out.println(value);

        String lower_string = name.toLowerCase();
        System.out.println(lower_string);

        String upper_string = name2.toUpperCase();
        System.out.println(upper_string);

        System.out.println(nonTrimmedString);
        String Trimmed_string = nonTrimmedString.trim();
        System.out.println(Trimmed_string); // 1st Method

       // System.out.println(nonTrimmedString.trim()); // 2nd Method

       System.out.println("****************************************************************************************");



        System.out.println(name.substring(2)); 
        // index 2 se last takk string ko print karo.
        // index starts from 0.


        System.out.println(name.substring(1,4)); 
         // index 1 included hai , index 4 included nahi hai.

        System.out.println(name.replace('E','I')); 
        // Repalce 'E' with 'I'.

        System.out.println(name.replace("PAREE","HANIA"));
        // Result is HANIASA ABBASI.
        
        System.out.println(name.replace("A","OH")); 
        // Result is POHREESOH OHBBOHSI.
        // Replaces A with OH.

        System.out.println(name.startsWith("PAR")); 
        // Returns true if string starts with PAR.

        System.out.println(name.endsWith("SI")); 
        // Returns true if string ends with SI.

        System.out.println(name.charAt(5)); 
        // Returns character at a given index position. S in this case.

        System.out.println(name.indexOf("E")); 
        // String(character) pehleh kahan occur ho raha hai. 3 in this case.

        System.out.println(name.indexOf("ESA")); 
        // String(character) pehleh kahan se occur ho raha hai. 4 in this case.

        String Modified_name = "PARPAREESA";
        System.out.println(Modified_name.indexOf("AR")); 
        // String(character) pehleh kahan se occur ho raha hai. 1 in this case.

        System.out.println(Modified_name.indexOf("AR",4)); 
        // Index 4 se String(character) dhondhona start karo. 4 in this case.
        
        
        System.out.println(Modified_name.lastIndexOf("AR")); 
        // Returns the last index of the string AR. 4 in this case.
        
        System.out.println(Modified_name.lastIndexOf("AR",7)); 
        // Search AR till 7 index .last ARR is in 4 in this case.

        System.out.println(name.equals("PAREESA ABBASI")); 
        // To match two Strings for similarity.

        System.out.println(name.equals("PAREESA")); 
        // To match two Strings for similarity.


        System.out.println(name.equals(Modified_name)); 
        // To match two Strings for similarity.

        System.out.println(name.equalsIgnoreCase("pAreEsa abbasi")); 
        // Returns true if two strings are equal ignoring the case(upper or lower).
        // True in this case.

        



























        
        





































































        




































         
    }
}
