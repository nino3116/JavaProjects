package ch11;

// (실행예외)
//Runtime Exception -> UncheckException -> 컴파일러 예외 확인하지 않음. 실행중에 확인함
public class ExceptionExample1 {

	public static int makeExcaption(int input) {
		int divide = 0;
		int result = input/divide;  // java.lang.ArithmeticException: / by zero
		return result;
	}
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));  
		// java.lang.StringIndexOutOfBoundsException : Index 1 out of bounds for length 1
	}
	
	 public static void makeException3() throws Exception {
	      int[] a = { 1, 2, 3};
	      System.out.println(a[3]);
//	       java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//	      Exception in thread "main" java.lang.Error: Unresolved compilation problem:
//	  	Unhandled exception type Exception (예외처리를 다른 곳에다가 던졌음 그 던진곳에서 해결 안해주면 발생됨)

	   }
	   
	   public static void makeException4() {
	      String nothing = null;
	      System.out.println(nothing.split(""));  // 25라인에서
	      // java.lang.NullPointerException: Cannot invoke "String.split(String)" because "nothing" is null
	   }
	   
	   public static void makeException5() {
	      String notInt = "가나다";
	      int a = Integer.parseInt(notInt); // 31 라인에서 
	      //  java.lang.NumberFormatException: For input string: "가나다"
	   }
	   
	   public static void makeExcetpion6() {
	      for(int i = 0; i < Integer.MAX_VALUE; i++) {
	         makeExcetpion6();		// 37라인 여기서 발생
	         // Exception in thread "main" java.lang.StackOverflowError
	      }
	   }
	   
	   public static void makeException7() {
	      Object[] objArr = new String[3];
	      objArr[0] = 0;		 // 44라인에서 발생
	      // Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
	   }
	   
	   public static void makeException8() {
	      Object[] objArr = new String[3];
	      objArr[0] = "0";
	      Integer a = (Integer) objArr[0]; // 51번 여기서 발생
//	      java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
//	      (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	   }

	public static void main(String[] args) {
//		makeExcaption(10);
//		makeException2();
//		makeException3(); // 이 메서드는 throws를 사용하여 예외 사항을 호출한 곳으로 넘김.
						  // 이 메서드를 호출한 곳에서 예외 처리를 진행해야 함. 근데 안하니까 에러가 나는 것임
						  // 예외 처리 방법은 1) try - catch - finally 구문의 사용과
						  // 2) throws가 있음.
//		makeException4();
//		makeException5();
//		makeExcetpion6();
//		makeException7();
//		makeException8();
	}

}
