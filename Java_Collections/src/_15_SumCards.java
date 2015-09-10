import java.util.Scanner;

public class _15_SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hand = scanner.nextLine().split(" ");
        int handValue = 0;
        for (int i = 0; i < hand.length; i++) {
            String card = hand[i];
            String cardFace = card.substring(0, card.length() - 1);
            int cardValue = getCardValue(cardFace);
            handValue += cardValue;
        }
        int sequenceCounter = 1;
        for (int i = 0; i < hand.length - 1; i++) {
            String card = hand[i];
            String cardFace = card.substring(0, card.length() - 1);
            String nextCardFace = hand[i + 1].substring(0, hand[i + 1].length() - 1);
            int cardValue = getCardValue(cardFace);
            if (cardFace.equals(nextCardFace)) {
                sequenceCounter++;
            }
            if (sequenceCounter > 1 && !cardFace.equals(nextCardFace)) {
                handValue += cardValue*sequenceCounter;
                sequenceCounter = 1;
            }
            if (sequenceCounter > 1 && i == hand.length - 2) {
                handValue += cardValue*sequenceCounter;
                sequenceCounter = 1;
            }
        }
        System.out.println(handValue);
    }

    private static int getCardValue(String cardFace) {
        int cardValue = 0;
        switch (cardFace) {
            case "2":
                cardValue = 2;
                break;
            case "3":
                cardValue = 3;
                break;
            case "4":
                cardValue = 4;
                break;
            case "5":
                cardValue = 5;
                break;
            case "6":
                cardValue = 6;
                break;
            case "7":
                cardValue = 7;
                break;
            case "8":
                cardValue = 8;
                break;
            case "9":
                cardValue = 9;
                break;
            case "10":
                cardValue = 10;
                break;
            case "J":
                cardValue = 12;
                break;
            case "Q":
                cardValue = 13;
                break;
            case "K":
                cardValue = 14;
                break;
            case "A":
                cardValue = 15;
                break;
        }
        return cardValue;
    }
}
