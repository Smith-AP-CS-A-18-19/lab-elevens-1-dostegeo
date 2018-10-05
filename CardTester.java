/**
 * This is a class that tests the Card class.
 */
public class CardTester {
Card card = new Card("5", "clubs", 5);

Card card1 = new Card("5", "clubs", 5);

Card card2 = new Card("Queen", "hearts", 12);
 if (card.matches(card1)){
	 System.out.println("Same");
 } else{
	 System.out.println("Different");
 }

 if (card2.matches(card3)){
 	System.out.println("Same");
 } else{
 	System.out.println("Different");
 }

 }


	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

	}
}
