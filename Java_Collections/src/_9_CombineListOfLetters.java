import java.util.*;

public class _9_CombineListOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] firstChars = scanner.nextLine().replaceAll(" ", "").toCharArray();
        char[] secondChars = scanner.nextLine().replaceAll(" ", "").toCharArray();

        List<Character> uniqueChars = new ArrayList<>();
        List<Character> tempChars = new ArrayList<>();
        for (char firstChar : firstChars) {
            uniqueChars.add(firstChar);
            tempChars.add(firstChar);
        }

        for (char secondChar : secondChars) {
            if (!tempChars.contains(secondChar)) {
                uniqueChars.add(secondChar);
            }
        }

        for (Character uniqueChar : uniqueChars) {
            System.out.print(uniqueChar + " ");
        }
    }
}
