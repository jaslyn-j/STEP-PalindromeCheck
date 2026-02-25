import java.util.*;

/* @author: Jaslyn Jacob
   @version: 11.0
 */
class Palindrome{
    public boolean checkPalindrome(String word){
        String lowerWord=word.toLowerCase();
        String normalizedWord=lowerWord.replaceAll("\\s", "");
        boolean palindrome=true;

        for(int i=0; i<normalizedWord.length()/2; i++){
            if(normalizedWord.charAt(i) != normalizedWord.charAt(normalizedWord.length()-i-1)){
                palindrome=false;
                break;
            }
        }return palindrome;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Palindrome checker=new Palindrome();
        double version=11.0;
        System.out.println("Welcome to the Palindrome Checker App (UC11) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        boolean check=checker.checkPalindrome(word);

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+check);
    }
}