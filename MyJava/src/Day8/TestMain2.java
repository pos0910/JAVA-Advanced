package Day8;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc cc = new calc();
		
		System.out.printf("[kopo06] 2개 덧셈이 호출됨 [%d]\n" ,cc.sum(1, 2));
		System.out.printf("3개 덧셈이 호출됨 [%d]\n" ,cc.sum(1, 2,3));
		System.out.printf("4개 덧셈이 호출됨 [%d]\n" ,cc.sum(1, 2,3,4));
		System.out.printf("더블형 덧셈이 호출됨 [%f]\n" ,cc.sum(1.3,2.4));
	
	}

}
