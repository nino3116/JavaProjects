package ch14;

public class InterruptExample {

	public static void main(String[] args) {
		// 스레드 생성
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();		// 메소드 호출 일시정지 상태의 스레드는 InterruptException이 발생함
	}

}

class PrintThread2 extends Thread {
	// 필드
	@Override
	public void run() {
//		//방법 1
//		try {
//			while(true) {
//				System.out.println("실행중...");
//				Thread.sleep(1);	//	스레드를 일시정지를 만듬 인터럽트익셉션이 발생할 수 있도록.
//			}
//		} catch (InterruptedException e) {
//			System.out.println("InterruptException 발생");
//		}
		// 방법2
		
		while(true) {
			System.out.println("실행중....");
			if(Thread.interrupted()) {	// boolean 이라서 리턴값이 인터럽트가 발생된다면 true이고 만약 인터럽트가 아니라면 false임 
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
}