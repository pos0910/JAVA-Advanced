package Day2;

public class basic12 {
	    public static void main(String[] args) {

	        int i = 10;
	        byte b = (byte) i;          // int -> byte 명시적 형변환
	        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

	        i = 300;
	        b = (byte) i;               // 300은 byte 범위(-128~127) 초과 -> 값 손실 발생
	        System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

	        b = 10;
	        i = (int) b;                // byte -> int 형변환 (범위가 더 크므로 값 손실 없음)
	        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

	        b = -2;
	        i = (int) b;                // 음수 byte -> int 형변환 (부호 비트가 확장됨)
	        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

	        // i(-2)를 32비트 2진수 문자열로 출력
	        // 음수이므로 앞에 1이 가득 찬 2의 보수 형태로 출력됨
	        System.out.println("i=" + Integer.toBinaryString(i));
	    }
}
