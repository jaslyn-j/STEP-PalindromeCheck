import java.util.*;

/* @author: Jaslyn Jacob
   @version: 10.0
 */
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=10.0;
        System.out.println("Welcome to the Palindrome Checker App (UC10) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        String normalizedWord=lowerWord.replaceAll("\\s", "");
        boolean palindrome=true;

        for(int i=0; i<normalizedWord.length()/2; i++){
            if(normalizedWord.charAt(i) != normalizedWord.charAt(normalizedWord.length()-i-1)){
                palindrome=false;
                break;
            }
        }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}