package Day8_2;

public class Main {

	public static void main(String[] args) {
	
		int kor =100;//국어
		int math=100;//수학
		int eng =100;//영어
		int sci =100;//과학
		int soc =100;//사회
		
		test tt = new test();
		
		System.out.println("3월 성적표");
		System.out.println("=".repeat(50));
		System.out.println("이름\t국어\t영어\t수학\t총정\t평균");
		System.out.println("=".repeat(50));
		System.out.println("폴리융\t"+ kor +"\t"+eng+"\t"+math+"\t"+ tt.sum1(100,100,100)+ "\t"+ tt.avg1(100,100,100));
		
		System.out.println();
		System.out.print("4월 성적표\n");
		System.out.println("=".repeat(50));
		System.out.println("이름\t국어\t영어\t수학\t과학\t총정\t평균");
		System.out.println("=".repeat(50));
		System.out.println("폴리융\t"+ kor +"\t"+eng+"\t"+math+"\t"+ sci+"\t"+ tt.sum2(100,100,100,100)+ "\t"+ tt.avg2(100,100,100,100));
		
		System.out.println();
		System.out.print("5월 성적표\n");
		System.out.println("=".repeat(50));
		System.out.println("이름\t국어\t영어\t수학\t과학\t사회\t총정\t평균");
		System.out.println("=".repeat(50));
		System.out.println("폴리융\t"+ kor +"\t"+eng+"\t"+math+"\t"+ sci+"\t"+soc+"\t"+ tt.sum3(100,100,100,100,100)+ "\t"+ tt.avg3(100,100,100,100,100));
		
		}
	}