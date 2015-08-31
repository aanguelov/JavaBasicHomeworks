import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();

        double slopeAB = ((double) bY - aY) / (bX - aX);
        double slopeAC = ((double) cY - aY) / (cX - aX);

        int area;
        if (slopeAB != slopeAC) {
            area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
        } else {
            area = 0;
        }

        System.out.println(Math.abs(area));
    }
}
