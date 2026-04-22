package Day8_4;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ca c1 =new Ca();
		Ca c2 =new Ca();
		
		c1.setA(3);//setA에게 3전달
		c1.fn();//출력
		c2.fn();//출력

		c1.setB(1);
		c1.fn2();
		c2.fn2();//c2인스턴스에 라는 공간에는 값을 전달하지 않음
		c2.setB(2);
		c2.fn2();
	}

}
