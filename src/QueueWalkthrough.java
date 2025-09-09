import java.util.*;

public class QueueWalkthrough {
    public static void main(String[] args) {
        // 1. Creating the Queue (like a line at a coffee shop)
        Queue<Integer> q = new LinkedList<Integer>();

        // 2. Adding items to the queue (join the line)
        q.add(42);
        q.add(-3);
        q.add(17);

        // Queue now: front [42, -3, 17] back

        // 3. Removing the first item in the queue
        System.out.println("Removed from queue: " + q.remove()); // Output: 42

        // Queue now: front [-3, 17] back

        // 4. Idiom 1: Process and destroy the queue (like serving people)
        System.out.println("\nProcessing and removing remaining items:");
        while (!q.isEmpty()) {
            int next = q.remove();  // serve the next person
            System.out.println("Served: " + next);
        }

        // Queue is now empty
        System.out.println("Is queue empty now? " + q.isEmpty()); // Output: true

        // Re-add items to demonstrate Idiom 2
        q.add(10);
        q.add(20);
        q.add(30);

        // 5. Idiom 2: Look at each item once and possibly put it back
        System.out.println("\nExamining items without destroying queue:");
        int size = q.size(); // Get current size to avoid infinite loop
        for (int i = 0; i < size; i++) {
            int current = q.remove();  // Temporarily take it out
            System.out.println("Checked: " + current);

            // Put it back (e.g., customer is still waiting with right order)
            q.add(current);
        }

        // Final state of queue after re-adding: [10, 20, 30]
        System.out.println("\nFinal queue: " + q);
    }
}
