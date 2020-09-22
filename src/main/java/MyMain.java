import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32; 
        }
        else{
            System.out.println(ch + " is not a letter");
        }
        System.out.println("ch is now a lowercase letter " + ch);   
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int length = str.length();
        char [] ch = str.toCharArray();
        String fin = "";
        for (int i = 0; i < length; i++){
            if (ch[i] >= 'A' && ch [i] <='Z'){
                ch[i] += 32; 
                fin = fin + ch[i];
            }
            else{
                fin = fin + ch[i];
            }
        }
        System.out.println("The sting lowercase is " + fin);
        return fin;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch -= 32;
            
        }
        else{
            System.out.println(ch + " is not a letter");
        }
        
        System.out.println("ch is now an uppercase letter " + ch);   
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int lengthh = str.length();
        char[] ch2 = str.toCharArray();
        String fin= "";
        for (int i = 0; i < lengthh; i++){
            if (ch2[i] >= 'a' && ch2 [i] <='z'){
                ch2[i] -= 32; 
                fin = fin + ch2[i];
            }
            else{
                fin = fin + ch2[i];
            }
        }
        System.out.println("The sting uppercase is " + fin);
        return fin;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string"); 
        String str = sc.nextLine(); 
        System.out.println("would you like to make the string uppercase or lowercase?");
        String uorl = sc.nextLine();
        System.out.println(uorl);
        if (uorl == "uppercase"){
            myToUpperCase(str);
        } else if(uorl == "lowercase"){
            myToLowerCase(str);
        }
        sc.close();
    }
}