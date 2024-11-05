package quiz.obj;

public class Warrior extends Player {
	
	
	public Warrior(){}
	public Warrior(String name, int hp, int mp){
			this.name = name;
		    this.hp = hp;
			this.mp = mp;
		}
	public Warrior(String name) {
		this(name, 1000, 500);
	}
	
	// 매개값 추가... Warrior, Wizard
	void bash(Player player) {
		
		// 만약 mp가 100 미만이면 ... 스킬동작 x
		if(this.mp < 100) {
			System.out.println("mp가 모자라요");
			return;
		}else {
			// 실행시 mp를 -100감소
			mp -= 100;
		

		if(player instanceof Warrior) {
			// 감소 폭이 - 100
			player.hp -= 100; // hp -100 감소
		}else if (player instanceof Wizard) {
			player.hp -=200;
		}
		System.out.println(player.name + "님 배쉬 스킬 적중");
		
		}
		
	}
		
	@Override
	void action() {
		System.out.println("전사는 멋진 동작을 합니다.");
	}
	
		
}







