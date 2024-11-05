package quiz.obj;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사"); // 체력 500
		Warrior play3 = new Warrior("전사 약해요"); // 체력 1000
		
		System.out.println("----나의 캐릭 배쉬스킬 사용 -----");
		me.bash(play2);	
		me.bash(play3); 
		
		me.bash(play2);	
		me.bash(play3); 
		
		
		play2.info();
		play3.info();
	}

}
