package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		//문제 1, 2 출력, 3번 출력 문제...
		//문제 1. 토끼
	String var1 = "===================";
	String var2 = "\t /)/)";
	String var3 = "\t(  ..)";
	String var4 = "\t(  >♡";
	String var5 = " Have a Good Time.";
	String var6 = "===================";
 	
	System.out.println(var1);
	System.out.println(var2);
	System.out.println(var3);
	System.out.println(var4);
	System.out.println(var5);
	System.out.println(var6);
	
	//문제 2번. 회원 정보 - 머니 테이블
	System.out.println("----------문제 2번----------");
	System.out.println("\t#### 회비 정보 ####");
	System.out.println("=============================================");
	System.out.println("이름\t나이\t전화번호\t\t회비");
	System.out.println("=============================================");
	System.out.println("홍길동\t\"15\"\t010-123-1234\t\u20A920,000");
	System.out.println("임꺽정\t\"20\"\t010-234-2345\t\u20A930,000");
	System.out.println("김말이\t\"28\"\t010-345-3456\t\u20A950,000");
	System.out.println("---------------------------------------------");
	System.out.println("총합계\t\t\t\t\u20A9100,000");
	System.out.println("=============================================");
	
	// 3번 문제 
	System.out.println("------------3번------------");
	// 변수 사용해서 출력
	String banner = "========= 출력 결과 ==========";
	String name = "홍길동";
	int age = 20;
	String tel = "010-1234-1234";
	double height = 178.5;
	double weight = 75;
	String bloodType = "O";
	
	System.out.println(banner);
	System.out.println("이름\t: "+name);
	System.out.println("나이\t: "+age);
	System.out.println("tel\t: "+tel);
	System.out.println("키\t: "+height);
	System.out.println("몸무게\t: "+weight);
	System.out.println("혈액형\t: "+bloodType);

	}

}