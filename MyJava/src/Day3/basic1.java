package Day3;

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum =0;
		for (int i =1; i<101; i++) {
			sum =sum+i;
			
		}
		System.out.printf("#2 : %d\n", sum);
		System.out.printf("#2-2 : %d\n", sum/100);
		
		int [] v= {1,2,3,4,5};
		int vSum;
		
		vSum=0;
		
		for(int i=0; i<5; i++) {
			vSum=vSum+v[i];
		}
		System.out.printf("#2-3 : %d\n", vSum);
		
	}

}
