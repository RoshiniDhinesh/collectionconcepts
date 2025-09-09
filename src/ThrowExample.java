public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            // manually throwing an exception
            throw new ArithmeticException("You must be 18 or older to vote.");
        } else {
            System.out.println("You can vote.");
        }
    }
}
