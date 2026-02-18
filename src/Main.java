import java.util.*;

/* @author: Jaslyn Jacob
   @version: 2.0
 */

class Main{
    public static void main(String[] args){
        double version=2.0;
        System.out.println("Welcome to the Palindrome Checker App (UC1) ");
        System.out.println("Version: "+version);

        String word="Race Bar";
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
