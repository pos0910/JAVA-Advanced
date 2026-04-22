package Day3;

import java.text.DecimalFormat;

public class basic8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MyWon=1000000;
		double MoneyEx=1238.21;
		double commission=0.003;
		
		int usd =(int)(MyWon/MoneyEx);
		int remain = (int)(MyWon-usd*MoneyEx);
		
		System.out.printf("*************************\n");
		System.out.printf("*수수료 없이 계산*\n");
		System.out.printf("총 한화환전금액: %d => 미화: %d달러, 잔돈: %d\n", MyWon, usd, remain);
		System.out.printf("*************************\n");
		
		double ComPerOne = MoneyEx * commission;
		double totalcom = usd * ComPerOne;
		System.out.printf("***\n");
		System.out.printf("* 수수료 계산 *");
		System.out.printf("* 총 수수료 :%f원 => 미화: %d달러, 달러당 수수료: %f원 \n*",totalcom,usd,ComPerOne);
		System.out.printf("***\n");
		
		
		int i_totalcom;
		if(totalcom != (double)((int)totalcom))
			i_totalcom=(int)totalcom+1;
		else
			i_totalcom=(int)totalcom;
		System.out.printf("***");
		System.out.printf("* 수수료 적용환전 *\n");
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료: %f원\n",i_totalcom,usd,ComPerOne);
		
		remain=(int) (MyWon-usd*MoneyEx-i_totalcom);
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료장구:%d원 잔돈: %d원\n",MyWon,usd,i_totalcom,remain);
		System.out.printf("***\n");
		
		usd = (int) (MyWon/(MoneyEx + ComPerOne));
		totalcom = usd * ComPerOne; //총 수수료
		
		if (totalcom != (double)((int)totalcom))
			i_totalcom=(int)totalcom+1;
		else
			i_totalcom=(int)totalcom;
		
		
		System.out.printf("***\n");
		System.out.printf("* (정확한) 수수료 적용환전 *\n");
		System.out.printf("총 수수료: %d원 => 미화: %d달러, 달러당 수수료 %f원\n",i_totalcom, usd, ComPerOne);
		
		remain=(int)(MyWon-usd*MoneyEx - i_totalcom);
		System.out.printf("총 한화환전금액: %d원 => 미화: %d달러, 수수료징구:%d원 잔돈: %d원\n",MyWon, usd, i_totalcom, remain);
		System.out.printf("***\n");	
		
		DecimalFormat df = new DecimalFormat( "###,###,###,###,###" );

		System.out.printf("**********************************************\n");
		System.out.printf("* 콤마찍기, 날짜 적용             *\n");

		System.out.printf("총 수수료: %s원 => 미화: %s달러, 달러당 수수료: %f원\n", 
		    df.format(i_totalcom), 
		    df.format(usd), 
		    ComPerOne ); // 깔끔하다.

		remain = (int) (MyWon - usd * MoneyEx - i_totalcom);
		System.out.printf("총 한화환전금액: %s원 => 미화: %s달러, 수수료징구:%s원 잔돈: %s원\n", 
		    df.format(MyWon), df.format(usd), df.format(i_totalcom), df.format(remain) ); // 쉽다..
		
		
		
		
		
	}
}
