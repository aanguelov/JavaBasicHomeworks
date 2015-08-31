import java.util.*;

public class PointsInsideAHouse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        double mX = Double.parseDouble(scanner.next());
        double mY = Double.parseDouble(scanner.next());

        double aX = 12.5;
        double aY = 8.5;

        double bX = 17.5;
        double bY = 3.5;

        double cX = 22.5;
        double cY = 8.5;

        double ab = (bX - aX) * (mY - aY) - (bY - aY) * (mX - aX);
        double bc = (bX - cX) * (mY - cY) - (bY - cY) * (mX - cX);
        double ac = (aX - cX) * (mY - cY) - (aY - cY) * (mX - cX);

        if (checkTriangle(ab, bc, ac) || checkFirstRectangle(mX, mY) || checkSecondRectangle(mX, mY)) {
            System.out.println("Inside");
        }else {
            System.out.println("Outside");
        }
    }

    private static boolean checkTriangle(double a, double b, double c) {
        if (a >= 0 && b <= 0 && c >= 0) {
            return true;
        }
        return false;
    }

    private static boolean checkFirstRectangle(double x, double y) {
        if ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) {
            return true;
        }

        return false;
    }

    private static boolean checkSecondRectangle(double x, double y) {
        if ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) {
            return true;
        }

        return false;
    }
}
