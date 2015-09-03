import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _7_DaysBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateAsString = scanner.nextLine();
        dateAsString = dateAsString.length() == 10 ? dateAsString : "0" + dateAsString;
        String secondDateAsString = scanner.nextLine();
        secondDateAsString = secondDateAsString.length() == 10 ? secondDateAsString : "0" + secondDateAsString;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDate = LocalDate.parse(dateAsString, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateAsString, formatter);

        long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println(days);
    }
}
