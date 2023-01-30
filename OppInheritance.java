package leonteqsecurity;

public class OppInheritance {
	
	class mother
	{
		String nationality;
		int age;
		String gender;
		
		void walking()
		{
			System.out.println("walking");
		}
		void talking()
		{
			System.out.println("talking");
		}
		
	}
	
	class baby extends mother
	{
		void playing()
		{
			System.out.println("Playing");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OppInheritance oopInheritance =new OppInheritance();
		baby mybaby = oopInheritance.new baby();
//		the baby have inherited the methods and datas from the mother
		mybaby.walking();
		
		

	}

}
