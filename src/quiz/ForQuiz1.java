package quiz;

public class ForQuiz1 {

	public static void main(String[] args) {
		// 1. 1 ~ 200까지 사이의 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구하세요.
		
		
		// 2. 랜덤 알파벳 대문자 50개를 생성해서 출력하는 프로그램을 만들어 보세요.
		//	  10줄 마다 줄바꿈도 실행해야 합니다.
		//		출력 예)		DFDQWAZCXV
		//					SADFSGWQVC
		//					.....
		//		1. 사용하는 함수(메서드) Math.random()을 활용해서 작업합니다.
		//		2. char 자료의 특징을 생각해서 작업을 진행합니다.
		//			- 정수 자료
		//			- 1글자 출력.(ASCII 코드 참조)
		
		
		// 1번문제
		int sum = 0;
		for (int j = 1; j <= 200; j++) {
			if (j % 2 != 0 && j % 3 != 0)
			sum += j; 
			
		}
		System.out.println("2또는 3의 배수가 아닌 수들의 총 합 : "+sum);
		
		
	
		// 2번 문제  아스키코드에서 알파벳대문자는 A~Z까지
		//			10진수 일 때 65에서~90까지
		//			16진수 일 때 0x41에서~0x5A까지
		// (int)(Math.random() * 10) + 10 -> 0+10 ~ 9 + 10
//		int random_char = (int)(Math.random() * 26) + 65;
		
		int symbol_size = 'Z' - 'A' + 1; // 1은 처리..
		for(int i = 0; i < 50; i++) {
//			char ch = (char)((int)(Math.random() * 26) + 65); -> 이렇게 해도됨
			int ch = 'A'+((int)(Math.random() * 26)); 
			System.out.printf("%c",(char)ch);
			if (i % 10 == 9) System.out.println();
		}
	
	
	}

	
}
