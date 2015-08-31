import java.util.*;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        float aX = scanner.nextFloat();
        float aY = scanner.nextFloat();

        if (checkFirstFigure(aX, aY) || checkSecondFigure(aX, aY) || checkThirdFigure(aX, aY)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }

    private static boolean checkFirstFigure(float x, float y){
        boolean isInside = false;

        if ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 8.5)) {
            isInside = true;
        }

        return isInside;
    }

    private static boolean checkSecondFigure(float x, float y){
        boolean isInside = false;

        if ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) {
            isInside = true;
        }

        return isInside;
    }

    private static boolean checkThirdFigure(float x, float y){
        boolean isInside = false;

        if ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) {
            isInside = true;
        }

        return isInside;
    }
}
