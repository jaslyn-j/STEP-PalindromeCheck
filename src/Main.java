import java.util.*;

/* @author: Jaslyn Jacob
   @version: 5.0
 */

class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=5.0;
        System.out.println("Welcome to the Palindrome Checker App (UC5) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();

        String lowerWord=word.toLowerCase();
        char[] charArr=lowerWord.toCharArray();
        boolean palindrome=true;
        int i=0;
        Stack<Character> charStack=new Stack<>();

        for(char c: charArr){
            charStack.push(c);
        }
        while(!charStack.isEmpty()){
            if(charStack.pop() != charArr[i]){
                palindrome=false;
                break;
            }i++;
        }

        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}
