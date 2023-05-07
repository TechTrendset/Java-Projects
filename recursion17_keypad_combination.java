public class recursion17_keypad_combination {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keyComb(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char CurrentChar = str.charAt(idx);
        String mapping = keypad[CurrentChar - '0'];

        for (int i=0; i<mapping.length();i++) {
            keyComb(str, idx + 1, combination + mapping.charAt(i));
            
        }
    }

    public static void main(String[] args) {

        String str = "23";
        keyComb(str, 0, "");

    }

}
