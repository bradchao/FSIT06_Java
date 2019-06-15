package tw.brad.apps;

import java.io.File;
import java.io.IOException;

public class Brad24 {

	public static void main(String[] args) {
		File dir11 = new File("./dir1/dir11");
		System.out.println(dir11.getAbsolutePath());
		
		if (!dir11.exists()) {
			dir11.mkdir();
		}else {
			System.out.println("exist!");
		}
		
		// ./dir2/dir3/dir4/dir5
		File dir25 = new File("./dir2/dir3/dir4/dir5");
		if (dir25.mkdirs()) {
			System.out.println("mkdir ok");
		}else {
			System.out.println("mkdir fail");
		}
		
		File file1 = new File("dir1/file1");
		try {
			file1.createNewFile();
		} catch (IOException e) {
		}
		
		File source = new File("dir1/coffee.jpg");
		File target = new File("dir2/coffee.jpg");
		source.renameTo(target);
		
		
	}

}
