package Day8_3;
public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevater3 elev3;
		elev3 = new Elevater3();
		
		for(int i=0; i<10; i++) {
			elev3.up();
			System.out.printf("MSG elev3[%s]\n",elev3.help);
		}
		System.out.println();
		
		for (int i=0; i<10; i++) {
		
			elev3.down();
			System.out.printf("MSG elev3[%s]\n",elev3.help);
			
		}
		elev3.Repair();
		System.out.printf("MSG elev3[%s]\n",elev3.help);
	}
}
