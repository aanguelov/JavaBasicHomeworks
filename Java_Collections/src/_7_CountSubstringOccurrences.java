import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _7_CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String match = scanner.nextLine();
        Pattern pattern = Pattern.compile(match.toLowerCase());
        Matcher matcher = pattern.matcher(input.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
