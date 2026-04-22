package Day3;
public class basic6 {
	public static int netprice(int price, double rate) {
		return (int)(price/(1+rate)+0.0001);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int price=1234;
			double tax_rate=0.1;
			
			int netprice=netprice(price, tax_rate);
			int tax=price-netprice;
			
			System.out.printf("***************************\n");
			System.out.printf("* 소비자가, 세전가격, 세금 계산 *\n");
			System.out.printf(" 소비자가격: %d, 세전가격: %d, 세금: %d\n", price,netprice,tax);
			System.out.printf("****************************\n");
		}

}
