

public class substring {
    public static void main(String[] args) {

        // Strings are immutable (unchangeable in memory)
        String sentence = "Hello guys , thanks for watching";
       
        // substring function givs us the needed phrase.
        // Enter beginning(inclusive or included) and ending(exclusive or excluded). 
        String name = sentence.substring(6,10);
        String name1 = sentence.substring(24,sentence.length());
        System.out.println(name);
        System.out.println(name1);
        System.out.println(sentence.length()); // 1 se start. 
        // sentence.length() used for last index.

        String sentence1 = "PAREESAABBASI";
        String name2 = sentence1.substring(7);
        System.out.println(name2);
        System.out.println(sentence1.length()); // 1 se start. 





    }
    
}
