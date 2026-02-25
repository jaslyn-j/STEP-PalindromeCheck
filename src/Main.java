import java.util.*;

/* @author: Jaslyn Jacob
   @version: 9.0
 */
class Main{
    public static boolean check(String s, int start, int end){
        if(start>=end) return true;
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return check(s, start+1, end-1);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=9.0;
        System.out.println("Welcome to the Palindrome Checker App (UC9) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        boolean palindrome=true;

        palindrome=check(lowerWord, 0, lowerWord.length()-1);

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}