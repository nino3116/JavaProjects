package ch6.obj;

public class Calculator {

	// 필드(속성,변수) 명사적의미를 가지고 있는 애들
	int firstNumber;
	int secondNumber;
		
	// 생성자 (객체 생성시 멤버 변수의 초기화)
	public Calculator() {} // 기본 생성자...
	
	// 멤버 초기화 생성자..
	public Calculator(int firstNumber, int num2) {
		this.firstNumber = firstNumber;  // this. 는 해당 클래스(객체) 그 자체를 의미함.
		secondNumber = num2;
	}
	
	// Overload : 매개 변수의 값을 가지고 메서드를 구분(개수, 타입, 순서)
	public Calculator(int[] nums) {
		this.firstNumber = nums[0];
		secondNumber = nums[1];
	}
	
	// 더하기
	public int plus() {
		return firstNumber + secondNumber;
	}
	public int plus(int num1, int num2) {
		return (num1 + num2);
	}
	
	public int plus(int[] nums) {
		return nums[0] + nums[1];
	}
	// 빼기
	public int minus() {
		return firstNumber - secondNumber;
	}
	
	public int minus(int num1, int num2) {
		return (num1 - num2);
	}
	
	public int minus(int[] nums) {
		return nums[0] - nums[1];
	}
	// 곱하기
	public int mutipie() {
		return firstNumber * secondNumber;
	}
	
	public int mutiple(int num1, int num2) {
		return (num1 * num2);
	}
	
	public int mutiple(int[] nums) {
		return nums[0] * nums[1];
	}
	
	// 나누기
	public int division(int num1, int num2) {
		
		return (num1 / num2);
	}
	
	public int division(int[] nums) {
		return nums[0] / nums[1];
	}
	
	// 필드 값을 출력하는 메서드
	
	public void numsInfo() { // console화면에 필드값 출력...
		System.out.println("firstNumber의 값 : " + firstNumber);
		System.out.println("secondNumber의 값 : " + secondNumber);
	}
	
	
	
	
}
