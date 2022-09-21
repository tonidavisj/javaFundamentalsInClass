package javaVariables;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		int a, b = 7, c = 8, d ;
		
		int newScore = 2;
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		System.out.print("Enter an integer: ");
		
        //int number = input.nextInt();
        
        System.out.println("You entered " + number);

        input.close();
        
		d = 10;
		
		a = b + c + d;
		
		// newScore = newScore + 2;
		newScore += 2;
		
		System.out.println(a);
		
		System.out.println("Toni D");
		System.out.print("Toni D 2");
		System.out.println("Toni D 3");
		
		
	}

}
