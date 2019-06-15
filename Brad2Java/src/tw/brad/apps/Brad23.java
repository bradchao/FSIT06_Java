package tw.brad.apps;

import java.io.File;

public class Brad23 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File file = new File("c:/brad/test1");
		System.out.println(file.exists());
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
		
		
	}

}
