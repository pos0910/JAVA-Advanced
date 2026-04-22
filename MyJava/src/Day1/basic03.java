package Day1;
public class basic03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		i=1+2+3+4;
		System.out.printf("i=%d\n\n",i);
		double a,b,c,x;
		a=1.0;b=5.0;c=3.0;
		
		x=(-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c)) /2 *a;
		System.out.printf("x=%f\n\n",x);
		
		int xx; double y, z;
		
		xx= 10/3; y=10/3; z=10/3;
		
		System.out.printf("xx=%d, y=%f, z=%f\n\n",xx,y,z);
		
		xx=10/3*3; y=10/3*3; z=10/3*3;
		System.out.printf("xx=%d, y=%f, z=%f\n\n",xx,y,z);
			
	}
}
