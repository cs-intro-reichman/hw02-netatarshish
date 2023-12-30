/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String middleLetter = "";
		for(int i = word.length()-1;i>=0;i--){
			System.out.print(word.charAt(i));
		}
		if(word.length()%2==0){
					middleLetter = String.valueOf(word.charAt((word.length()/2)-1));
			}
		else{
				middleLetter = String.valueOf(word.charAt(word.length()/2));
		}
		System.out.println();
		System.out.println("The middle character is " + middleLetter);
	}
}
