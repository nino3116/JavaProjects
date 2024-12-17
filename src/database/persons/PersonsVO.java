package database.persons;

public class PersonsVO {
	// JAVA 프로그래밍에서 VO 또는 DTO 객체는 데이터를 저장하는 객체
	// VO는 DB와 연동할 데이터를 저장하는 객체,
	// DTO는 데이터를 전달하는 객체로 사용.
	// DB연동 동작에 대해서는 DAO를 생성하여 작업을 진행.

	// --------------------------------------------------------------
	// 테이블 Persons에 있는 컬럼, ID, FirstName, LastName, Age, City
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private String city;

	// 생성자
	// 기본 생성자
	public PersonsVO() {
	}

	// 필드 생성자
	public PersonsVO(int id, String firstname, String lastname, int age, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Override
	public String toString() { 		// 객체형태를 문자형태로 변환해주는 것
		return "PersonsVO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", city=" + city + "]";
	}



	
}
