package Day8;

public class test1 {
	static int iStatic;//클래스내 전역 변수 static에 주의
	
	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n",iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",i);
		
	}
	
	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n",iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",i);
		return i;
	}
	
	public static void main(String[] args) {
		int iMain;
		
		iMain=1;
		iStatic=1;
		
		System.out.printf("[kopo06]****************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", iStatic);
		System.out.printf("메서드호출전 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("[kopo06]****************************\n");
		
		add(iMain);
		
		System.out.printf("[kopo06]******************************\n");
		System.out.printf("메소드호출후 메인에서->iStatic=[%d]\n", iStatic);
		System.out.printf("메서드호출후 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("[kopo06]******************************\n");
		
		iMain=add2(iMain);
		
		System.out.printf("[kopo06]******************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n", iStatic);
		System.out.printf("메서드 add2호출후 메인에서->iMain=[%d]\n",iMain);
		System.out.printf("[kopo06]******************************\n");
		
		}

}
