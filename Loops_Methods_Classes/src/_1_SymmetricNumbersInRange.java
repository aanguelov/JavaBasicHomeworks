import java.util.*;

public class _1_SymmetricNumbersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.next());
        int end = Integer.parseInt(scanner.next());

        for (int i = start; i <= end; i++) {

            String numberAsString = Integer.toString(i);
            if (i < 10) {
                System.out.print(i + " ");
            }else if (i < 100) {
                if (numberAsString.charAt(0) == numberAsString.charAt(1)) {
                    System.out.print(i + " ");
                }
            } else {
                if (numberAsString.charAt(0) == numberAsString.charAt(2)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
