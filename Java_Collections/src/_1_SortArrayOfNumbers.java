import java.util.Arrays;
import java.util.Scanner;

public class _1_SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
