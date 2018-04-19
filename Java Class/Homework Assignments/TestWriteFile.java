/*
  Author: Steven Lemos
  
  Test writing file
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFile {
  
  //This method allows for a custom "FILENAME" and custom "content"
	public void writeFile(String FILENAME, String content) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			bw.write(content);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}