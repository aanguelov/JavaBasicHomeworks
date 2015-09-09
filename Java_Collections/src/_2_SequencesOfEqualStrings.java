import java.util.Scanner;

public class _2_SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        if (input.length == 1) {
            System.out.println(input[0]);
        }
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + " ");
            while ((i < input.length - 1) && (input[i].equals(input[i + 1]))) {
                System.out.print(input[i + 1] + " ");
                i++;
            }
            System.out.println();
        }
        if ((input.length > 1) && (!input[input.length - 1].equals(input[input.length - 2]))) {
            System.out.println(input[input.length - 1]);
        }
    }
}
