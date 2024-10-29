package quiz;

public class ForQuiz2 {

	public static void main(String[] args) {
		// 이중 for문 혹은 반복문을 통해서 별찍기
		/*
		 *	*
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *  ******
		 */
		
		for (int star = 0; star < 5; star++) {
			for (int star2 = 0; star2 <= star; star2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * quiz... 다음과 같이 별찍기 하세요...
		 * 
		 * 1)     *    2)  *****   3) *****
		 *       **        ****        ****
		 *      ***        ***          ***
		 *     ****        **            **
		 *    *****        *              *
		 * 
		 * 4)     *    5)  *********
		 *       ***        *******
		 *      *****        *****
		 *     *******        ***
		 *    *********        *
		 * 
		 */
		
		// 1번문제
		System.out.println("ㅡㅡㅡㅡㅡ1번문제ㅡㅡㅡㅡㅡ");
		for(int star = 0; star < 5; star++) { // star가 5번찍힐동안 반복
			// 공백 찍기
			for(int star2 = 0; star2 < 5 - star - 1; star2++) {
				System.out.print(" ");
			}
			//별 찍기
			for(int star2 = 0; star2 <= star; star2++) {
				System.out.print("*");
			}
			System.out.println();
			
		// 2번문제
		}
		System.out.println("ㅡㅡㅡㅡㅡ2번문제ㅡㅡㅡㅡㅡㅡ");
		for (int star = 1; star <= 5; star++) {
			for(int star2 = 5; star2 > star-1; star2--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3번문제
		System.out.println("ㅡㅡㅡㅡㅡ3번문제ㅡㅡㅡㅡㅡ");
		for(int star = 0; star < 5; star++){// 0, 1, 2, 3, 4
			//공백 찍기
			for(int star2 = 0; star2 < star; star2++) { // 반복회차 : 0, 1, 2, 3, 4
				System.out.print(" ");
			}
			//별찍기
				for(int star2 = 0; star2 < 5- star; star2++) {
					System.out.print("*");
				}
			System.out.println();
		}
		// 4번문제
		System.out.println("ㅡㅡㅡㅡㅡ4번문제ㅡㅡㅡㅡㅡ");
		for(int star = 0; star < 5; star++){// 0, 1, 2, 3, 4
			//공백 찍기
			for(int star2 = 0; star2 < 5 - star - 1; star2++) { // 반복회차 : 0, 1, 2, 3, 4
				System.out.print(" ");
			}
			//별찍기
				for(int star2 = 0; star2 <= star*2; star2++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		System.out.println("ㅡㅡㅡㅡ5번문제ㅡㅡㅡㅡㅡ");
		for (int star = 0; star < 5; star++) {
			//공백 찍기
			for(int star2 = 0; star2 < star; star2++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int star2 = 0; star2 < 2*5-(star*2)-1; star2++) {
				System.out.print("*");
			}
				System.out.println();
		}
		// while문으로 위에 코드를 변경해서 동일하게 동작하게 만들어 보세요!!!
		
		System.out.println("while문으로 변경한 코드 출력...");
		// while 1번문제
		int i = 0; 
		while(i < 5) { 
			
			int j = 0;
			// 공백 찍기
		    while (j < 5 - i -1) {
				System.out.print(" ");
				j++;
			}
			//별 찍기
		    j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("ㅡㅡㅡㅡㅡwhile 2번문제ㅡㅡㅡㅡㅡㅡ");
		int a = 1;
		int b = 1;
		while( a < 6) { //a가 6보다 작을때까지
			while(b < 6) { //b가 6보다 작을때가지
				System.out.print("*");
				b++;	
			}
			System.out.println(" ");
			a++;
			b=a;
		}
	}
}
