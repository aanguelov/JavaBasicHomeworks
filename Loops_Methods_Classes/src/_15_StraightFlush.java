import java.util.*;

public class _15_StraightFlush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[,\\s]+");

        ArrayList<String> straightFlush = new ArrayList<>();
        boolean hasFlushes = false;

        for (int i = 0; i < input.length; i++) {
            String card = input[i];

            straightFlush.add(card);
            for (int j = 0; j < input.length; j++) {
                String nextCard = input[j];
                if (isNextCardSuitable(card, nextCard)) {
                    straightFlush.add(nextCard);
                    card = nextCard;
                    j = -1;
                }
                if (straightFlush.size() == 5) {
                    System.out.println(straightFlush);
                    straightFlush.clear();
                    hasFlushes = true;
                    break;
                }
                if (j == input.length - 1) {
                    straightFlush.clear();
                }
            }
        }
        if (!hasFlushes) {
            System.out.println("No Straight Flushes");
        }
    }

    private static boolean isNextCardSuitable(String card, String nextCard) {
        boolean isSuitable = false;
        String faceValue;
        if (card.length() < 3) {
            faceValue = card.substring(0, 1);
        } else {
            faceValue = card.substring(0, 2);
        }
        if (card.charAt(card.length() - 1) == nextCard.charAt(nextCard.length() - 1)) {
            switch (nextCard.charAt(0)) {
                case '3':
                    if (faceValue.equals("2")) {
                        isSuitable = true;
                    }
                    break;
                case '4':
                    if (faceValue.equals("3")) {
                        isSuitable = true;
                    }
                    break;
                case '5':
                    if (faceValue.equals("4")) {
                        isSuitable = true;
                    }
                    break;
                case '6':
                    if (faceValue.equals("5")) {
                        isSuitable = true;
                    }
                    break;
                case '7':
                    if (faceValue.equals("6")) {
                        isSuitable = true;
                    }
                    break;
                case '8':
                    if (faceValue.equals("7")) {
                        isSuitable = true;
                    }
                    break;
                case '9':
                    if (faceValue.equals("8")) {
                        isSuitable = true;
                    }
                    break;
                case '1':
                    if (faceValue.equals("9")) {
                        isSuitable = true;
                    }
                    break;
                case 'J':
                    if (faceValue.equals("10")) {
                        isSuitable = true;
                    }
                    break;
                case 'Q':
                    if (faceValue.equals("J")) {
                        isSuitable = true;
                    }
                    break;
                case 'K':
                    if (faceValue.equals("Q")) {
                        isSuitable = true;
                    }
                    break;
                case 'A':
                    if (faceValue.equals("K")) {
                        isSuitable = true;
                    }
                    break;
            }
        }
        return isSuitable;
    }
}
