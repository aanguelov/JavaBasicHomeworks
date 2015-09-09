import java.util.*;

public class _10_ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[\\W]+");

        Set<String> uniqueWords = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            uniqueWords.add(input[i].toLowerCase());
        }

        System.out.println(String.join(" ", uniqueWords));
    }
}
