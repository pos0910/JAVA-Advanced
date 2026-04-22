package Day1;

public class basic08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("*************");
		for(int i=2; i<10;i++) {
			System.out.printf("구구단 %d 단\n",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			System.out.printf("\n\n*******************\n");
		}
	}
}