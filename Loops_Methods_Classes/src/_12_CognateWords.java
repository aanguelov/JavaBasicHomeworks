import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _12_CognateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matchedWords = scanner.nextLine().split("[^a-zA-Z]+");

        Set<String> matches = new HashSet<>();
        for (int i = 0; i < matchedWords.length; i++) {
            for (int j = 0; j < matchedWords.length; j++) {
                for (int k = 0; k < matchedWords.length; k++) {
                    if (i != j) {
                        boolean check = (matchedWords[i] + matchedWords[j]).equals(matchedWords[k]);
                        if (check) {
                            matches.add(String.format("%s|%s=%s", matchedWords[i], matchedWords[j], matchedWords[k]));
                        }
                    }

                }

            }

        }
        if (matches.size() > 0) {
            for (String match : matches) {
                System.out.println(match);
            }
        } else {
            System.out.println("No");
        }
    }
}
