package quiz;

import java.util.*;
public class quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		female();
		male();
		

	}
	
	public static void female() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input female height in feet: ");
		int feet = in.nextInt();
		System.out.print("Input female height in inch: ");
		int inch = in.nextInt();
		System.out.println("The ideal weight for a female is " + (40 + ((feet-5)*12*5) + (inch*5)) + "kg");
		
	}
	
	public static void male() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input male height in feet: ");
		int feet = in.nextInt();
		System.out.print("Input male height in inch: ");
		int inch = in.nextInt();
		System.out.println("The ideal weight for a male is " + (50 + ((feet-5)*12*6) + (inch*6)) + "kg");
	
	}
}
