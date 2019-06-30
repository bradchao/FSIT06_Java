package tw.brad.apps;

public class Brad58 {
	private static final int DIR_UP = 1;
	private static final int DIR_DOWN = 2;
	private static final int DIR_LEFT = 3;
	private static final int DIR_RIGHT = 4;
	private static final int DIR_STOP = 0;
	
	
	public static void main(String[] args) {
		BadGuy b1 = new BadGuy(Dir.STOP);
		BadGuy b2 = new BadGuy(Dir.RIGHT);
		b1.chDir(Dir.LEFT);
		System.out.println(b1.dir.getValue());
		
		// byte, short, char, int, String, enum
		switch (b2.dir) {
			case UP:
				System.out.println("go up");
				break;
//			case 0:
//				System.out.println("go up");
//				break;
		
		}

		System.out.println(b1.dir);
		
		
	}
}
// 列舉 enum
enum Dir {
	UP(1,"up"), DOWN(2,"down"),LEFT(3,"left"),RIGHT(4,"right"),STOP(0,"stop");
	private int value;
	private String name;
	Dir(){
		System.out.println("OK");
	}
	Dir(int a, String name){
		System.out.println("OK2");
		value = a;
		this.name = name;
	}
	int getValue() {return value;}
	
	@Override
	public String toString() {
		return name;
	}
}

class BadGuy {
	int left;
	int blood;
	Dir dir;
	
	BadGuy(Dir initDir){dir = initDir;}
	void chDir(Dir newDir) {dir = newDir;}
}