import java.util.Scanner;


public class Challenge1 {

	static Scanner input = new Scanner(System.in);
	static char goAgain; 
	
	public static void repeat(){
		System.out.println("Would you like to go again? Y/N");
		goAgain = input.next().charAt(0);
		goAgain = Character.toLowerCase(goAgain);
		if (goAgain == 'y'){
			main(null);
		}
		else if (goAgain == 'n') {
			System.out.println("Bye bye!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid input");
			repeat();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input your first number: ");
		float var1 = input.nextFloat();
		System.out.println("Please input your second number: ");
		float var2 = input.nextFloat();
		System.out.println("Input a '1' for addition or input a '2' for subtraction");
		int var3 = input.nextInt();
		
		if (var3 == 1){
			float addResult = var1 + var2;
			System.out.println("The sum of " + var1 + " and " + var2 + " is: " + addResult + "\n\n");
			repeat();
				
		}
		else{
			float subResult = var1 - var2;
			System.out.println("The difference of " + var1 + " and " + var2 + " is " + subResult  + "\n\n");
			repeat();
			
		}

	}

}
