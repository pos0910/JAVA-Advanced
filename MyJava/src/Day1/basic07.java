package Day1;
public class basic07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<101; i++) {
			sum=sum+i;
			System.out.printf("과정 --> 1-%d까지 합 =%d\n",i,sum);
		}
		System.out.printf("1-100합 -d\n",sum);
		
		for(int i =0; i<50; i+=3) {
			System.out.printf("i의 규칙은 %d\n", i);
		}
		int i =0;
		while(true) {
			System.out.printf("=>i의 규칙은 %d\n",i);
			i+=3;
			if (i>50) break;
		}
	}
}
