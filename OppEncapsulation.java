package leonteqsecurity;

public class OppEncapsulation {
	private String name;
	private int age;
	public int getAge()
	{
		return age;
	}
	
	public void setAge()
	{
		this.age=22;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name="martin";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OppEncapsulation oppEnca=new OppEncapsulation();
		oppEnca.setAge();
		int myage=oppEnca.getAge();
		System.out.println(myage);
		
		

	}

}
