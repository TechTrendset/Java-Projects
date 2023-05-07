
public class recursion11_find_occurence {

    public static int first = -1; // same variables in recursion
    public static int last = -1;

    public static void findOccurence(String str, int index, char element) {

        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;

        }

        char current_char = str.charAt(index);
        if (current_char == element) {
            if (first == -1) {
                first = index;
            }
         else {
            last = index;
        }
    }

        findOccurence(str, index + 1, element);

    }

    public static void main(String[] args) {

        String str = "abakbobaabaaagm";

        System.out.println("Find the occurrence of element \'a\' ");
        findOccurence(str, 0, 'a');

        // time complexity = string length()
        // time complexity = O(n) where n is strings length.

    }

}
