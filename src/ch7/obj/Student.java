package ch7.obj;
 // Person 클래스의 자식
public class Student extends Person {
	
	// 1. 필드(멤버변수)
	public String studentId;	// 학번
	// 2. 생성자
	public Student() {}
	
	public Student(String name, int age, String studentId) {
		super(name,age);
		this.studentId = studentId;
		/*
		 * super는 현재 객체의 부모 객체, 바로 위에 부모 객체를 의미함.
		 * super. 인 경우
		 *  - 부모의 변수 또는 메서드 참조
		 *  	ex) super.name, super.info()
		 * super()
		 *  - 부모의 생성자를 참조
		 *  	ex) super(); // 부모의 기본 생성자
		 *  		super(name, age); // 부모 객체의 Person(name,age)참조
		 *  ## this(), super() 생략한 경우... 자동으로 super() 를 JVM이 자동으로 처리함.
		 * 
		 */
	}
	// 3. 메서드
	
	/*
	 * 메서드 재정의(Override)
	 *  부모 클래스로부터 상복받은 메서드를 자식 클래스에서 행위를 바꾸거나 보완하기 위해서 다시 정의해서 사용하는 것
	 *  
	 *  - 재정의 규칙
	 *    1. 상속을 전제로 한다.
	 *    2. return 타입, 메서드 이름, 파라미터(매개) 변수 설정이 일치해야 합니다.
	 *    3. 접근제한자는 같거나 더 more public 해야 한다.
	 */
	@Override
	public String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
	}
	
	@Override
	public int hashCode() { // 정수값으로 반환
		// 객체 동등비교를 위해서 사용하는 메서드, 재정의
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((studentId == null)? 0 : studentId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // 두개의 타입을 비교해서 boolean타입으로 반환
		// 객체 동등비교를 위해서 사용하는 메서드, 재정의
		if(this == obj) return true;	// 같은 객체. 주소가 같아요.
		if(obj == null) return false;	// // 비교 대상이 null이라면 false를 반환하여 다른 객체로 간주
		if(getClass() != obj.getClass()) return false; // 두 객체의 클래스 타입이 다르면 다른 객체로 간주하여 false 반환
		// getClass() 해당 객체의 클래스를 나타냄.
		Student other = (Student)obj;  // 비교 대상 obj를 Student 타입으로 형변환하여 다른 이름의 변수 other로 다루기
		if (age != other.age) return false; // 나이(age) 속성 값이 다르면 false 반환
		if (name == null) {  // 현재 객체의 name이 null일 경우
			if (other.name != null) return false; // 비교 대상 other의 name이 null이 아니면 false 반환
		}else if (!name.equals(other.name)) return false; // name이 null이 아니고 두 객체의 name이 다르면 false 반환

		// 모든 조건을 통과하면 두 객체가 같으므로 true 반환
		return true;
	}

	@Override
	public String toString() { // 객체를 문자열로 전환...
		// 기본적으로 클래스명@hashcode 값으로 출력됨.(Object.toString()의 결과)
		// 재정의를 통해서 객체 내 정보를 확인하기 위한 용도 사용
		return "[이름 : " + name +", 나이 : " + age + ", 학번 : " + studentId + "]";
	}
	

}
