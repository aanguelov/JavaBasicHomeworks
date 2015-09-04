import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class _9_ListOfProducts {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        ArrayList<Product> products = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\Laptop\\Desktop\\Input.txt"))) {
            String line = fileReader.readLine();

            while (!line.equals("")) {
                String[] params = line.split(" ");
                String name = params[0];
                BigDecimal price = new BigDecimal(params[1]);
                products.add(new Product(name, price));
                line = fileReader.readLine();
            }

            Collections.sort(products);

            File outputWriter = new File("C:\\Users\\Laptop\\Desktop\\Output.txt");
            PrintStream  writer = new PrintStream(outputWriter);
            for (Product product : products) {
                writer.printf("%s %.2f", product.name, product.price);
                writer.println();
            }

            fileReader.close();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}

class Product implements Comparable<Product>{

    String name;
    BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.price.compareTo(otherProduct.price);
    }
}
