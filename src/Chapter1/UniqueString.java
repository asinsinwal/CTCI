/**
 * 
 */
package Chapter1;

import java.util.Scanner;

/**
 * @author a_sinsinwal
 *
 */
public class UniqueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"Animesh", "Aasheesh", "Rutvij", "Saurabh", "Omkar", "Bhavya", "Mit"};
		int count = 0;
		System.out.println("Program to check whether string input is unique or not.");
		System.out.println("Default Inputs.");
		for(String word : input){
			count++;
			System.out.println(count + " " + word + " - " + isUnique(word));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try out one time. Give any string: ");
		String user_input = sc.nextLine();
		System.out.println("Your String: " + user_input + " - " + isUnique(user_input));
		sc.close();
	}

	private static boolean isUnique(String word) {
		// TODO Auto-generated method stub
		
		if(word.length() > 128){
			System.out.println("String length is more than the total no. of different characters.");
			return false;
		}
		
		boolean[] chars =  new boolean[128];
		
		for(int i = 0; i < word.length();i++){
			int val = word.charAt(i);
			
			if(chars[val])
				return false;
			chars[val] = true;
		}
		return true;
	}
}
