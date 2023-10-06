/*
 * File       :Frequencyofcharacter.java
 * Description:Java program to find the frequency of a character in a string
 * Author     :Emitta Mathew
 * Version    :1.0
 * Date       :29/09/23
 *              
 */
package javalab;

import java.util.Scanner;
public class Frequencyofcharacter{
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//input the string
		System.out.println("Enter a string");
		String input=sc.nextLine();
		//input the character to count the frequency
		System.out.println("Enter a character");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("The occurence of the given character is "+charCount);
	}
    static int checkFreq(String input,char checkMe) {
    	char [] charArray=input.toCharArray();
    	int charCount=0;
    	for(int i=0;i<input.length();i++) {
    		if(charArray[i]==checkMe) {
    			charCount++;
    		}
    	}
    	return charCount;
    }
}