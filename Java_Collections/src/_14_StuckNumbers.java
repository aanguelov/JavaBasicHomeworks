import java.util.Scanner;

public class _14_StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] numbers = scanner.nextLine().split(" ");
        boolean hasStuckNumbers = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    for (int l = 0; l < numbers.length; l++) {
                        if ((numbers[i] + numbers[j]).equals(numbers[k] + numbers[l]) &&
                                !numbers[i].equals(numbers[j]) &&
                                !numbers[i].equals(numbers[k]) &&
                                !numbers[i].equals(numbers[l]) &&
                                !numbers[j].equals(numbers[k]) &&
                                !numbers[j].equals(numbers[l]) &&
                                !numbers[k].equals(numbers[l])) {
                            System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[k] + "|" + numbers[l]);
                            hasStuckNumbers = true;
                        }

                    }

                }

            }
            
        }
        if (!hasStuckNumbers) {
            System.out.println("No");
        }
    }
}
