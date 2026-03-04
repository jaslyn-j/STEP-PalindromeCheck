import java.util.*;

/* @author: Jaslyn Jacob
   @version: 12.0
 */
interface PalindromeStrategy{
    boolean checkPalindrome(String s);
}
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) deque.add(c);

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }
}
class Palindrome{
    private final PalindromeStrategy strategy;

    Palindrome(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    void check(String s) {
        System.out.println(s + ": " + (strategy.checkPalindrome(s) ? "Palindrome" : "Not a Palindrome"));
    }
}

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double version=12.0;

        Palindrome checker = new Palindrome(new StackStrategy());
        System.out.println("Stack: ");

        System.out.println("Welcome to the Palindrome Checker App (UC11) ");
        System.out.println("Version: "+version);

        System.out.print("Enter a word to check: ");
        String word=input.nextLine();
        System.out.println("Stack: ");
        checker.check(word);

        checker = new Palindrome(new DequeStrategy());
        System.out.println("Deque: ");
        checker.check(word);
    }
}