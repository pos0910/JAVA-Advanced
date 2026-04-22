package Day1;
import java.util.Scanner;

public class basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("자바시험 몇점 받았는지 입력하시오.");
		int i = sc.nextInt();
	
		if(i>90) 
			System.out.printf("아이구 이쁜 강이지");
		else if (i>80) 
			System.out.printf("아이구 쪼금 이쁜 강이지");
		else if (i>70) 
			System.out.printf("건강하게만 자라라");
		else if (i>60) 
			System.out.printf("학교 잘 다녀왔으면 밥먹자");
		else 
			System.out.printf("좀 맞자");
	}

}