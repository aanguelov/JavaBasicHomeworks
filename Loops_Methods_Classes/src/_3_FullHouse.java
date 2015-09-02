import java.util.ArrayList;

public class _3_FullHouse {
    public static void main(String[] args) {
        String[] cards = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        char[] suits = new char[]{'\u2663', '\u2666', '\u2665', '\u2660'};

        ArrayList<String> deckOfCards = new ArrayList<>();

        fillDeckOfCards(cards, suits, deckOfCards);

        int fullHouseCounter = 0;

        for (int i = 0; i < deckOfCards.size(); i++) {

            for (int j = i + 1; j < deckOfCards.size(); j++) {

                for (int k = j + 1; k < deckOfCards.size(); k++) {

                    for (int l = 0; l < deckOfCards.size(); l++) {

                        for (int m = l + 1; m < deckOfCards.size(); m++) {

                            String firstCard = deckOfCards.get(i);
                            String secondCard = deckOfCards.get(j);
                            String thirdCard = deckOfCards.get(k);
                            String fourthCard = deckOfCards.get(l);
                            String fifthCard = deckOfCards.get(m);

                            if (firstCard.charAt(0) == secondCard.charAt(0) &&
                                    firstCard.charAt(0) == thirdCard.charAt(0)) {
                                if (fourthCard.charAt(0) != firstCard.charAt(0) &&
                                        fourthCard.charAt(0) == fifthCard.charAt(0)) {
                                    System.out.println(
                                            firstCard + " " +
                                                    secondCard + " " +
                                                    thirdCard + " " +
                                                    fourthCard + " " +
                                                    fifthCard);

                                    fullHouseCounter++;
                                }
                            }

                        }

                    }

                }

            }

        }

        System.out.println(fullHouseCounter);

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
