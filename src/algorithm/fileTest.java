package algorithm;

import java.io.File;

public class fileTest {

	public static void main(String[] args) {
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
	}

}
