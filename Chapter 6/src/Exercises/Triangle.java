package Exercises;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0, b = 0;
		double c = 0;
		int choiceYes = 1;
		String firstChoice;
		Scanner input = new Scanner(System.in);
		while (choiceYes == 1) {
			System.out.println("This will help you solve sides of a right triangle using the pythagorean +"
					+ "theorem! Note do not have Square numbers input");
			
		
				System.out.println("Which side do you want to find a, b, or c >> ");
		firstChoice = input.nextLine();
		if(firstChoice.equalsIgnoreCase("a")) {
			System.out.print("Please enter the value of B >> ");
			b = input.nextDouble();
			System.out.print("Please enter the value of C >> ");
			c= input.nextDouble();
			c = c * c;
			b = b * b;
		}
		if(firstChoice.equalsIgnoreCase("b")) {
			System.out.print("Please enter the value of C >> ");
			c = input.nextDouble();
			System.out.print("Please enter the value of A >> ");
			a = input.nextDouble();
			c = c * c;
			a = a * a;
		}
		if(firstChoice.equalsIgnoreCase("c")) {
			System.out.print("Please enter the value of B >> ");
			b = input.nextDouble();
			System.out.print("Please enter the value of A >> ");
			a = input.nextDouble();
			a = a * a;
			b = b * b;
		}
		if (a == 0) {
			a = Math.sqrt(c) - Math.sqrt(b);
			System.out.println("Your answer for the missing side is " + a);
			System.out.println("Do you want to do another triangle?");
			choiceYes = input.nextInt();
		}
		if (b == 0) {
			b = Math.sqrt(c) - Math.sqrt(a);
			System.out.println("Your answer for the missing side is " + b);
			System.out.println("Do you want to do another triangle?");
			choiceYes = input.nextInt();
		}
		if (c == 0) {
			c = Math.sqrt(a) + Math.sqrt(b);
			System.out.println("Your answer for the missing side is " + c);
			System.out.println("Do you want to do another triangle?");
			choiceYes = input.nextInt();
		}
		}
		input.close();
	}

}
