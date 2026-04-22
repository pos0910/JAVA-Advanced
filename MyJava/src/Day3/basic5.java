package Day3;
public class basic5 {
	public static int taxcal(int val, int rate) {
		int ret;
		if(((double)val * (double)rate/100.0)==val*rate/100)
			ret = val*rate/100;
		else
			ret=val*rate/100+1;
		return ret;
	}
	
	public static void main(String[] args) {
		int val = 271;//세전 물건값
		int rate =3;//세금 5퍼센트
		
		int tax = taxcal(val,rate);
		
		System.out.printf("***************************\n");
		System.out.printf("* 단순 세금 계산 \n");
		System.out.printf("실제 세금계산: %f\n", val*rate/100.0);
		System.out.printf("세전가격 : %d 세금:%d 세포함가격 %d\n", val,tax,val+tax);
		System.out.printf("***************************\n");
	}
}
