package Day8_3;

public class mytest {
	static Elevater2 elev1;
	static Elevater2 elev2;
	static Elevater2 elev3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elev1 = new Elevater2();
		elev2 = new Elevater2(20,1,8);
		elev3 = new Elevater2(50,-3,5);
		
		for (int i=0; i<20; i++) {
			elev1.up(); 
			elev1.msg("1번엘레 한층 오르기");
			
//			elev2.up(); 
//			elev2.msg("2번엘레 한층 오르기");
			
		}
		for (int i=0; i<20; i++) {
			elev1.up(2); 
			elev1.msg("1번엘레 2층씩 오르기");
			
//			elev2.up(); 
//			elev2.msg("2번엘레 2층 오르기");
			
		}
		for(int i =0; i<20; i++) {
			elev1.down(3); 
			elev1.msg("1엘레 3층씩 내리기");
			
//			elev3.up(); 
//			elev3.msg("2번엘레 3층 오르기");
		}

	}

}
