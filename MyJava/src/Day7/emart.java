package Day7;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class emart {
    public static String bblank(String item, int printLength) {
        	
    	int proc_Printlen = 0;
        int ret_Strlen = 0;
        int asc;
        int length = item.length();
        for (int i = 1; i <= length; i++) {
            asc = (int) item.charAt(i - 1);
            if (asc > 127) {
                if (printLength < proc_Printlen + 2) break;
                proc_Printlen += 2;
                ret_Strlen++;
            } else {
                if (printLength < proc_Printlen + 1) break;
                proc_Printlen++;
                ret_Strlen++;
            }
        }
        String retStr = item.substring(0, ret_Strlen);
        for (int i = 0; i < (printLength - proc_Printlen); i++) {
            retStr += " ";
        }
        return retStr;
    }

    public static String center(String str, int width) {
        int len = 0;
        for (char c : str.toCharArray()) len += (c > 127) ? 2 : 1;
        int totalPad = width - len;
        if (totalPad <= 0) return str;
        return " ".repeat(totalPad / 2) + str;
    }
          
    //4/22일 변수와 메서드 실습
    //메서드를 이용해서 출력하기
    public static void totalprint(int totalSum, int taxfreeSum, int taxableBase, int vat, int itemCount) {
        System.out.println();
        System.out.println();
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("총 품목 수량",13),    itemCount);
        System.out.printf("%s%s%,13d\n", bblank("",12), bblank("(*)면 세  물 품",16), taxfreeSum);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("과 세  물 품",13),    taxableBase);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("부   가   세",13),    vat);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("합        계",13),    totalSum);
    }
    
    public static void TitlePrint() {
    	System.out.println("영수증 미지참시 교환/환불 불가");
    	System.out.println("영수증은 한달 30일 이내(신선 7일)");
    	System.out.println("일부 브랜드매장 제외(매장 고지물참조)");
    	System.out.println("교환/환불 구매점에서 기능(결제카드 지참)");
    	
    }
    
    
      
    
    public static void main(String[] args) {
        // 상품 데이터 (30개)
        String[] itemname = {
            "미국산 시트러스 컬렉션 3kg(오렌지+카라카라 오렌지+만다린)", "아몬드브리즈 언스위트,190ml", "비비고 사골곰탕", "오렌지주스", "초코에몽",
            "햄가득부대찌개", "서울우유 멸균 흰우유,200ml", "사조 해표 콩기름 식용유", "햇반 발아현미밥", "롯데엘푸드 칙촉",
            "쿠가횡성한우 횡성직송 한우세트", "폰타나 이탈리아 캄파니아 스파게티", "너구리", "짜파게티", "CJ제일제당 즉석죽 골라담기",
            "신상 피스타치오&말차", "스팸", "햄통조림", "꽁치캔", "맥심 모카골드 마일드 커피믹스,12g",
            "풀무원 블라썸위크 다다익선", "CJ제일제당 비비고 생선구이 세트", "환타", "포카리", "게토레이",
            "하남오징어", "사과", "딸기", "오리온초코파이 정,468g", "바나나맛 우유",
            "농심 신라면","오뚜기 진라면"
        };
        int[] price = {
            33000, 2500, 3300, 25000, 100,
            1500, 2000, 1800, 1600, 1700,
            100000, 1000, 1200, 1300, 900,
            2500, 4500, 3000, 2000, 2200,
            1800, 1500, 1800, 2500, 2000,
            3000, 5000, 8000, 12000, 20000,
            5000,3000
       
        };
//        int[] price = {
//                1, 25, 33, 25, 1,
//                1, 2, 18, 16, 17,
//                1, 1, 12, 13, 9,
//                2, 45, 3, 2, 22,
//                1, 15, 18, 25, 2,
//                3, 5, 8, 12, 2,
//                5,3
//           
//            };
        
        int[] num = {
            1, 4, 1, 2, 10,
            3, 2, 1, 4, 2,
            5, 3, 2, 1, 6,
            2, 1, 2, 3, 1,
            4, 3, 2, 1, 2,
            3, 2, 1, 2, 1,
            5,2
        };
        boolean[] taxfree = {
            false, true, false, true, true,
            false, false, false, false, false,
            false, false, false, false, false,
            true, true, true, true, true,
            false, false, false, false, false,
            true, true, true, true, true, 
            true,false
        };

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime enterTime = now.minusHours(1); // 입차시간 = 구매시간 - 1시간
        DateTimeFormatter barcodeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String barcode = now.format(barcodeFormatter) + "/00119861/0016430/31";

        
        
        
        // 합계 계산
        int totalSum = 0; //전체 합계
        int taxfreeSum = 0; //부가세가 붙지 않는 물품
        int taxableSum = 0; //부가세가 붙는 물품의 세금 제외 금액
            	   	
    	        
        for (int i = 0; i < itemname.length; i++) {
            int t = price[i] * num[i];//상품별 금액
            totalSum += t;			  //전체에 누적
            if (taxfree[i]) taxfreeSum += t; //면세면 면세 누적
            else taxableSum += t;			 //과세면 과세 누적
        }
        
        //부가세 계산
        int taxableBase = (int)(taxableSum/1.1+0.001); 
        int vat = taxableSum-taxableBase; 
                
        //포인트계산
    	int earnedPoint = totalSum / 1000;  // 164,980 → 164포인트 (1000원당 1포인트)
    	int prevPoint = 5473;               // 이전 누계 포인트
    	int totalPoint = prevPoint + earnedPoint; // 5473 + 164 = 5637
        // 헤더
        //System.out.println(center("emart", 41)); //가운데 정렬
        System.out.println(center("emart   이마트 죽선점 (031)888-1234", 41));
        System.out.println(center("206-86-50913 강희석", 41));
        System.out.println(center("     용인 수지구 포은대로 552", 41));
        System.out.println();      
        //bblank로 왼쪽 정렬
        System.out.printf("%s%s\n", bblank("영수증 미지참시 교환/환불 불가", 41), ""); 
        System.out.printf("%s%s\n", bblank("영수증은 한달 30일 이내(신선 7일)", 41), "");
        System.out.printf("%s%s\n", bblank("일부 브랜드매장 제외(매장 고지물참조)", 41), "");
        System.out.printf("%s%s\n", bblank("교환/환불 구매점에서 기능(결제카드 지참)", 41), "");
        System.out.println();
        //POS번호 + 날짜
        System.out.printf("%s %s\n", bblank("[구 매]" + now.format(formatter), 26), " POS:0011-9E61");
        System.out.println("-".repeat(41));

        // 상품목록 헤더
        System.out.printf("%s%s%s%s\n",
            bblank("상 품 명", 19),
            bblank("단 가", 8),
            bblank("수량", 4),
            bblank("     금 액",10)); //bblank숫자값 합쳐서 41칸이 되어야 함 만들기
        
        System.out.println("-".repeat(41));

        // 상품 출력
        for (int i = 0; i < itemname.length; i++) {
            int total = price[i] * num[i];
            String mark = taxfree[i] ? "*" : " "; // 면세 * 표시

            System.out.printf("%s%s%-9s%3d %,10d\n",//%s 문자열(기본, 오른쪽 정렬) %-9s문자열, 9칸확보, 왼쪽정렬()
            										//%-9s 문자열, 9칸 확보, 왼쪽 정렬(-가 왼쪽 정렬)
            										//%5d 정수, 5칸 확보, 오른쪽 정렬
            										//줄바꿈
            										//%,13d 정수, 13칸 확보 + 천 단위 콤마(예: 1,000,000)
                
            	mark,								//* 면세표시 또는 공백으로 함.
                bblank(itemname[i], 17),			//상품명 15칸 고정
                String.format("%,9d", price[i]),		//단가 (콤마 포함 문자열) 9칸
                num[i],								//수량 5칸
                total);								//합계 13칸(콤마 포함)

            // 5개마다 점선
            if ((i + 1) % 5 == 0) {
                System.out.println("- - - - - - - - - - - - - - - - - - - - -");
            }
        }

// 합계
// 총 품목 수량
//bblank로 앞에 공백 넣어서 오른쪽으로 밀기(정렬)
//        System.out.printf("%s%7d\n", bblank("               총 품목 수량", 34), itemname.length);
//        System.out.printf("%s%,7d\n", bblank("            (*)면 세 물 품", 31), taxfreeSum);
//        System.out.printf("%s%,7d\n", bblank("               과 세 물 품", 34), taxableBase);
//        System.out.printf("%s%,7d\n", bblank("               부 가 세", 34), vat);
//        System.out.printf("%s%,7d\n", bblank("               합      계", 31), totalSum);
    
        System.out.println();
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("총 품목 수량",13),   itemname.length);
        System.out.printf("%s%s%,13d\n", bblank("",12), bblank("(*)면 세  물 품",16), taxfreeSum);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("과 세  물 품",13),    taxableBase);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("부   가   세",13),        vat);
        System.out.printf("%s%s%,13d\n", bblank("",15), bblank("합        계",13),     totalSum);
        
        // 결제
        System.out.printf("%s%,10d\n", bblank("결 제 대 상 금 액", 31), totalSum);
        System.out.println("-".repeat(41));
        System.out.printf("%s%s\n", bblank("0012 KEB 하나", 20), "541707**0484/35860658");
        
        //System.out.printf("%s%s\n", bblank("카드결제(IC)", 20), "     일시불 / 164,980");
        System.out.printf("%s%s%,10d\n",bblank("카드결제(IC)", 20),bblank("일시불 /", 11),totalSum);
        
        System.out.println("-".repeat(41));
        System.out.println(center("[신세계포인트 적립]",41));
        System.out.println("박*성 고객님의 포인트 현황입니다.");
                
        System.out.printf("%s%s%10d\n", bblank("금회발생포인트:", 21), "9350**9995" ,earnedPoint);
        
        System.out.printf("%s%10s%s%9s%s\n",
        	    bblank("누계(가용)포인트:", 20),
        	    String.format("%,d", totalPoint),      // totalPoint 오른쪽 10칸
        	    "(",                                   // ( 고정
        	    String.format("%,d", prevPoint),       // prevPoint 오른쪽 9칸
        	    ")");       
                
        System.out.println("신세계포인트 유효기간은 2년입니다.");
               
        System.out.println("-".repeat(41));

        // 하단
        System.out.println(center("구매금액기준 무료주차시간 자동부여",41));
        System.out.printf("%s%9s\n", bblank("차량번호 :", 31), "34저****");
        System.out.printf("%s%20s\n", bblank("입차시간 :", 21), enterTime.format(formatter));
        System.out.println("-".repeat(41));
        
        System.out.printf("%s%10d\n", bblank("캐셔:084599 양00", 31), 1150);
        System.out.println(center("|||||||||||||||||||||||||||||||", 41));
        System.out.println(center(barcode, 41));
        
        //실습 메서드 활용해서 코딩하기 4/22
        totalprint(totalSum, taxfreeSum, taxableBase, vat, itemname.length);//합계부분 출력
        TitlePrint();//헤더부분출력
    }
}