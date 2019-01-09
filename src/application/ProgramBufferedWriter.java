package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBufferedWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Writing good morning", "Writing good afternoon",  "Writing good night"};
		String path = "C:\\Users\\Alexsandro Pires\\Documents\\Developer\\Java\\Working_With_File\\temp\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
