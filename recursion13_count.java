public class recursion13_count {

    public static void AllmoveX(String str, int index, int count, String newString) {

        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';

            }
            System.out.println(newString);
            return;
        }
        char currentchar = str.charAt(index);
        if (currentchar == 'x') {
            count++;
            AllmoveX(str, index + 1, count, newString);
        } else {
            newString += currentchar;
            AllmoveX(str, index + 1, count, newString);
        }

    }

    public static void main(String[] args) {

        String str = "axbcxdxx";
        AllmoveX(str, 0, 0, "");

    }

}
