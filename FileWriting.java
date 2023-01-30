package leonteqsecurity;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="i love java";
		String outputfile="./output.txt";
		File file =new File(outputfile);
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			writer.write(content);
			writer.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	
		
		

	}

}
