import java.util.HashMap;
public class Blackjack {
		private HashMap<String, Integer> cards = new HashMap<String, Integer>() {{
			put("ace", 11); 	put("two", 2); 		put("three", 3);
			put("four", 4); 	put("five", 5); 	put("six", 6);
			put("seven", 7); 	put("eight", 8); 	put("nine", 9);
			put("ten", 10); 	put("jack", 10); 	put("queen", 10); put("king", 10);
		}};

    public int parseCard(String card) {
			return cards.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
			if (cards.get(card1) + cards.get(card2) == 21)
				return true;
			else 
				return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
			if (!isBlackjack) {
				return "P";
			} else {
				if (dealerScore != 11 && dealerScore != 10) {
					return "W";
				} else {
					return "S";
				}
			}
    }

    public String smallHand(int handScore, int dealerScore) {
			if (handScore >= 17) return "S";
			else if (handScore <= 11) return "H";
			else if (handScore >= 12 && handScore <= 16)
				if (dealerScore >= 7) return "H";
			return "S";
		}

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
