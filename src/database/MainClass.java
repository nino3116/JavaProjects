package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


// https://www.notion.so/java-DB-JDBC-15fffafc7da780c38654cafda21e1c16?pvs=4 , 내 메모링크
public class MainClass {

	public static void main(String[] args) {
		// JDbd 연결....
		// Connection 객체 선언
		Connection conn = null;
		try {
			// 1. Driver Loading -> DB연동을 위해서 구현된 라이브러리 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection 객체 생성. DriverManager를 통해서
			conn = DriverManager.getConnection(
					// : “jdbc:mysql://DB주소:포트번호/DB이름?serverTimezone=UTC시간값” 
					"jdbc:mysql://192.168.0.123:3306/testdb?severTimezone=Asia/Seoul",
					//mysql user정보
					"testuser1",
					// 비밀번호
					"P@ssw0rd"
					);
			System.out.println(conn);
			System.out.println("데이터 베이스 접속");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			sqle.printStackTrace();
		} finally {
			try {
				if (conn != null) conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
