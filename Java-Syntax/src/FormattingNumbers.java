import java.util.*;

public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.next());
        float b = Float.parseFloat(scanner.next());
        float c = Float.parseFloat(scanner.next());

        String aToHex = Integer.toHexString(a);
        int aToBinary = Integer.parseInt(Integer.toBinaryString(a));

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", aToHex.toUpperCase(), aToBinary, b, c);
    }
}
