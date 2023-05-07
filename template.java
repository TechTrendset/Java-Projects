import java.util.Scanner;

public class template {
    public static void main(String[] args) {
        System.out.println("****To replace name with custom name in a template.****");
        String letter = "Dear <|name|> ,Thanks a lot!";// hardcoded
        letter = letter.replace("<|name|>", "Pareesa");
        System.out.println(letter);

        System.out.println("****To replace name with custom name in a template.****");
        System.out.print("Enter a name:");

        String let = "Dear <|name|> ,Thanks a lot!";
        Scanner sc = new Scanner(System.in);// user input
        let = let.replace("<|name|>", sc.nextLine());
        System.out.println(let);
        sc.close();


       
        
    }
    }
    
































