package leonteqsecurity;
import java.util.Scanner;


public class SwitchStatement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String Movies="\n1:BlackList\n2:Equilaizer\n3:BlindSpot";
		System.out.println("BEST HACKERS MOVIE"+ Movies);
		System.out.println("SELECT:");
		int option =sc.nextInt();
		
		
		switch(option)
		{
		case 1:
			System.out.println("You have selected option 1- Blacklist");
			break;
		case 2:
			System.out.println("You have selected option 2-Equilaizer");
			break;
		case 3:
			System.out.println("You have selected option 2-BlindSpot");
			break;
		default:
			System.out.println("invalid option");
			break;
		
		}
		
		
		
		
		
	}

}
