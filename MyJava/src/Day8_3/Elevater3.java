package Day8_3;

public class Elevater3 extends Elevater2{
	
	void Repair() {
		help = String.format("수리중입니다.");	
	}
	void up()
	{
		if(floor>=limit_up_floor) {//floor 10  >=10
			help="마지막층입니다.";
		}else {
			floor=floor+2;
			help=String.format("%d층입니다.",floor);
		}
		this.down();//
	}
	
	void down()
	{
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help);
	}
}
	

