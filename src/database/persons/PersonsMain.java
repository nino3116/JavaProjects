package database.persons;

import java.util.List;

public class PersonsMain {

	public static void main(String[] args) {
//		// test1 - insert 테스트
		// 1. 추가할 데이터 생성
//		PersonsVO vo1 = new PersonsVO(0, "pretest", "test", 29, "Seoul");
//		// 2. DAO 객체 호출 (데이터처리해줌)
//		PersonsDAO dao = PersonsDAO.getInstance();
//		// 3. 작업 처리.. insert() 함수 호출
//		int result1 = dao.insert(vo1);
//		if (result1 > 0) {
//			System.out.println("레코드 등록 성공");
//		}else {	// result가 0이면 실패
//			System.out.println("레코드 등록 실패");
//		}
		
		// test2 - select 테스트
		// 1. DAO 객체 호출
//		PersonsDAO dao = new PersonsDAO();
		// 싱글톤 인 경우
		PersonsDAO dao1 = PersonsDAO.getInstance();
		// 2. DAO 객체에 있는 select 처리할 메서드 호출 , 1).전체 출력 , 2).firstname으로 출력
		// 1) 전체 출력
		List<PersonsVO> list = dao1.selectAll();
		for (PersonsVO vo : list) {
			System.out.println(vo);
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 2) 부분조회(firstname)
		list = dao1.selectOneName("test");
		System.out.println("firstname에 'test'가 있는 경우 레코드 출력");
		for (PersonsVO vo : list ) {
			System.out.println(vo);
		}
		
		// 2-1). 부분조회(id)
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("id로 조회했을 경우 레코드 출력");
		System.out.println(dao1.selectOne(9));
		
		// 실습 PersonsDAO 객체 , update(), delete() 메서드 구현
		// - update()는 매개변수 타입으로 PersonsVO를 받고, 반환값은 0 또는 1로  반환
		//   0인 경우 -> 실패, 1인경우 -> 성공
		//	 sql => update persons set lastname = ? , firstname = ? , age = ?, city = ?,
		//			where id=?
		/*
		 *  - delete()는 매개 변수 타입으로 int로 전달값은 id값을 전달.
		 *  	0인 경우  -> 실패 , 1인경우 -> 성공
		 *  	sql => delete from persons where id =?
		 */
		
		// 3. update()
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		PersonsVO mod = dao1.selectOne(1);
		mod.setFirstname("modified");
		mod.setAge(27);
		mod.setCity("Seoul");
		int result = dao1.update(mod);
		if (result != 0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}

		// 4. delete()
		result = dao1.delete(15);
		if (result != 0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}

}
