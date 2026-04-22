package Day8;

public class Elevater {
	
	int limit_up_floor =10;
	int limit_down_floor =0;
	int floor =1;
	String help;
	
	void up() {
		if(floor == limit_up_floor) {
			help = "마지막층입니다";
		}else {
			floor++;
			help = String.format("%d층입니다", floor);	
		}
		
	}
	void down()//엘레베이터가 내려감
	{
		if (floor == limit_down_floor) {
			help="처음층입니다.";
			
		}else {
			floor--;	//최하층이 아닐 때 한 층씩 올라감
			help=String.format("%d층입니다.", floor);
		}
		
	}
}
