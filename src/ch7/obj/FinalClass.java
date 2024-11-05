package ch7.obj;

public final class FinalClass extends FinalTest { 
	// 파이널 클래스 : 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없음.

	// override...부모의  final method()를 오버라이드 할 수 없음...
	
}

//class FinalTest extends FinalClass {
//	// The type FivalTest cannot subclass the final class FinalClass
//}

class FinalTest {
	
	public final void method() {
		System.out.println("파이널 메서드 입니다.");
		
	}
}