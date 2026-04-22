package Day8_5;

public class Inputdata {

	public String[] name;
	public int[] kor;
	public int[] eng;
	public int[] mat;
	public int[] sum;
	public double[] ave;

	public Inputdata(int size) {
			name = new String[size];
			kor = new int[size];
			eng= new int[size];
			mat = new int[size];
			sum = new int[size];
			ave = new double[size];
			
	}
	public void SetData(int i, String name, int kor, int eng, int mat) {
		this.name[i] =name;
		this.kor[i]=kor;
		this.eng[i]=eng;
		this.mat[i]=mat;
		this.sum[i]= kor + eng+ mat;//총점
		this.ave[i] = this.sum[i]/3.0; //평균
	}
}