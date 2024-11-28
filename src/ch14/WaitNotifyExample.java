package ch14;

public class WaitNotifyExample {

	public static void main(String[] args) {

		WorkObject workObject = new WorkObject();	// 얘가 공유 객체임
		

		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		
		threadA.start();	// a가 실행되면 notify()가 실행대기 상태로 빠진다.(즉 실행할수있는 상태가되는것) 
		threadB.start();	// 이때 b는 a가 실행대기상태에서 wait를 만나 일시정지가 되고 a가 실행이 완료되면 실행대기상태로 올라가서 실행한다.
		

	}

}

class WorkObject {
	// 동기화 메서드 선언
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();	// 스레드 객체는 반환하는 것
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();  // wait() 메서드를 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만듬
		try {
			wait(); // 동기화 블럭 내에서 스레드를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {}
	}
	
    public synchronized void methodB() {
    	Thread thread = Thread.currentThread();	// 스레드 객체는 반환하는 것
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify();  // wait() 메서드를 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만듬
		try {
			wait(); // 동기화 블럭 내에서 스레드를 일시 정지 상태로 만듬
		} catch (InterruptedException e) {}
	}
}

class ThreadA extends Thread{
	
	private WorkObject workObject;
	public ThreadA(WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	@Override
	public void run() {
		workObject.methodA();
	}
}

class ThreadB extends Thread{
	private WorkObject workObject;
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}
	@Override
	public void run() {
		workObject.methodB();
	}
}