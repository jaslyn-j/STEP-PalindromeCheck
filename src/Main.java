import java.util.*;

/* @author: Jaslyn Jacob
   @version: 6.0
 */

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=6.0;
        System.out.println("Welcome to the Palindrome Checker App (UC6) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        char[] charArr=lowerWord.toCharArray();
        boolean palindrome=true;

        Stack<Character> charStack=new Stack<>();
        Queue<Character> charQueue=new LinkedList<>();

        for(char c: charArr){
            charStack.push(c);
            charQueue.add(c);
        }
        while(!charQueue.isEmpty()){
            if(charStack.pop() != charQueue.remove()){
                palindrome=false;
                break;
            }
        }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}
