import java.util.*;

public class _2_Generate3LetterWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();

        for (int i = 0; i < letters.length(); i++) {

            for (int j = 0; j < letters.length(); j++) {

                for (int k = 0; k < letters.length(); k++) {

                    StringBuilder threeLetterWord = new StringBuilder();
                    threeLetterWord
                            .append(letters.charAt(i))
                            .append(letters.charAt(j))
                            .append(letters.charAt(k));
                    System.out.print(threeLetterWord.toString() + " ");

                }

            }

        }
    }
}
