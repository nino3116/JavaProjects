package thisisjava;

import java.util.Scanner;

public class ageExample {

	int Method(int baseYear, int year, String ageType) throws Exception{ // year 출생년도 , ageType (연나이, 한국나이)
		
		int result = 0;
		
		if (ageType.equals("k") || ageType.equals("K")) {
			result = baseYear-year + 1;
		}else if(ageType.equalsIgnoreCase("y")) {
			result = baseYear-year;
		}else {
			throw new Exception("잘못된 입력입니다.");		// 예외던지기 처리
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("기준연도를 입력해주세요 : ");
		int baseYear = scan.nextInt();
		System.out.print("연도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.println("한국식나이(k), 연나이(y) k, y 둘 중 입력해주세요 : ");
		String ageType = scan.next();
		
		
		ageExample age = new ageExample();
		
		try {
			System.out.println(age.Method(baseYear, year, ageType) +"세 입니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}

class Person {
	
	// 필드
	int year;
	String name;

	// 생성자
	public Person(int year, String name) {
		this.year = year;
		this.name = name;
	}
		
	// 메서드
	
	
}
