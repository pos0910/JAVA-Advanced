package Day8;

public class ElevatorMain {
	private static int inVal;
	public static void up() {
		inVal++;
		System.out.println("kopo06");
		System.out.printf("난 그냥 메소드[%d]\n\n", inVal);
	}
	public static void main(String[] args) {
		inVal =0;
		Elevater elev;
		
		elev = new Elevater();//객체 생성
		
		up();
		
		for (int i=0; i<10; i++) {
			elev.up();
			
			System.out.printf("MSG[%s]\n", elev.help);
			
		}
		for (int i=0; i<10; i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.help);
		}
	}
}
