package Day1;

public class basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y= 0.1;
		System.out.printf("y=%20.10f\n\n",y);
		
		y=0;
		for(int i=0;i<10;i++)
			y=y+0.1;
			System.out.printf("10 y=%30.20f y=%f\n\n",y,y);
			
		y=0;
		for(int i=0;i<100;i++)
			y=y+0.1;
			System.out.printf("100 y=%30.20f y=%f\n\n",y,y);
		
		y=0;
		for(int i=0;i<1000;i++)
			y=y+0.1;
			System.out.printf("1000 y=%30.20f y=%f\n\n",y,y);	
		
		
		
	}

}
