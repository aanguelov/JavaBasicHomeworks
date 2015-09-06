import java.util.*;

public class _14_ExamScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String header1 = scanner.nextLine();
        String header2 = scanner.nextLine();
        String header3 = scanner.nextLine();
        String input = scanner.nextLine().replaceAll("\\s+", " ").substring(1);
        Map<Integer, TreeMap<String, Double>> scoreSheet = new TreeMap<>();
        while (input.charAt(0) != '-') {
            String[] inputParams = input.split("\\|");
            String name = inputParams[0].trim();
            int examScore = Integer.parseInt(inputParams[1].trim());
            double grade = Double.parseDouble(inputParams[2].trim());
            if (!scoreSheet.containsKey(examScore)) {
                scoreSheet.put(examScore, new TreeMap<>());
                scoreSheet.get(examScore).put(name, grade);
            } else {
                scoreSheet.get(examScore).put(name, grade);
            }
            input = scanner.nextLine().replaceAll("\\s+", " ").substring(1);
        }

        for (Integer integer : scoreSheet.keySet()) {
            System.out.print(integer + " -> ");
            TreeMap<String, Double> values = scoreSheet.get(integer);
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Double> grades = new ArrayList<>();
            for (String s : values.keySet()) {
                names.add(s);
                grades.add(values.get(s));
            }
            System.out.print(names + "; ");
            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
            System.out.printf("avg=%.2f", sum/grades.size());
            System.out.println();
        }
    }
}
