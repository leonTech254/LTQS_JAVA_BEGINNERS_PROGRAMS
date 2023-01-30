package leonteqsecurity;
import java.util.Scanner;

public class GuessingGame {
	public static int attempts=0;
	
	public static int Random()
	{
		int Randomnumbers=(int)(Math.random()*100+1);
		
		return Randomnumbers;
		
	}
	
	public static void Game()
	{
		int Generated=Random();
		System.out.println("GUESS A NUMBER BETWEEN 1-100");
		Scanner sc= new Scanner(System.in);
		int UserInput=sc.nextInt();
		System.out.println(UserInput);
//		sc.close();
//		This condation checks if the System number is correct with the user Guess number
		if (Generated==UserInput)
		{
			System.out.println("Correct! you won the Gessing game challange");
			attempts+=1;
			System.out.println("in " + attempts+ " attempts");
			
		}
		else
		{
			System.out.println("Guess Failed the correct number is "+ Generated);
			attempts+=1;
			System.out.println("Number of attempts " + attempts);
			
			System.out.println("DO YOU WANT TO PLAY AGAIN? (1=Yes,0=No)");
			int UserResponse=sc.nextInt();
			if (UserResponse==1)
			{
				Game();
				
			}else
			{
				System.out.println("GAME OVER....EXITED!");
			}
				
			
			
			
		}
	}
	

	public static void main(String[] args) {
			Game();
		

	}

}
