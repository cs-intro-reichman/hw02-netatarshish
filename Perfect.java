/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt (args[0]);
		String isPerfect = n + " is a perfect number since " + n +" = ";
		int checkIfPerfect = 0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				checkIfPerfect +=i;
				isPerfect +=i;
				isPerfect +=" ";
				if(checkIfPerfect<n){
					isPerfect +="+ ";
				}
			}
		}
		if(checkIfPerfect==n){
				System.out.println(isPerfect);
			}
			else{
				System.out.println(n + " is not a perfect number");
			}

	}
}
