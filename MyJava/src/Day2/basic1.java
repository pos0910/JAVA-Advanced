package Day2;
public class basic1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345";
		int i = Integer.parseInt(s);
		
		System.out.printf("문자를 숫자로 %d (%d) \n", i , i+10);
		
		String a;
		a= String.format("%d",i);
		System.out.printf("숫자를 문다로 %s (%s)\n", a, a+"abcde");
	}
}