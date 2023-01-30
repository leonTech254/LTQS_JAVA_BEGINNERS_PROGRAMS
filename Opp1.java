package leonteqsecurity;

public class Opp1 {
       class Dog
	{
		String breed;
		String color;
		int age;
	 void barking()
	 {
		 System.out.println("barking");
	 }
	 void sleeping()
	 {
		 System.out.println("sleeping");
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opp1 opp =new Opp1();
		Dog mydog = opp.new Dog();
		mydog.age=12;
		mydog.sleeping();
		
		


	}

}
