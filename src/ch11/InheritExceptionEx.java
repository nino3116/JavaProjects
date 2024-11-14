package ch11;

import java.io.IOException;
import java.sql.SQLException;

// 예외의 상속 관계...
//  - 부모가 throws하지 않는 Exception은 throws할 수 없음.

public class InheritExceptionEx {

	public static void main(String[] args) {
		

	}

}

class Super {
	public void doIt() throws IOException{
		System.out.println("IOEception을 throws합니다.");
	}
}

// 자식 클래스
class Sub extends Super{
	
	// 재정의 상황에서.,. throws에 IOEception을 SQLException으로 변경하면 ??
	@Override
	public void doIt() throws IOException {//, SQLException {
		System.out.println("Sub.doIt");
		try {
			super.doIt(); // 부모의 메서드
		} catch (IOException e) {
//			throw new SQLException(e.getMessage());
		}
		super.doIt();
	}
}