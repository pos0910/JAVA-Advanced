package Day7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Receipt {
	public static void main(String[] args) {
		
		String item1[] = {"퓨어에어 비말차단용마스크123123123", "5000","99","[1031615]"}; //상품의 정보를 문자열 배열로 묶기
		String item2[] = {"슬라이드식명철(가로형)123123123","1","1","[1008152]"};
		String item3[] = {"매직흡착 인테리어후크(알루미늄)","1","1","[1020800]"};
		
		int total_price1= Integer.parseInt(item1[1]) * Integer.parseInt(item1[2]);//문자열인 단가와 수량을 숫자로 바꿔서 곱한 후, 해당 상품의 총액을 구합니다.
		int total_price2= Integer.parseInt(item2[1]) * Integer.parseInt(item2[2]);
		int total_price3= Integer.parseInt(item3[1]) * Integer.parseInt(item3[2]);
		int totalSum = total_price1 + total_price2 + total_price3; //모든 상품의 총합계를 구함.
		int vat1 = (int)Math.ceil(totalSum * 0.1); //총금액의 10%를 부가세로 계산

		
		LocalDateTime now = LocalDateTime.now();//현재 날짜 + 시간 가져오기
		LocalDateTime refundDate = now.plusDays(14);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"); //날짜+시간 출력형식 설정
		
		DateTimeFormatter refundFormatter = DateTimeFormatter.ofPattern("MM월dd일");
		String refundStr = refundDate.format(refundFormatter);
		
		
		System.out.println(center("\"국민가게, 다이소\"", 41)); //출력
        System.out.println("(주)아성다이소 분당서현점");
        System.out.println("전화:031-702-6016");
        System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
        System.out.println("대표:박정부,신호섭 213-81-52063");
        System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");
        System.out.println("=".repeat(41));
        System.out.println(center("소비자중심경영(CCM) 인증기업", 41));
        System.out.println(center("ISO 9001 품질경영시스템 인증기업", 41));
        System.out.println("=".repeat(41));
//      System.out.println(center("교환/환불 14일 (03월12일) 이내,", 41));
//      System.out.println(center("(전자)영수증, 결제카드 지참 후 구입매장에서 가능", 41));
//      System.out.println(center("포장/가격 택 훼손시 교환/환불 불가", 41));
//      System.out.println(center("체크카드 취소 시 최대 7일 소요", 41));
        centerWrap("교환/환불 14일("+refundStr+")이내, (전자)영수증, 결제카드 지참 후 구입매장에서 가능 포장/가격 택 훼손시 교환/환불 불가 체크카드 취소 시 최대 7일 소요",41);
        System.out.println("=".repeat(41));
        System.out.printf("%s%s\n", bblank("[POS 1058231]", 22), now.format(formatter));
		System.out.println("=".repeat(41));

		
		// 상품명 출력
		System.out.printf("%s %,8d %3s %,9d\n", bblank(item1[0],18), Integer.parseInt(item1[1]), item1[2], total_price1);
		System.out.println(item1[3]); // 코드 다음줄 출력
		System.out.printf("%s %,7d %3s %,9d\n", bblank(item2[0],19), Integer.parseInt(item2[1]), item2[2], total_price2);
		System.out.println(item2[3]);
		System.out.printf("%s %,7d %3s %,9d\n", bblank(item3[0],19), Integer.parseInt(item3[1]), item3[2], total_price3);
		System.out.println(item3[3]);
		System.out.println();

		// 과세합계/부가세 - 41칸 기준 오른쪽 정렬
		System.out.printf("%s%s%,10d\n",bblank("",13), bblank("과세합계", 18), (totalSum - vat1));
		System.out.printf("%s%s%,10d\n",bblank("",13), bblank("부가세", 18), vat1);
		System.out.println("-".repeat(41));

		// 판매합계
		System.out.printf("%s%,10d\n", bblank("판매합계", 31), totalSum);
		System.out.println("=".repeat(41));

		// 신용카드
		System.out.printf("%s%,10d\n", bblank("신용카드", 31), totalSum);
		System.out.println("-".repeat(41));

		System.out.printf("%s%s\n",bblank("우리카드", 25),"538720**********");
		System.out.printf("%s%,9d\n",bblank("승인번호 77982843(0)    승인금액", 32),totalSum);
		System.out.println("=".repeat(41));
		System.out.println(center(now.format(formatter) + " 분당서현점", 41));//가운데 정렬
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println(center("||||||||||||||||", 41));
		System.out.println(center("||||||||||||||||", 41));
		System.out.println(center("2112820610158231", 41));
		System.out.println("-".repeat(41));
		//System.out.println(center("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈", 41));
		centerWrap("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서 회원가입 후 다양한 혜택을 누려보세요! ◈", 41);
	}

	
	//고정된 폭에 맞춰 글자를 출력하고 남은 공간을 공백으로 채움
	public static String bblank(String item, int printLength) {
	    int proc_Printlen = 0; //실제 출력된 칸 수 (한글=2, 영문=1)
	    int ret_Strlen = 0; //실제 출력된 글자 수
	    int asc; //현재 글자의 아스키 코드
	    int length = item.length();//문자열 글자 수
	    for (int i = 1; i <= length; i++) {
	        asc = (int) item.charAt(i - 1);//글자를 숫자(아스키코드)로 변환
	        if (asc > 127) { //아스키 코드 한글은 2칸을 차지하고, 영어 숫자는 1칸을 차지함
	            if (printLength < proc_Printlen + 2) break;//2칸 추가하면 =>중단
	            proc_Printlen = proc_Printlen + 2; //한글은 두칸
	            ret_Strlen = ret_Strlen + 1; //글자수 1증가
	        } else {//영문 숫자 아스키코드 127 이하
	            if (printLength < proc_Printlen + 1) break; //1칸 추가하면 넘침 -> 중단
	            proc_Printlen = proc_Printlen + 1; //영문은 1칸
 	            ret_Strlen = ret_Strlen + 1;//글자수 1 증가
	        }
	    }
	    String retStr = item.substring(0, ret_Strlen); // 실제 출력할 문자열 자르기
	    for (int i = 0; i < (printLength - proc_Printlen); i++) {// 남은 칸만큼 공백 채우기
	        retStr = retStr + " ";
	    }
	    return retStr;
	}
	
	//가운데 정렬 메서드
	public static String center(String str, int width) {
	    int len = 0;
	    for (char c : str.toCharArray()) {
	        len += (c > 127) ? 2 : 1;//한글=2 영문=1로 실제 칸 수 계산
	    }
	    int totalPad = width - len;//남은 공백 총량
	    if (totalPad <= 0) return str;//문자열이 width보다 길면 그냥 반환
	    int leftPad = totalPad / 2; //왼쪽공백 = 총 공백 / 2
	    return " ".repeat(leftPad) + str;//왼쪽공백 + 문자열
	}
	
	//41칸이 넘어가면 가운데 정렬을 하면서 다음줄로 넘어감
	public static void centerWrap(String str, int width) {
	    // 먼저 width 기준으로 줄 나누기
	    int lineLen = 0;//현재 줄의 칸 수
	    StringBuilder line = new StringBuilder();//현재 줄 문자열
	    
	    for (char c : str.toCharArray()) {
	        int charLen = (c > 127) ? 2 : 1;//한글 2, 영문1
	        
	        if (lineLen + charLen > width) { //이 글자 추가하면 width 초과
	            // 41칸 넘으면 가운데 정렬해서 출력
	            System.out.println(center(line.toString(), width));//현재 줄 출력
	            line = new StringBuilder(); //새 줄 시작
	            lineLen = 0;//칸 수 증가
	        }
	        line.append(c);//글자 추가
	        lineLen += charLen;//칸 수 증가
	    }
	    // 마지막 줄
	    if (line.length() > 0) {
	        System.out.println(center(line.toString(), width));
	    }
	}
	
}