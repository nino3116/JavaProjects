package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClientExample1 {

	
	
	public static void main(String[] args) {
			
		try {
			// 1. DatagramSocket 생성
			DatagramSocket datagramSocket = new DatagramSocket();	// UDP는 응답을 기다리지않으니 포트번호 넣을게 아니다.
			
			// 2. 데이터 생성 (DatagramPacket에 저장함)
			// 구독하고 싶은 뉴스 주제 보내기
			String data = "경제";
			byte[] bytes = data.getBytes("UTF-8");
			// DatagramPacket 객체로 보낼 데이터 생성
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length
					, new InetSocketAddress("192.168.0.123", 50002));
			datagramSocket.send(sendPacket);
			
			while(true) {
				// 3. 데이터 받기 처리....
				DatagramPacket receivePacket =new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				// 4. 받은 데이터 처리.......
				String news = new String(receivePacket.getData(),
						0,
						receivePacket.getLength(),
						"UTF-8");
				System.out.println(news);
				
				// while 탈출문...
				if(news.contains("뉴스10")) {
					break;
				}
			}
			
			// DatagramSocket 을 닫기 처리
			datagramSocket.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
