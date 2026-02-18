import java.util.*;

/* @author: Jaslyn Jacob
   @version: 4.0
 */

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=4.0;
        System.out.println("Welcome to the Palindrome Checker App (UC4) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        char[] charArr=lowerWord.toCharArray();
        boolean palindrome=true;
        int start=0, end=charArr.length -1;
        while(start<end){
             if(charArr[start]!=charArr[end]){
                 palindrome=false;
                 break;
             }start++; end--;
         }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}
