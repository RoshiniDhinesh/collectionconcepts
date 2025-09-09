public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // This will cause an error!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! That position doesn't exist in the list.");
        } finally {
            System.out.println("This will always run, no matter what!");
        }

        System.out.println("Program continues...");
    }
}
