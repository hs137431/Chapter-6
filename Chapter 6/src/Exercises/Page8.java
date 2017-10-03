package Exercises;

import java.util.Scanner;

public class Page8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] scores = new int [10];
		
		int score = 0;
		int count = 0;
		int total = 0;
		int high = 0;
		int low = 998;
		
		int quit = 999;
		int max = 100;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a quiz score or " + quit + " to quit >>> ");
		score = input.nextInt();
		
		while(score != quit)
		{
			scores[count] = score;
			total += scores[count];
			++count;
			if(count == max)
				score = quit;
			else
			{
				if(score >= high)
					high = score;
				if(score <= low)
					low = score;
				System.out.println("Enter next quiz score  or " + quit + " to quit >>> ");
			score = input.nextInt();
			}
		}
		System.out.print("The scores entered were: ");

	for(int x = 0 ; x < count; ++x)
		System.out.println(scores[x] + " ");
	if (count != 0)
		System.out.println("\n The average is " + (total * 1)/count + " Highest = " + high + " Lowest = " + low); 
	else
		System.out.println("No scores entered");
	}

}
