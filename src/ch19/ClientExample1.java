package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample1 {

   // 클라이언트 프로그램
   
   public static void main(String[] args) {
      try {
         // 1. Socket 생성
//         // -방법1 생성자에 직업 입력하는 방법
//         Socket socket = new Socket("192.168.0.123", 50001);
//         // 2. 방법 2 생성자 주입 정보 : InetSocketAddress 객체 사용
         Socket socket = new Socket();
         InetSocketAddress serverAddr = new InetSocketAddress("192.168.0.123", 50001);
         socket.connect(serverAddr);	// connect() 주어진 객체 주소로 연결을 시도하는 메서드
         
         System.out.println("[클라이언트] 연결 성공");
         
         // 2. 데이터 처리를 위한 작업 
         String sendMessage = " 점심을 무엇을 먹어야 잘 먹었다 하나~~";
         // getOutputStream() : OutputStream 객체 반환 - 전송시 내보낼 데이터 처리를 위해 
         OutputStream os = socket.getOutputStream();
         // 보조 스트림 중 DataOutputStream
         DataOutputStream dos = new DataOutputStream(os);
         dos.writeUTF(sendMessage);
         dos.flush();
         
//         byte[] bytes = sendMessage.getBytes("UTF-8");
//         os.write(bytes);
//         os.flush();
         System.out.println("[클라이언트] 데이터 전송 : " + sendMessage);
         
         // 서버에서 온 데이터 받기
         InputStream is = socket.getInputStream();
         // 보조 스트림 중 DataInputStream!!!!!
         DataInputStream dis = new DataInputStream(is);
         String receiveMessage = dis.readUTF();
//         bytes = new byte[1024];
//         int readByteCount = is.read(bytes);
//         String recieveMessage = new String(bytes, 0, readByteCount, "URF-8");
         System.out.println("[클라이언트] 데이터 받음 : " + receiveMessage);
         
         // 3. 연결 끊기 : Socket 닫기
         socket.close();
         System.out.println("[클라이언트] 연결 끊음");
         
      } catch (UnknownHostException e) {
         // IP 표기 방법이 잘못된 경우
      } catch (IOException e) {
         // 서버에 연결하지 못하는 경우
      }

   }

}
