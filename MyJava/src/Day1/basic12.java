package Day1;
public class basic12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0;
		String a="*";
		while(true) {
			a=a+"*";
			i++;
			System.out.println("하나씩 더해보자" + i+":"+a);
			if(i>=10) break;}
		i=0;
		a="*";
		while(true) {
			if(i%2==0)
				a=a+"#";
			else a=a+"*";
			i++;
			System.out.println("응용했당" + i +":"+a);
			if(i>=10) break;
		}
		
	}
	
}
