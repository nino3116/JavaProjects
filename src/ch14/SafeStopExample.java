package ch14;

public class SafeStopExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		printThread.setStop(true);
	}

}

class PrintThread extends Thread {
	// 필드
	
	private boolean stop;
	
	// setter 값의 변화를 줄수 있는 놈을 만들어야 함
	public void setStop(boolean stop) {
		this.stop = stop;
	
	}
	
	
	// run 오버라이드
	@Override
	public void run() {
		while(!stop) {	// 불린 기본타입이 false 이기때문에 ! 을 써주면 계속 true가 됨
			System.out.println("실행중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		
	}
}