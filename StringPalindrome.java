/*
 * File       :StringPalindrome.java
 * Description:Java program to check whether a string is palindrome or not
 * Author     :Emitta Mathew
 * Version    :1.0
 * Date       :29/09/23
 *              
 */
package javalab;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
	}
	/*Function receives a string as input
	 * return true if it is palindrome
	 * return false if it is not palindrome
	 */
static boolean check(String input) {
	char[]charArray=input.toCharArray();
	int length =input.length();
	for(int i=0;i<=length/2;i++) {
		if(charArray[i]!=charArray[length-i-1]) {
			return false;
		}
}
	return true;
}
}