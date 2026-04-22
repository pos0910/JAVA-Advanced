package Day3;

public class basic4 {

	public static void main(String[] args) {
		int MyVal = 14/5;
		System.out.printf("#5-1 : %d\n", MyVal);
		
		double MyValF;
		
		MyValF=14/5;
		System.out.printf("#5-2 : %f\n", MyValF);
		
		MyValF=14.0/5;
		System.out.printf("#5-3 : %f\n", MyValF);
		
		MyValF=(14.0)/5+0.5;
		System.out.printf("#5-4 : %f\n", MyValF);
		
		MyVal=(int)((14.0)/5+0.5);
		System.out.printf("#5-5 : %d\n", MyVal);
	}
}