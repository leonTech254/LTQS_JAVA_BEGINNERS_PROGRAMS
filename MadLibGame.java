package leonteqsecurity;
import java.util.Scanner;
public class MadLibGame {
	public static String roses="red";
	public static String  school="school";
	public static int december=31;
	public static int TotalMarks=0;
	
	public static String CorrectBlock()
	{
		System.out.println("CORRECT BLOCK");
		String paragraph="It is true that Roses are _"+roses +"_ while the sky is blue."
				+ "\nLeon went to _"+school+"_ to learn and granduated on _"+december+"_ December which is the last day of "
				+ "december";
		return paragraph;
	}
	
	public static void Game()
	{
		System.out.println("ANSWER THE FOLLOWING QUESTION");
		System.out.println("It is true that Roses are _____1_____ while the sky is blue."
				+ "\nLeon went to ______2______ to learn and granduated on _______3______ December which is the last day of "
				+ "december");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Roses are");
		String userInputRoses=sc.nextLine();
		
		System.out.println("2.went to ");
		String userInputSchool=sc.nextLine();
		
		System.out.println("3.graduated on ");
		int userInputDecember=sc.nextInt();
		if(roses==userInputRoses)
		{
			System.out.println(roses+" correct");
			TotalMarks+=1;
			
		}else
		{
			System.out.println(userInputRoses+"-Incorrectcorrect");
	
			
		}
		if(school==userInputSchool)
		{
			System.out.println(school+" correct");
			TotalMarks+=1;
			
		}else
			
		{
			System.out.println(userInputSchool+"-Incorrectcorrect");
		}
		if(december==userInputDecember)
		{
			System.out.println(december+"-correct");
			TotalMarks+=1;
			
		}else
			
		{
			System.out.println(userInputDecember+"-Incorrectcorrect");
		}
		System.out.println("TOTAL MARKS "+ TotalMarks+"\n\n");
		System.out.println(CorrectBlock());
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		Game();

	}

}
