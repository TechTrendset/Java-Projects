import java.util.Scanner;

/* Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.pk – pakistani website */





public class to_find_website {
    public static void main(String[] args) {
        System.out.print("Enter the name of the site:");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();
        sc.close();

        if(website.endsWith(".org")){

            System.out.println("This is an organizational type of website.");
        }
        else if(website.endsWith(".com")){

            System.out.println("This is an commercial type of website.");
        }
        else if (website.endsWith(".pk")){

            System.out.println("This is an pakistani type of website.");
        
        }


    }
    
}
