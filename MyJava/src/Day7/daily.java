package Day7;

public class daily{
    public static void main(String args[]){
        int iWeekday = 5;

        int[] iEnd = {31,29,31,30,31,30,31,31,30,31,30,31};

        for (int iMon = 0; iMon < 12; iMon++){
            System.out.println("\n" + (iMon+1) + "월");
            System.out.println("=====================");
            System.out.println(" 일 월 화 수 목 금 토");

            // 1일 전 공백 채우기 ← 이게 없었음
            for (int i = 0; i < iWeekday; i++){
                System.out.printf("   ");
            }

            for (int iDay = 1; iDay <= iEnd[iMon]; iDay++){
                System.out.printf("%3d", iDay);
                iWeekday++;

                if(iWeekday == 7){
                    iWeekday = 0;
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}