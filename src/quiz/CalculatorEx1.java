package quiz;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class CalculatorEx1 { // 클래스
	
	// 필드(멤버변수)
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 계산기 프로그램 작성하기...
		
		
		out : while (true) {
			// 1-1 메뉴 생성하기...

			System.out.println(">>초기메뉴");
			System.out.println("[계산 프로그램]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 종료");
			System.out.println("선택 > ");

			// 입력값 받기...
			// Scanner 객체 생성
			String selectManu = scan.next();
			
			int[] nums = new int[2]; // 배열 선언한 것을 여기로 불러들여야함.
			// 메뉴 선택에 따른 동작을 구현
			switch (selectManu) {
			
			case "1" :
				System.out.println("더하기 계산을 합니다.");
				inputNum();
				System.out.println("더하기 결과 : " + plus(nums[0], nums[1]));
				break;
			case "2" :
				inputNum();
				System.out.println("빼기 결과 : " + sub(nums[0], nums[1]));
				break;
			case "3" :
				inputNum();
				System.out.println("곱하기 결과 : " + mult(nums[0], nums[1]));
				break;
			case "4" :
				inputNum();
				System.out.println("나누기 결과 : " + div(nums[0], nums[1]));
				break;
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				break out; // 종료시킬 while을 종료
			default:
				System.out.println("메뉴 선택이 잘못됐습니다.");
				System.out.println("다시 메뉴 선택해 주세요.");
			}
			
		}//while() 끝
		
	} // main()끝

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	// 더하기 메서드...
	public static int plus(int plus1,int plus2) {	
		return (plus1 + plus2);
	}

	public static int sub(int sub1, int sub2) {
		return (sub1 - sub2);
    }	
	public static int mult(int mult1, int mult2) {
		return (mult1 * mult2);
	}
	public static double div(int div1, int div2) {
		if(div2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0.0; // 원래는 예외처리해야 하지만...
		}
	 return (int)((div1 / (double)div2)*100) / (double)100;
	}
	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// 두 정수를 입력받는 메서드
	public static int[] inputNum() {
		// int 배열 선언
		int[] nums = new int[2];
		System.out.print("첫번째 정수 입력 : ");
		nums[0] = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		nums[1] = scan.nextInt();
		return nums;
	}
	
	
	
}