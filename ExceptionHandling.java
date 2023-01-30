package leonteqsecurity;

public class ExceptionHandling {
	public static float divide(int a,int b)
	{
		float result=(float)a/b;
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			float result=divide(50,0);
			System.out.println(result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot perform the operation");
		}
		finally
		{
			System.out.println("errors handled");
			
		}
		
		
		
		
		

	}

}
