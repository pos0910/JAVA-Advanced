package Day3;
public class basic3 {
	public static void main(String[] args) {
		int ii=12355;
		
		int j =((ii+500)/1000)*1000;//1000원 반올림
		System.out.printf("#4-1 : %d\n", j);
		
		int x=((ii+50)/100)*100;//100원 반올림
		System.out.printf("#4-2 : %d\n" ,x);
	}
}
