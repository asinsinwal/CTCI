/**
 * 
 */
package Chapter1;

import java.util.Scanner;

/**
 * @author a_sinsinwal
 *
 */
public class PermutationString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check whether a string matches with another string by any permutation.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String input1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String input2 = sc.nextLine();
		
		System.out.println("Is \"" + input2 + "\" has any match with \"" + input1 + "\" with any permutation? - " + doesMatch(input1, input2));
		
		System.out.println("Solution by sorting. Answer: " + sortCheckPermutation(input1, input2));

	}

	private static boolean sortCheckPermutation(String input1, String input2) {
		// TODO Auto-generated method stub
		return sort(input1).equals(sort(input2));
	}

	private static String sort(String input) {
		// TODO Auto-generated method stub
		char[] str = input.toCharArray();
		java.util.Arrays.sort(str);
		return new String(str);
	}

	private static boolean doesMatch(String input1, String input2) {
		// TODO Auto-generated method stub
		if(input1.length() != input2.length())
			return false;
		//Increase the value by 1 for every character encountered in string 1
		int length = input1.length();
		int[] chars = new int[128];
		
		for(int i = 0; i<length; i++){
			int value = input1.charAt(i);
			chars[value]++;
		}
		
		int match_count = 0;
		//Decrease the value by 1 for every character encountered in string 2
		for(int j = 0; j<length; j++){
			int value = input2.charAt(j);
			
			if(chars[value] > 0){
				chars[value]--;
				match_count++;
			}
		}
		
		if(match_count == length)
			return true;
		return false;
	}

}
