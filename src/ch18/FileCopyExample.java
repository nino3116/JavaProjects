package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyExample {

	public static void main(String[] args) throws Exception {
		// 파일 데이터를 읽어서, 다른 이름으로 저장하는 프로그램...
		// 파일 위치정보... String
		String originalFileName = "D:/Temp/testing.jpg";
		String targetFileName = "D:/Temp/testingCopy.jpg";
		
		// 1. 객체 생성 ( InputStream, OutputStream )
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		// 2. 데이터 처리(읽고 -> 저장공간에 저장 -> 쓰기...)
		
//		byte[] data = new byte[1024];
//		while (true) {
//			// 데이터 읽어 저장하기
//			int num = is.read(data);	//  num에는 읽어들인 데이터의 사이즈
//			if (num == -1 ) break;
//			// 저장된 데이터를 쓰기...작업
//			os.write(data, 0, num); 	
			// os.wtite(data)를 사용하지 않은 이유? 특정데이터를 저장하기 위해서 마지막 데이터 때문
//		}
		
		// InputStream.transferTo(outputStream) 
		//     : 입력 객체의 데이터를 매개변수로 전달된 객체로 보냄
		is.transferTo(os); // 파일 복사 관련 메서드
		
		// 3. close() : 객체가 종료되어야 출력 입력 과정이 종료.
//						안하면 입력 또는 출력을 기다리기 때문에.. 꼭 닫아줘야 함
		os.flush();
		os.close();
		is.close();
		
		
	}

}
