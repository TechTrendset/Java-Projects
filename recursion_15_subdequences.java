public class recursion_15_subdequences {

    public static void sequences(String str, int idx, String newString){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char CurrentChar = str.charAt(idx);

        // To be added
        sequences(str, idx+1, newString+CurrentChar);

        // Not To be added
        sequences(str, idx+1, newString);

    }
    public static void main(String[] args) {

        String str="abc";

        System.out.println("Print all the subsequences of a String:");

        sequences(str, 0, "");
        
    }
    
}
