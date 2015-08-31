import java.util.*;

public class CountOfBitsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());

        String nToBinary = Integer.toBinaryString(n);

        int countOfBitsOne = 0;
        for (int i = 0; i < nToBinary.length(); i++) {

            if (nToBinary.charAt(i) == '1') {
                countOfBitsOne++;
            }
        }

        System.out.println(countOfBitsOne);
    }
}
