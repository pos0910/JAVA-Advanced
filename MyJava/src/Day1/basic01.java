package Day1;
public class basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0; //변수선언 및 초기화
		while(true) { //반복문 시작
			i=i+1; //0부터 시작해서 1증가
			System.out.printf("인쇄 %d \n",i); //인쇄 0 인쇄1 인쇄 2 인쇄 3
			
			if (i==100)break;//100되면 반복문 종료	
		}
	}
}
