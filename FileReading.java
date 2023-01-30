package leonteqsecurity;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String FilePath="output.txt";
			BufferedReader reader=new BufferedReader(new FileReader(FilePath));
			String line=reader.readLine();
			
			while(line!=null)
			{
				System.out.println(line);
			
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	
				
		
		

	}

}
