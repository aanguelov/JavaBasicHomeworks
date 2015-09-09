import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<String> sequence = new ArrayList<>();
        for (int i = 0; i < input.length - 1; i++) {
            List<String> temp = new ArrayList<>();
            temp.add(input[i]);
            while ((i < input.length - 1) && (input[i + 1].equals(input[i]))) {
                temp.add(input[i + 1]);
                i++;
            }
            if (temp.size() > sequence.size()) {
                sequence.clear();
                sequence.addAll(temp);
            }
        }
        if (input.length == 1) {
            sequence.add(input[0]);
        }
        System.out.println(sequence);
    }
}
