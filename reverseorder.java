package main;
import java.util.*;
/*
 * Short java program to take user input on a line and print the input in reverse
 * order on output
 * Author @AK
 */

public class reverseorder {
	public static String c1;
	public static String c2;
	public static String c3;
	public static String c4;
	public static String c5;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //scanner object declared as keyboard
		System.out.println("Please type a random word or sentence");
		c1 = keyboard.next();
		System.out.println("Second word or phrase?");
		c2 = keyboard.next();
		System.out.println("Third");
		c3 = keyboard.next();
		System.out.println("Fourth");
		c4 = keyboard.next();
		System.out.println("Fifth");
		c5 = keyboard.next();
		System.out.println((c5) + " "+ (c4)+ " " + (c3) + " "+ (c2) + " " +(c1));
		
		keyboard.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
