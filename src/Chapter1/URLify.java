/**
 * 
 */
package Chapter1;

import java.util.Scanner;

/**
 * @author a_sinsinwal
 *
 */
public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program replace the space character with \"%20\" in a given string and its true length.\n");
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any string: ");
		String input = sc.nextLine();
		
		System.out.println("Enter its true length: ");
		int length = Integer.parseInt(sc.nextLine());
		
		System.out.println("URLify the string \"" + input + "\" "+ urilfy(input, length));
		
		sc.close();
	}

	private static String urilfy(String string, int trueLen) {
		// TODO Auto-generated method stub
		
		String newstring = string.substring(0, trueLen);
		String[] parts = newstring.split(" ");
		System.out.println(newstring);
		String result;
		result = parts[0];
		
		for(int i = 1; i<parts.length; i++){
			result += "%20" + parts[i];
		}
		//Check for the last character, if it was a space character
		//then add "%20" to the end of the string
		if(newstring.charAt(trueLen-1) == ' ')
			result += "%20";
		
		return result;
	}

}
