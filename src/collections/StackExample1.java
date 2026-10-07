package collections;

import java.util.Stack;

public class StackExample1 {
    static void main() {
        Stack<Character> alphabets = new Stack<>();

        alphabets.push('A');
        alphabets.push('B');
        alphabets.push('C');
        alphabets.push('D');
        alphabets.push('E');

        System.out.println(alphabets);
    }
}
