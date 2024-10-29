package quiz;

public class LoopQuiz1 {

	public static void main(String[] args) {
		// Lotto 번호를 출력하는 프로그램 작성
		
		/*
		 * 	1. 1부터 45사이의 랜덤 숫자를 생성하기
		 * 	2. 변수 6개 선언해서 해당 변수에 값을 대입
		 * 	3. 번호를 출력하기
		 * 
		 */

		System.out.println("ㅡㅡㅡ로또번호게임ㅡㅡㅡㅡ");

		int lotto1 =0, lotto2 =0, lotto3 =0, lotto4 =0, lotto5 =0, lotto6 =0;
		int count = 0; // 출력 번호 갯수
		
		while(true){
			int num = (int)(Math.random()* 45) +  1; // 1 ~ 45
			
			//검증...
		if(num != lotto1 && num != lotto2 && num != lotto3 && num != lotto4
				&& num != lotto5 && num != lotto6) {
			
			System.out.print(num + " ");
			count ++;
		
		if (lotto1 == 0) {
			lotto1 = num;
		}else if(lotto2 == 0) {
			lotto2 = num;
		}else if(lotto3 == 0) {
			lotto3 = num;
		}else if(lotto4 == 0) {
			lotto4 = num;
		}else if (lotto5 == 0) {
			lotto5 = num;
		}else if (lotto6 == 0) {
			lotto6 = num;
		}
	}
		
		if (count == 6) break;

 	}

  }

}
