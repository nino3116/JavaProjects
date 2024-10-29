package quiz;

import java.util.Scanner;

public class Coffeeprice {

	public static void main(String[] args) {
		// 문제
		// 한 커피 매장에서 커피의 가격이 2000원 입니다.
		// 이 매장에서 10개 이상 커피를 구매하면 초과하는 커피의 개당 가격은 1500원을 받습니다.
		// 커피의 개수를 입력 받고, 총 가격이 얼마인지 계산해서 출력하는 프로그램을 만들어 보세요.
		
		// 1. Scanner 객체를 통한 커피잔 갯수 입력.
		// 2. 입력 값에 따른 금액 계산 10잔 이하.. 10잔 초과..
		// 3. 결과 값 출력
		Scanner scan = new Scanner(System.in);
		
		// 커피 갯수 입력
		System.out.print("커피 구매 잔 수 입력 : ");
		int qty = scan.nextInt();
		// 금액 변수
		int price = 0;
		// 기본 커피 금액 : 2000
		int normal_price = 2000;
		// 할인된 커피 금액 : 1500
		int discount_price = 1500;
		
		// 10 이하, 10초과시...
		if (qty > 10) { // 11 이상...
			price += (10 * normal_price) + (qty - 10) * discount_price;
			// price += (10 * normal_price)기존값 + (qty - 10) * discount_price;
			
		}else {
			price += (normal_price * qty);
		}
	  
		// 금액 출력
		System.out.println("커피 가격은 "+ price +"원 입니다.");
	    }

	}


