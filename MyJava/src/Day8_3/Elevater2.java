package Day8_3;

public class Elevater2 {
	protected int limit_up_floor;
	protected int limit_down_floor;
	protected int floor;
	String help;
	
	Elevater2(){
		limit_up_floor=10;
		limit_down_floor =1;
		floor =1;
		help="엘레베이터 기본 준공 완료";
		
	}
	Elevater2(int up_floor ,int d_floor, int in_floor){
		limit_up_floor=up_floor;
		limit_down_floor=d_floor;
		floor = in_floor;
		help="엘레베이터 맞춤 준공완료";
	}
	
	void up() {
		if(floor==limit_up_floor) {
			help="마지막 중입니다.";
		}else {
			floor++;
			help=String.format("[%d] 중입니다.",floor);
			
		}
	}
	void down() {
		if(floor==limit_down_floor) {
			help="처음 중입니다.";
		}else {
			floor--;
			help=String.format("[%d] 중입니다.",floor);
			
		}
		}
	
	void up(int u) {
		for(int i =0; i<u;i++) this.up();
	}
	void down(int u) {
		for(int i=0; i<u;i++)down();
	}
	
	void msg(String id) {
		System.out.printf("%s=>[%s] 최대중[%d] 최소중[%d] 현재중[%d]\n",id,help,limit_up_floor, limit_down_floor,floor);
		
	}
	
	
	}

	
