
public class recursion18_permutation {

    public static void printPerm(String str,String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char CurrentChar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            printPerm(newString, permutation+CurrentChar);
        }
    


    }

    public static void main(String[] args) {

        String str = "abc";
        printPerm(str, "");

        // Time Complexity = O(n!)

    }

}
