import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            numbers.add(Integer.parseInt(part)); // Autoboxing
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num; // Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
