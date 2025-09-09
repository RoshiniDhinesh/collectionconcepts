import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // 1. Create a Set to store customer names
        Set<String> customers = new HashSet<>();

        // 2. Add names to the Set
        customers.add("Alice");
        customers.add("Bob");
        customers.add("Charlie");
        customers.add("Bob");  // This "Bob" is ignored!

        // 3. Print out the Set (unique names only)
        System.out.println("Guest list: " + customers);
    }
}
