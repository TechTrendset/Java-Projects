public class recursion14_remove_duplicates {

    public static boolean[] map = new boolean [26];

    public static void removeDuplicate(String str , int idx, String newString){

        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char current_char = str.charAt(idx);
        if(map[current_char - 'a']){  // alphabet index number if it has occured.
            removeDuplicate(str, idx+1, newString);
        }else{
            newString+=current_char;
            map[current_char - 'a']=true; // alphabet index number if it has not occured.
            removeDuplicate(str, idx+1, newString);
           
        }
    }
    public static void main(String[] args) {

        System.out.println("Remove duplicate characters from string");

        String str = "abbccddeefghijj";
        removeDuplicate(str, 0, "");

         // time complexity = string length()
        // time complexity = O(n) where n is strings length.
        
    }
    
}
