import java.util.*;

/* @author: Jaslyn Jacob
   @version: 3.0
 */

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=3.0;
        System.out.println("Welcome to the Palindrome Checker App (UC3) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        String reversed= "";
        for(int i=word.length()-1; i>=0; i--)
            reversed+=(lowerWord.charAt(i));

        boolean palindrome;
        if (lowerWord.equals(reversed.toString())) palindrome = true;
        else palindrome = false;

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}
