import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _16_SimpleExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("\\s+", "");
        String[] signs = input.split("\\d");
        List<String> signedNumbers = new ArrayList<>();
        for (String sign : signs) {
            if (!sign.equals("") && !sign.equals(".")) {
                signedNumbers.add(sign);
            }
        }
        String[] numbers = input.split("[+-]");
        if (signedNumbers.size() < numbers.length) {
            signedNumbers.add(0, "+");
        }
        for (int i = 0; i < numbers.length; i++) {
            signedNumbers.set(i, signedNumbers.get(i) + numbers[i]);
        }
        BigDecimal result = new BigDecimal(0);
        for (String signedNumber : signedNumbers) {
            BigDecimal toAdd = new BigDecimal(signedNumber);
            result = result.add(toAdd);
        }
        System.out.println(result);
    }
}
