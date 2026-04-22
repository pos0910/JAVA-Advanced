package Day4;
public class basic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jumin="123456-1234567";
		
		switch(jumin.charAt(7)) {
		case '1':
			System.out.printf("20세기전 태어난 남자 사람\n");
		case '2':
			System.out.printf("20세기전 태어난 여자 사람\n");
			break;
		case '3':
			System.out.printf("20세기후 태어난 남자 사람\n");
			break;
		case '4':
			System.out.printf("20세기후 태어난 여자 사람\n");
			break;
		default :
			System.out.printf("사람\n");
			break;
		}
	}
}
