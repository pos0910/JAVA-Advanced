package Day4;
public class basic7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNumVal = 2000000000;
		String sNumVal = String.valueOf(iNumVal);
		String sNumVoice="";
		System.out.printf("==> %s [%d자리]\n",sNumVal,sNumVal.length());
		
		int i,j;
		
		String[] units= {"영","일","이","삼","사","오","육","칠","팔","구"};
		//String[] unitx= {"","십","백","천","만","십","백","천","억","십"};
		String[] unitx = {"십억","억","천만","백만","십만","만","천","백","십",""};
		
		i=0;
		j = sNumVal.length()-1;
		
		while(true) {
			if(i >= sNumVal.length())break;
			System.out.printf("%s[%s]", sNumVal.substring(i,i+1), units[Integer.parseInt(sNumVal.substring(i,i+1))]);
			
//			if(sNumVal.substring(i,i+1).equals("0")) {
////				if(unitx[j].equals("만")||unitx[j].equals("억")) {
////					sNumVoice=sNumVoice+""+unitx[j];
////				}else {
////				}
//			}
//			
//			else {
//				sNumVoice=sNumVoice
//						+units[Integer.parseInt(sNumVal.substring(i,i+1))]
//						+unitx[j];
//			}
			if(sNumVal.substring(i,i+1).equals("0")) {
			    // 아무것도 안 함
			} else {
			    String num = units[Integer.parseInt(sNumVal.substring(i,i+1))];
			    
			    // "일" 생략 조건
			    if(num.equals("일") && !unitx[j].equals("")) {
			        sNumVoice = sNumVoice + unitx[i];
			    } else {
			        sNumVoice = sNumVoice + num + unitx[i];
			    }
			}
			i++;
			j--;
		}
		System.out.printf("\n %s[%s]\n",sNumVal,sNumVoice);
	}
}
