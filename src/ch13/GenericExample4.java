package ch13;

public class GenericExample4 {

	// 제한된 타입 파라미터를 갖는 제너릭 메서드	
	public static <T extends Number> boolean compare(T t1, T t2) {
		// T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName() +", "
				+ t2.getClass().getSimpleName() + ") ");
		
		// Number의 메서드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		// 제너릭 메서드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();
		
		// 제너릭 메서드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
		
		// 제너릭 메서드 호출
		short s1 = 10;
		Short s2 = 20;
		boolean result3 = compare(s1, 10); 	// 숫자도 가능 위에 익스텐즈에 number에 int, long.. 등등 다 포함되어있음 
		System.out.println(result3);
		System.out.println();
				
		
	}

}
