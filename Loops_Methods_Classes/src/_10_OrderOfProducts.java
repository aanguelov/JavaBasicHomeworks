import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class _10_OrderOfProducts {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        String path = "C:\\Users\\Laptop\\Desktop\\Input.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(path))) {
            String productsLine = fileReader.readLine();

            while (!productsLine.equals("")) {
                String[] params = productsLine.split(" ");
                String name = params[0];
                BigDecimal price = new BigDecimal(params[1]);
                products.add(new Product(name, price));
                productsLine = fileReader.readLine();
            }

            path = "C:\\Users\\Laptop\\Desktop\\Orders.txt";
            BufferedReader ordersReader = new BufferedReader(new FileReader(path));
            String ordersLine = ordersReader.readLine();

            BigDecimal totalPrice = BigDecimal.ZERO;
            while (!ordersLine.equals("")) {
                String[] params = ordersLine.split(" ");
                double quantity = Double.parseDouble(params[0]);
                Product product = null;
                for (Product product1 : products) {
                    if (product1.name.equals(params[1])) {
                        product = product1;
                    }
                }
                totalPrice = totalPrice.add(product.price.multiply(new BigDecimal(quantity)));
                ordersLine = ordersReader.readLine();
            }

            File outputWriter = new File("C:\\Users\\Laptop\\Desktop\\Output.txt");
            PrintStream  writer = new PrintStream(outputWriter);
            writer.printf("%.1f", totalPrice);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


