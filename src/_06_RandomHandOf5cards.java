import java.util.Random;


public class _06_RandomHandOf5cards {

	public static void main(String[] args) {
		String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K", "A"};
    	Random random = new Random();
    	int suit;
    	int rank;
    	for (int i=0; i<5; i++){
    		suit = random.nextInt(4);
        	rank = random.nextInt(13);
        	System.out.println(ranks[rank]+" "+suits[suit]);
    	}
	}
}
