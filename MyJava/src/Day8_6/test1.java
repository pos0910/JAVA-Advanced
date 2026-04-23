package Day8_6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class test1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        int iPerson = 100;
        int pageSize = 10;
        int totalPage = (int)Math.ceil((double)iPerson / pageSize);
        Inputdata indata = new Inputdata(iPerson);
        for (int i = 0; i < iPerson; i++) {
            String name = String.format("우성%02d", i + 1);
            int kor = (int)(Math.random() * 100);
            int eng = (int)(Math.random() * 100);
            int mat = (int)(Math.random() * 100);
            indata.SetData(i, name, kor, eng, mat);
        }
        // 누적 합계
        int cumKor = 0, cumEng = 0, cumMat = 0;
        double cumAveSum = 0; // 누적 평균 합계

        for (int page = 1; page <= totalPage; page++) {
            int start = (page - 1) * pageSize;
            int end = Math.min(start + pageSize, iPerson);
            int pageKor = 0, pageEng = 0, pageMat = 0;
            int pageCount = end - start;
            double pageAveSum = 0; // 현재 페이지 평균 합계

            // 헤더
            System.out.printf("%30s\n", "성적집계표kopo06");
            System.out.printf("%-15s %40s\n", "PAGE : " + page, "출력일자 : " + now.format(fmt));
            System.out.println("=".repeat(60));
            System.out.printf("%-3s %2s %8s %6s %6s %6s %9s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
            System.out.println("=".repeat(60));

            // 데이터
            for (int i = start; i < end; i++) {
                System.out.printf("%03d  %-10s %2d %8d %8d %8d %12.2f\n",
                    i + 1, indata.name[i], indata.kor[i], indata.eng[i],
                    indata.mat[i], indata.sum[i], indata.ave[i]);
                pageKor     += indata.kor[i];
                pageEng     += indata.eng[i];
                pageMat     += indata.mat[i];
                pageAveSum  += indata.ave[i]; // 개인 평균 누적
            }
            cumKor    += pageKor;
            cumEng    += pageEng;
            cumMat    += pageMat;
            cumAveSum += pageAveSum; // 누적 평균 합계

            int pageTotal = pageKor + pageEng + pageMat;
            int cumTotal  = cumKor  + cumEng  + cumMat;

            int cumCount;
            if (page * pageSize <= iPerson) {
                cumCount = page * pageSize;
            } else {
                cumCount = iPerson;
            }

            System.out.println("=".repeat(60));
            System.out.println("현재페이지");
            System.out.printf("%-5s %12d %8d %8d %8d %12.2f\n", "합계",
                pageKor, pageEng, pageMat, pageTotal, pageAveSum); // pageAveSum 사용
            System.out.printf("%-5s %12d %8d %8d %8d %12.2f\n", "평균",
                pageKor/pageCount, pageEng/pageCount, pageMat/pageCount,
                pageTotal/pageCount, (double)pageTotal / pageCount / 3);
            System.out.println("=".repeat(60));
            System.out.println("누적페이지");
            System.out.printf("%-5s %12d %8d %8d %8d %12.2f\n", "합계",
                cumKor, cumEng, cumMat, cumTotal, cumAveSum); // cumAveSum 사용
            System.out.printf("%-5s %12d %8d %8d %8d %12.2f\n", "평균",
                cumKor/cumCount, cumEng/cumCount, cumMat/cumCount,
                cumTotal/cumCount, (double)cumTotal / cumCount / 3);
            System.out.println("\n");
        }
    }
}