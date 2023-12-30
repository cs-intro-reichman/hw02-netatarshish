/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int lastNum = 0;
		int randomNum = (int) (Math.random()*10);
		while(randomNum>=lastNum){
			lastNum = randomNum;
			randomNum = (int) (Math.random()*10);
			System.out.print(lastNum + " ");
		}


	}
}
