package tw.brad.myjava;

public class TWId {
	private String id;
	public TWId() {
	}
	public TWId(boolean isMale) {
	}
	public TWId(int area) {
	}
	public TWId(boolean isMale, int area) {
	}
//	public TWId(String id) {
//		this.id = id;
//	}
	
	public static boolean checkId(String id) {
		boolean ret = false;
		if (id.length() == 10) {
			//if 
		}
		
		return ret;
	}
	public String getId() {
		return id;
	}
}
