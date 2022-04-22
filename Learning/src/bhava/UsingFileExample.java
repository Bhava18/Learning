package bhava;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String location="UsingFileExample.txt";
		String content="Learning java is simple";
		FileWriter filewriter=new FileWriter(location);
		filewriter.write(content);
		filewriter.close();

	}

}
