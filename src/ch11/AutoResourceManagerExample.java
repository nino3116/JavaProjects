package ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class AutoResourceManagerExample {

	public static void main(String[] args) {
		
		
		// finally를 사용하지 않아요. 왜? try안에다가 쓰면 자동으로 실행후 정리 됨 
		// {} 블럭 안에서 처리가되고 블럭넘어가면 자동으로 자바프로그램으로 인해 버퍼정리가됨 
		try(FileInputStream in = new FileInputStream("a.txt")){ // 예외 발생....
			System.out.println("read data : " + in.read()); // 파일에 내용을 읽어서 출력.
		}catch (NullPointerException | IOException ex) {
//			System.out.println(in); // in 참조 할 수 없어요 위에 블럭에서 끝나니까.
			System.out.println("예외 처리합니다.");
			System.out.println(ex.toString());
		}catch (Exception e) {}
		
		// () 매개변수안에서 처리안하면 아래와 같이 파이널리를 통해 밑에 클로우즈로 버퍼 정리해야함
		FileInputStream in2 = null;
		try {
			in2 = new FileInputStream("a.txt");
			System.out.println("read date : " + in2.read());
			
		} catch (NullPointerException ex) {
			System.out.println("예외처리합니다.");
		}catch (IOException ioe) {
			System.out.println("예외처리합니다.");
			System.out.println(ioe.toString());
		}finally {
			// 객체 정리할 때 많이 사용함.
			try {in2.close();} catch (IOException e) {}
		}
		}

	}


