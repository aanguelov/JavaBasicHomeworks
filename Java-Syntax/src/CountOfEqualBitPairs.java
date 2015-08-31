import java.util.*;

public class CountOfEqualBitPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String nToBinary = Integer.toBinaryString(n);

        int equalBitPairs = 0;

        for (int i = 0; i < nToBinary.length() - 1; i++) {

            if (nToBinary.charAt(i) == nToBinary.charAt(i + 1)) {
                equalBitPairs++;
            }
        }

        System.out.println(equalBitPairs);
    }
}
