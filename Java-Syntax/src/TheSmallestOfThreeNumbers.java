import java.util.*;

public class TheSmallestOfThreeNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println(findSmallestElement(numbers));
    }

    private static double findSmallestElement(double[] arr){
        double smallest = Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
