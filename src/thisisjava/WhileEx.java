package thisisjava;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 :");
		int num = scan.nextInt(); // 입력받은 수
		int cnt = 0;
//		
//		while(cnt < num) {
//			 System.out.println(cnt++ +1 +"번째 반복");
//		}
		
//		char[] v = {'e','v','e','n','t'}; // 정답
//		char[] in = {'e','h','e','l','e'}; // 입력
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.print(v[i]+", "+in[i]+": ");
//			if (v[i] == in[i]) {
//				System.out.println("같다");
//			}else {
//				System.out.println("다르다");
//			}
//			
//		}
		
		while(true) {
			if (cnt < num) {
				System.out.println(cnt++ + " 번째 반복");
			}else if ( num == 0) {
				
			}
		}
	}

}

/*
 * =
 * +=
 * -=
 * 
 * == 같을 때
 * != 같지않을 때
 * <= 작거나 같다
 * >= 크거나 같다
 * 
 * && ! ||
 * 
 * */
