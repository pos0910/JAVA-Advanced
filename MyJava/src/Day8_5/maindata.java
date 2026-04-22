package Day8_5;

public class maindata {

	public static void main(String[] args) {
		int iPerson=10;
		Inputdata indata = new Inputdata(iPerson);
		
		for(int i=0; i<iPerson; i++) {
			String name= String.format("홍길%02d",i); //이름만들기
			int kor=(int)(Math.random()*100);	//국어점수
			int eng = (int)(Math.random()*100);
			int mat = (int)(Math.random()*100);
			
			indata.SetData(i,name,kor,eng,mat);//클래스로 넘김 값 입력//5개넘김
		}
		for (int i=0; i<iPerson; i++) {
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
				i, indata.name[i], indata.kor[i], indata.eng[i], indata.mat[i], indata.sum[i], indata.ave[i]);
				
			}
		}
}
