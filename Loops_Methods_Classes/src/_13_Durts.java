import java.util.Scanner;

public class _13_Durts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cX = Double.parseDouble(scanner.next());
        double cY = Double.parseDouble(scanner.nextLine());
        double radius = Double.parseDouble(scanner.nextLine());
        int numberOfDarts = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfDarts; i++) {

            double dartX = Double.parseDouble(scanner.next());
            double dartY = Double.parseDouble(scanner.next());

            if (checkMainBody(cX, cY, radius, dartX, dartY) ||
                    checkTop(cX, cY, radius, dartX, dartY) ||
                    checkBottom(cX, cY, radius, dartX, dartY)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean checkMainBody(double centerX, double centerY, double radius, double dartX, double dartY) {
        boolean isInside = false;
        if ((dartX >= centerX - radius) && (dartX <= centerX + radius) &&
                (dartY >= centerY - radius / 2) && (dartY <= centerY + radius / 2)) {
            isInside = true;
        }
        return isInside;
    }

    private static boolean checkTop(double centerX, double centerY, double radius, double dartX, double dartY) {
        boolean isInside = false;
        if ((dartX >= centerX - radius / 2) && (dartX <= centerX + radius / 2) &&
                (dartY >= centerY + radius / 2) && (dartY <= centerY + radius)) {
            isInside = true;
        }
        return isInside;
    }

    private static boolean checkBottom(double centerX, double centerY, double radius, double dartX, double dartY) {
        boolean isInside = false;
        if ((dartX >= centerX - radius / 2) && (dartX <= centerX + radius / 2) &&
                (dartY <= centerY - radius / 2) && (dartY >= centerY - radius)) {
            isInside = true;
        }
        return isInside;
    }
}
