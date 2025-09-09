import java.util.Stack;

public class StackWalkthrough {
    public static void main(String[] args) {
        // 1. Creating the Stack (like an empty plate stack)
        Stack<Integer> s = new Stack<Integer>();

        // 2. Adding items to the stack (push)
        s.push(42);   // First plate goes in
        s.push(-3);   // Goes on top of 42
        s.push(17);   // Goes on top of -3

        // Current Stack (bottom to top): [42, -3, 17]

        // 3. Removing the top item (pop)
        System.out.println("Removed from stack: " + s.pop());  // Output: 17

        // Now the stack looks like: [42, -3]

        // 4. Optional checks:
        System.out.println("Current size of stack: " + s.size());    // Output: 2
        System.out.println("Is stack empty? " + s.isEmpty());        // Output: false
    }
}
