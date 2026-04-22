package Day8;

public class tv {
	static int vol=0;
	
	public static void Volup() {
		for (int i=1; i<=5; i++) {
			vol++;
			System.out.println("[kopo06]볼륨" + vol);
		}
		
	}
	
	public static void Voldown() {
		for (int i=1; i<=5; i++) {
			vol--;
			System.out.println("[kopo06]볼륨" + vol);
			if(vol==1) {
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Volup();
		Voldown();
		
		chanel ch;
		ch = new chanel();
		ch.chaenelup();
		ch.chaeneldown();
	
		
	}

}
