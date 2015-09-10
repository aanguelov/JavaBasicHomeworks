import java.util.*;

public class _17_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, Integer>> usersByIpAndDuration = new TreeMap<>();
        String[] input;
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine().split(" ");
            String ip = input[0];
            String user = input[1];
            int duration = Integer.parseInt(input[2]);
            if (!usersByIpAndDuration.containsKey(user)) {
                usersByIpAndDuration.put(user, new TreeMap<>());
                Integer value = usersByIpAndDuration.get(user).get(ip);
                if (value == null) {
                    value = 0;
                }
                usersByIpAndDuration.get(user).put(ip, value + duration);
            } else {
                Integer value = usersByIpAndDuration.get(user).get(ip);
                if (value == null) {
                    value = 0;
                }
                usersByIpAndDuration.get(user).put(ip, value + duration);
            }
        }
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : usersByIpAndDuration.entrySet()) {
            String user = stringMapEntry.getKey();
            Map<String, Integer> value = stringMapEntry.getValue();
            ArrayList<String> ipAddresses = new ArrayList<>();
            int totalDuration = 0;
            for (Map.Entry<String, Integer> stringIntegerEntry : value.entrySet()) {
                ipAddresses.add(stringIntegerEntry.getKey());
                totalDuration += stringIntegerEntry.getValue();
            }
            System.out.println(user + ": " + totalDuration + " " + ipAddresses);
        }
    }
}
