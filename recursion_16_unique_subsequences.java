import java.util.HashSet;

public class recursion_16_unique_subsequences {

    public static void sequences(String str, int idx, String newString , HashSet set){

        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
            
        }

        char CurrentChar = str.charAt(idx);

        // To be added
        sequences(str, idx+1, newString+CurrentChar,set);

        // Not To be added
        sequences(str, idx+1, newString,set);

    }
    public static void main(String[] args) {

        
        String str="aaa";

        HashSet <String> set = new HashSet <> (); 

        System.out.println("Print all the unique subsequences of a String:");

        sequences(str, 0, "",set);
        
    }
    
}
