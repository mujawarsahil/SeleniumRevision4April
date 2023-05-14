package Logical.askedInInterview;

import java.util.Scanner;

public class Example02_printFirstAndLastCharInTheName {

	public static void main(String[] args) {
		String name;
		System.out.println("Enter your  name:");
		Scanner sc = new Scanner(System.in);
		name=sc.next();
		
		System.out.println("char at first position is "+name.charAt(0));
		System.out.println("char at last position is "+name.charAt(name.length()-1));
		
	}
}
