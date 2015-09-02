import java.util.*;

public class _5_AngleUnitConverter {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        int numberOfConvertions = Integer.parseInt(scanner.nextLine());

        Map<Double, String> angles = new HashMap<>();
        for (int i = 0; i < numberOfConvertions; i++) {

            angles.put(scanner.nextDouble(), scanner.nextLine().trim());

        }

        for (Map.Entry<Double, String> doubleStringEntry : angles.entrySet()) {
            String converted;
            if (doubleStringEntry.getValue().equals("deg")) {
                converted = convertToRadians(doubleStringEntry.getKey());
            } else {
                converted = convertToDegrees(doubleStringEntry.getKey());
            }
            System.out.println(converted);
        }
    }

    private static String convertToRadians(double number){
        number = number*Math.PI/180;
        String temp = String.format("%.6f rad", number);

        return temp;
    }

    private static String convertToDegrees(double number){
        number = number*180/Math.PI;
        String temp = String.format("%.6f deg", number);

        return temp;
    }
}
