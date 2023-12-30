/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numberOfChecks = Integer.parseInt(args[0]);
		double average = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourChildrenOrMore = 0;
		double sumCounters = 0;
		for(int i = 0;i<numberOfChecks;i++){
			int random = (int) (Math.random()*2);
			int currentChild = random;
			int counter = 1;
			while(currentChild==random){
				currentChild = (int) (Math.random()*2);
				counter +=1;
			}
			
		if(counter==2){
			twoChildren+=1;
		}
		else if (counter==3){
			threeChildren+=1;
		}
		else{
			fourChildrenOrMore+=1;
		}
		sumCounters+=counter;
		
	}
	average = sumCounters/numberOfChecks;
	System.out.println("Average: "+average+" children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: "+twoChildren);
	System.out.println("Number of families with 3 children: "+threeChildren);
	System.out.println("Number of families with 4 or more children: "+fourChildrenOrMore);
	if(twoChildren>=threeChildren){
		if(twoChildren>=fourChildrenOrMore){
			System.out.println("The most common number of children is 2.");
		}
		else{
			System.out.println("The most common number of children is 4 or more");
		}
	}
	else{
		if(threeChildren>=fourChildrenOrMore){
			System.out.println("The most common number of children is 3.");
		}
	}
	
}
}
