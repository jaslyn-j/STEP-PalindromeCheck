import java.util.*;

/* @author: Jaslyn Jacob
   @version: 7.0
 */

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=7.0;
        System.out.println("Welcome to the Palindrome Checker App (UC7) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        boolean palindrome=true;

        Deque<Character> charQueue=new LinkedList<>();

        for(int i=0; i<lowerWord.length(); i++){
            charQueue.add(lowerWord.charAt(i));
        }
        while(charQueue.size()>1){
            Character first=charQueue.pollFirst();
            Character last=charQueue.pollLast();
            if(!first.equals(last)){
                palindrome=false;
                break;
            }
        }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}