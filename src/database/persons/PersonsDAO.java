package database.persons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO 데이터베이스와 접속하여 동작하는 기능을 구현한 클래스
public class PersonsDAO {

	/* 필드 영역 */
	// DB 연결을 위한 정보
	private String url = "jdbc:mysql://192.168.0.123:3306/testdb?serverTimezone=Asia/Seoul";
	private String user = "testuser1";
	private String password = "P@ssw0rd";

	// 데이터 접속을 위한 객체
	Connection conn = null; // DB연결 객체
	Statement stmt = null; // SQL 처리를 위한 객체
	ResultSet rs = null; // DB로부터 받은 레코드 정보를 처리

	// 싱글톤 1단계 = 자기 자신을 생성하는 객체 멤버 
	private static PersonsDAO instance = new PersonsDAO();
	
	/* 생성자 영역 */
	// 싱글톤 2단계 = 외부에서 접근해서 생성 
	private PersonsDAO() {
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("DB 연동 실패");
			System.out.println(sqle.getMessage());
		}
	}


	/* 메서드 영역 */
	// 싱글톤 3단계 : instance에 대한 getter 생성
	public static PersonsDAO getInstance() {	
		return instance;
	}
	
	
	
	// 데이터 입력 메서드 구현
	public int insert(PersonsVO vo) {
		int result = 0;

		// 구현..
		try {
			// 3. Statement 객체 생성
			stmt = conn.createStatement();
			// 4. SQL 작성
			String sql = "INSERT INTO persons (firstname, lastname, age, city)" + "values('" + vo.getFirstname() + "','"
					+ vo.getLastname() + "'," + "," + vo.getAge() + ", '" + vo.getCity() + "')";
			String sql2 = String.format(
					"INSERT INTO persons (firstname, lastname, age, city)" + "VALUES('%s', '%s', %d, '%s')",
					vo.getFirstname(), vo.getLastname(), vo.getAge(), vo.getCity());
			// 5. SQL 실행
			result = stmt.executeUpdate(sql2);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return result;
	}

	// 데이터 조회
	// 1).전체 조회
	public List<PersonsVO> selectAll(){
		// 리스트 객체 생성
		List<PersonsVO> list = new ArrayList<>();
		try {
			// 3. stmt 객체 생성
			stmt = conn.createStatement();
			// 4. sql 작성
			String sql = "select * from persons";
			// 5. SQL 실행 - > executeQuery()
			rs = stmt.executeQuery(sql);
			// ResultSet 처리...
			while (rs.next()) {		// next() boolean타입으로 값이 있으면 ture, 없으면 false
//				PersonsVO vo = new PersonsVO();
//				vo.setId(rs.getInt("id"));
//				vo.setLastname(rs.getString("lastname"));
//				vo.setFirstname(rs.getString("firstname"));
//				vo.setAge(rs.getInt("age"));
//				vo.setCity(rs.getString("city"));
				PersonsVO vo = new PersonsVO(
						rs.getInt("id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getInt("age"),
						rs.getString("city"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	// 2). 부분 조회 (firstname)  -> firstname 으로 하면 유니크한걸로 조회하는게 아니기에 여러개 결과값이 나올 수 있으므로 위에 코드와 비슷함
	public List<PersonsVO> selectOneName(String firstname){
		List<PersonsVO> list = new ArrayList<>();
		
		try {
			// 3. stmt 객체 생성
			stmt = conn.createStatement();
			// 4. sql 작성
			String sql = "select * from persons "
			+ "where firstname like '%"+firstname+"%'";
			// 5. SQL 실행 - > executeQuery()
			rs = stmt.executeQuery(sql);
			// ResultSet 처리...
			while (rs.next()) {		// next() boolean타입으로 값이 있으면 ture, 없으면 false
				PersonsVO vo = new PersonsVO(
						rs.getInt("id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getInt("age"),
						rs.getString("city"));
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 2-1). 부분조회(id)
	public PersonsVO selectOne(int id) {
		PersonsVO vo = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from persons where id =" + id;
			rs = stmt.executeQuery(sql);
			// ResultSet 처리...
			if (rs.next()) {		// next() boolean타입으로 값이 있으면 ture, 없으면 false
				 vo = new PersonsVO(
						rs.getInt("id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getInt("age"),
						rs.getString("city"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	// 3). update
	public int update(PersonsVO vo) {
		
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			 String sql = String.format(
		               "update persons set lastname='%s', firstname='%s', age=%d, city='%s'"
		               + "where id=%d", vo.getLastname(),vo.getFirstname(),vo.getAge(),
		               vo.getCity(), vo.getId());
			result = stmt.executeUpdate(sql);
			if (rs.next()) {		// next() boolean타입으로 값이 있으면 ture, 없으면 false
				 vo = new PersonsVO(
						rs.getInt("id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getInt("age"),
						rs.getString("city"));
			}
		} catch (SQLException sqle) {
			System.out.println("DB연동실패");
			System.out.println(sqle.getMessage());
		}
		return result;
	}
	
	// 4). delete
	
	public int delete(int id) {
		int result = 0;
		
		try {
			stmt = conn.createStatement();
			String sql = " delete from persons where id ="+ id; 
			result = stmt.executeUpdate(sql);
		} catch (SQLException sqle) {
			System.out.println("DB연동 실패");
			System.out.println(sqle.getMessage());
		}
		return result;
	}
	
	
}
