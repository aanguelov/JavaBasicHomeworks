import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _8_SumNumbersFromATextFile {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\Laptop\\Desktop\\Input.txt"))) {
            String line = fileReader.readLine();

            int sum = 0;
            while (line != null) {
                sum += Integer.parseInt(line);
                line = fileReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
