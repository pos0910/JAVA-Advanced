package Day2;

public class basic2 {

    public static void main(String[] args) {
        
        int k01_year = 0;      // 태어난 연도를 저장할 변수 (초기값 0)
        int k01_age = 14;      // 나이를 저장할 변수 (초기값 14)

        System.out.println("결과1 : " + k01_year);  // 0 출력
        System.out.println("결과2 :" + k01_age);    // 14 출력

        k01_year = k01_age + 2000;  // 14 + 2000 = 2014 → k01_year에 저장
        k01_age = k01_age + 1;      // 14 + 1 = 15 → k01_age에 저장

        System.out.println("결과3 :" + k01_year);   // 2014 출력
        System.out.println("결과4 :" + k01_age);    // 15 출력
    }
}