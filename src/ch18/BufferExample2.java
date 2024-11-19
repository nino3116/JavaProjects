package ch18;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferExample2 {

	public static void main(String[] args) throws Exception {
		
		// 1. 객체 생성 : bufferedReader 
		BufferedReader br = new BufferedReader(
				new FileReader("src/ch18/BufferExample.java")
		);
		// 2. 데이터 처리
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); // "\n"을 만나기까지 데이터를 읽기 처리함..
			if(str == null) break;		// 반환타입이 버퍼는 null임. 브레이크를 null로잡아줘야 함  
			System.out.println(lineNo +"\t " + str);
			lineNo ++;
		}
		// 3. close()
		br.close();
	}

}
