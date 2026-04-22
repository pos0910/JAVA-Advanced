package Day4;
public class basic6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] units= {"명", "일","이","삼","사","오","육","칠","팔","구"};
		for(int i=0; i<101; i++) {
			if (i>=0 && i<10) {
				System.out.printf("일의자리 : %s\n", units[i]);	
			}
			else if(i>10 && i<100) {
				int i10,i0;
				i10=i/10;
				i0=i%10;
				if(i0==0) {
					System.out.printf("십의자리 : %s십\n",units[i10]);
					
				}else {
					System.out.printf("십의자리 : %s십%s\n",units[i10],units[i0]);
				}
			}
			else System.out.printf("==> %d\n",i);
		}

	}
}
