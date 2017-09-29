package Tutorial;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Count to 100");
		
		for (int x = 0; x <= 100; ++x) {
			System.out.println(x + "");
		}
		
		int z = 0;
		int choiceYes = 1;
		do {
			System.out.println(z + "");
			++z;
		System.out.print("Would You like to do another Triangle press 1 if yes 2 if no");
		}while (choiceYes == 1);
		
	}

}
