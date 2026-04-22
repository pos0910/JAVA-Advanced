package Day1;

public class basic09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=123;
		System.out.printf("i=[%10d][%-10d][%010d]\n",i,i,i);
		
		i=123456;
		System.out.printf("i=[%5d][%-5d][%08d]\n",i,i,i);
		
		float f =12.345f;
		System.out.printf("f=[%10.5f][%10.1f][%-10.5f][%10.9f][%100.90f]\n",f,f,f,f,f);
		
		String s="abcdef";
		System.out.printf("s=[%10s][%-10s][%5.5s][%10.10s][%-10.10s]\n", s,s,s,s,s);
		
//		i=123456;
//		System.out.printf("i=[%5.5d]\n",i);//에러발생
		
	}

}
