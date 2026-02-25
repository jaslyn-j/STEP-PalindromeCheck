import java.util.*;

/* @author: Jaslyn Jacob
   @version: 8.0
 */
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=8.0;
        System.out.println("Welcome to the Palindrome Checker App (UC7) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        boolean palindrome=true;

        LinkedList<Character> wordList=new LinkedList<>();

        for (char c: lowerWord.toCharArray()){
            wordList.add(c);
        }
         while(wordList.size() >1){
             if(wordList.removeFirst() != wordList.removeLast()){
                 palindrome=false;
                 break;
             }
         }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}