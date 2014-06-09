
public class _04_FullHouseWtihJokers {
	public static void main(String[] args) {
		String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
        String[] cards = new String[53];
        for (int i = 0; i<52; i++){
        	int suit = i/13;
        	int rank = i%13;
        	System.out.println(ranks[rank]+" "+suits[suit]);
        	cards[i] = ranks[rank]+" "+suits[suit];
        }
        cards[52] = "*";
        int fullHouses = 0;
        for (String card1: cards){
        	for (String card2: cards){
        		for (String card3: cards){
        			
        			if ((card1.charAt(0) == card2.charAt(0) || card1.charAt(0)=='*' || card2.charAt(0)=='*')
        					&& (card2.charAt(0) == card3.charAt(0) || card1.charAt(0)=='*' || card2.charAt(0)=='*')){
	        			for (String card4: cards){
	        				for (String card5: cards){
	        		        	if ((card4.charAt(0) == card5.charAt(0) || card4.charAt(0)=='*' || card5.charAt(0)=='*')
	        		        			&& card5.charAt(0)!=card1.charAt(0)){
	        		        		fullHouses++;
	        		        		System.out.println(card1+" "+card2+" "+card3+" "+card5+" "+card5);
	        		        	}
	        		        }
	        	        }
        			}
                }
            }
        }
        System.out.println("The fullhouses are: " + fullHouses);
	}
}
