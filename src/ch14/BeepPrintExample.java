package ch14;

import java.awt.Toolkit;
// GUI 작업 시 사용하는 유틸리티 클래스이다.
// 그래픽 자원관련 시스템 정보를 제공한다.

public class BeepPrintExample {

	public static void main(String[] args) {
		// Toolkit은 객체가 하나만 존재해야 해서 new 명령으로 만들 수 없으며,
		// Component 의 메소드인 getToolkit( ) 이나 Toolkit.getDefaultToolkit( ) 을 사용해야 한다.
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0;i<5;i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(500); // 1000이 1초다
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		// 스레드를 통해서 작업 진행...
		// Runnable을 집어넣어서 하는 방법
		// Runnbale 인터페이스는 1개의 메소드 만을 갖는 함수형 인터페이스이다. 그렇기 때문에 람다로도 사용 가능하다.
		//  출처: https://mangkyu.tistory.com/258 [MangKyu's Diary:티스토리]
		Thread thread = new Thread(new Runnable() {		// Runnable은 실행 대기상태이다.
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep(); // beep 소리가 울리는 함수 beep()
					try {
						Thread.sleep(500); // 1000이 1초다
					} catch (Exception e) {

					}
				}		
			}
		});
		
		// 스레드 생성
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep(); // beep 소리가 울리는 함수 beep()
					try {
						Thread.sleep(500); // 1000이 1초다
					} catch (Exception e) {

					}
				}		
			}
			
		};
		// 스레드 시작
//		thread.start();
		BeepWork beep = new BeepWork();  // 밑에 만든 메서드를 통해서 작동시키는 방법
		beep.start();
		
		for(int i = 0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 1000이 1초
			} catch (Exception e) {
				
			}
		}
	}

}

// BeepWork 클래스 (Thread 상속)
class BeepWork extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); // beep 소리가 울리는 함수 beep()
			try {
				Thread.sleep(500); // 1000이 1초다
			} catch (Exception e) {

			}
		}		
	}
}