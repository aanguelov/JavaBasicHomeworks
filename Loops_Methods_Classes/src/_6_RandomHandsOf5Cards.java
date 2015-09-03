import java.util.*;

public class _6_RandomHandsOf5Cards {
    public static void main(String[] args) {
        String[] cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        char[] suits = new char[]{'\u2663', '\u2666', '\u2665', '\u2660'};

        ArrayList<String> deckOfCards = new ArrayList<>();

        fillDeckOfCards(cards, suits, deckOfCards);

        Scanner scanner = new Scanner(System.in);
        int handsNumber = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();
        for (int i = 0; i < handsNumber; i++) {

            HashSet<Integer> cardIndices = new HashSet<>();
            while (cardIndices.size() <= 4) {
                int nextIndex = rnd.nextInt(52);
                cardIndices.add(nextIndex);
            }
            for (Integer cardIndex : cardIndices) {
                System.out.print(deckOfCards.get(cardIndex) + " ");
            }
            System.out.println();
        }
    }

    private static void fillDeckOfCards(String[] cards, char[] suits, ArrayList<String> deckOfCards) {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                String currentCard = cards[i] + suits[j];
                deckOfCards.add(currentCard);
            }
        }
    }
}
