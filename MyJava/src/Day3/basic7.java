package Day3;
public class basic7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] item = {"맛동산","웨하스","롯데샌드","오땅","사브레","ABC"};
		int[] price = {1000,2000,3000,2500,1450,2000};
		int[] amount = {10,2,1,3,5,2};
		double tax_rate=0.1;
		int total_sum=0;
		
		System.out.printf("*****************\n");
		System.out.printf("너가 지른 과자들 \n");
		System.out.printf("항목   단가   수량   합계\n");
		for (int i=0; i<item.length; i++) {
			int sum=price[i]*amount[i];
			total_sum=total_sum+sum;
			System.out.printf("%.5s   %7d   %2d   %9d\n", item[i],price[i],amount[i],sum);
		}
		System.out.printf("*********\n");
		System.out.printf("지불 금액: %20d\n",total_sum);
		
		int total_net_price=(int)(total_sum/(1+tax_rate));
		System.out.printf("과세금액 : %20d\n",total_net_price);
		int tax=total_sum- total_net_price;
		System.out.printf("세 금 : %20d\n", tax);	
	}
}
