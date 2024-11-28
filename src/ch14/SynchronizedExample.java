package ch14;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Calculator calculator = new Calculator();	// 공유자원으로 메모리를 가지고 있음
		
		
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
		

	}

}

class Calculator{
	// 필드
	private int memory;
	
	//getter
	public int getMemory() {
		return memory;
	}
	
	//setter
	// 동기화는 메서드 선언부에 사용하면 됨 
	public synchronized void setMemory1(int memory) {	// 동기화 메서드 설정(synchronized)
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+": " +this.memory);
	}
	
	public void setMemory2(int memory) {
		// synchronized 블럭 생성...
		synchronized (this) {	// synchronized (공유객체){ }
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": " +this.memory);
		}
		
	}
	
}

class User1Thread extends Thread{
	//필드
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}

class User2Thread extends Thread{
	//필드
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
