package Day1;
import java.util.Scanner;

public class basic06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("자바시험 몇점 받았는지 대문자로 입력하시오.");
		String s =sc.next();
		
		switch(s.charAt(0)) {
		case 'A':
			System.out.printf("아이구 이쁜 강아지");
			break;
		case 'B':
			System.out.printf("아이구 쪼끔 이쁜 강아지");
			break;
		case 'C':
			System.out.printf("건강하게만 자라라");
			break;
		case 'D':
			System.out.printf("학교 잘 다녀왔으면 밥먹자");
			break;
		case 'F':
			System.out.printf("좀 맞자");
			break;
		default:
			System.out.printf("입력규칙을 좀 맞추시오");
			break;
		}
		

	}

}
