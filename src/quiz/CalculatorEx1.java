package quiz;

import java.util.Scanner;

public class CalculatorEx1 {

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
			
			// 메뉴 선택에 따른 동작을 구현
			switch (selectManu) {
			
			case "1" :
				System.out.println("더하기 계산을 합니다.");
				plus();
				break;
			case "2" :
				System.out.println("빼기 계산을 합니다.");
				sub();
				break;
			case "3" :
				System.out.println("곱하기 계산을 합니다.");
				mult();
				break;
			case "4" :
				System.out.println("나누기 계산을 합니다.");
				div();
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
	
	// 더하기 메서드...
	public static void plus() {
		System.out.print("첫번째 정수 입력 : ");
		int plus1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int plus2 = scan.nextInt();
		System.out.println("더하기 결과 : " + (plus1 + plus2));
	}

	public static void sub() {
		System.out.print("첫번째 정수 입력 : ");
		int sub1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int sub2 = scan.nextInt();
		System.out.println("빼기 결과 : " + (sub1 - sub2));
	
    }	
	public static void mult() {
		System.out.print("첫번째 정수 입력 : ");
		int mult1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int mult2 = scan.nextInt();
		System.out.println("곱하기 결과 : " + (mult1 * mult2));

	}
	public static void div() {
		System.out.print("첫번째 정수 입력 : ");
		int div1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int div2 = scan.nextInt();
		if(div2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나누기 결과 : " + (div1 / div2));
	
	}

}