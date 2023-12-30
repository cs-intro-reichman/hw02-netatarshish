
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int random = (int) (Math.random()*2);
		int currentChild = random;
		int counter = 1;
		if(currentChild==0){
				System.out.print("g ");
			}
			else{
				System.out.print("b ");
			}
		while(currentChild==random||counter==0){
			currentChild = (int) (Math.random()*2);
			counter +=1;
			if(currentChild==0){
				System.out.print("g ");
			}
			else{
				System.out.print("b ");
			}
			
		}
		System.out.println();
		System.out.println("You made it... and now you have " + counter + " children.");
	}
}
