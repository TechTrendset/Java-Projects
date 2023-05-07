public class strings {
    public static void main(String[] args) {

        String string = "My Name is Pareesa Abbasi.";
        String a = "My Name is Suhaib.";


        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
       

  //The indexOf() method returns the index (the position) of the first occurrence of a
  // specified text in a string (including whitespace):

  System.out.println(string.indexOf("Pareesa"));
  System.out.println(string.indexOf("Abbasi"));

 //The length of a string can be found with the length() method:

 System.out.println("The length of the string a is:"+a.length());

// The concat() method to concatenate two strings:

  String firstname = "Amelia ";
  String lastname = "Anderson";

  System.out.println(firstname.concat(lastname));

 // backslash escape characters
 
 String txt = "We are the so called \"vikings\".";

 System.out.println(txt);
 
 String txt1 = "It\'s alright.";

 System.out.println(txt1);

 String txt2 = "The character is called \\ backslash."; // inserts single backslash.

 System.out.println(txt2);
 

 String txt3 = "Hello\nWorld!";
 System.out.println(txt3);

 String txt4 = "Hello\rWorld!"; // \r ---> Carriage return
 System.out.println(txt4);

 String txt5 = "Hello\bWorld!"; // \b ---> backspace a character
 System.out.println(txt5);
 
 String txt6 = "Hello\tWorld!"; // \t ---> inserts a tab
 System.out.println(txt6);

        

  // Add two strings, the result will be a string concatenation:

  String x = "10";
  String y = "3";
  String z= x+y;

  System.out.println(z);

  // Add a number and a string, the result will be a string concatenation:

  int x1  = 10;
  String y1  = "3";
  String z1 = x1+y1;

  System.out.println(z1);




 
















    }

    
    
}
