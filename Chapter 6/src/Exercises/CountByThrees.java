package Exercises;

public class CountByThrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLine = 30;
		for(int x = 0; x <= 300; x = x + 3) {
			System.out.print(x + " ");
			if(x % numLine == 0)
				System.out.println();
		}
	}

}
