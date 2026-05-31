import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Coach A");
        train.add("Coach B");
        train.addFirst("Engine");
        System.out.println(train);
    }
}
