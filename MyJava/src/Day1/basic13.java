package Day1;
public class basic13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String szText1 = "안녕aaa녕안";
		String szText2 = "abcdefabc";
		
		System.out.printf("스트링길이 1[%d] 2[%d]\n", szText1.length(),szText2.length());
		
		byte[] szByte1 = szText1.getBytes();
		byte[] szByte2 = szText2.getBytes();
		
		System.out.printf("바이트길이 1[%d] 2[%d]\n", szByte1.length, szByte2.length);
		
		int han1 =szByte1.length-szText1.length();
		int han2=szByte2.length-szText2.length();
		System.out.printf("저장공간차이 1[%d] 2[%d]\n", han1, han2);
		System.out.printf("포함된 한글갯구 1[%d]\n", han1/2,han2/2);
	}
}
