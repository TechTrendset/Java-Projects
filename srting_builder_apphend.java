public class srting_builder_apphend {
    public static void main(String[] args) {

        // memory mai kuch bhi change nahi ho raha append mai coz of StringBuilder.
        StringBuilder sb = new StringBuilder("H");
        sb.append("e"); // str = str + "e" ---> in normal variables.
        sb.append("l"); // str = str + "l"
        sb.append("l"); // str = str + "l"
        sb.append("o"); // str = str + "o"

        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
