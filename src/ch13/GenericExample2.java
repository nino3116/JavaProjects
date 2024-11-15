package ch13;

public class GenericExample2 {

	public static void main(String[] args) {
		// 선언부 타입이 여러개인 경우...
		
		// Product 객체 생성... K를 Tv, M은 String
		Product<Tv, String> product1 = new Product<>();
		
		// Setter 매개값 전달...
		product1.setKind(new Tv());		// generic으로 지정된 값으로 처리
		product1.setModel("스마트 TV");
		
		// getter 리턴값은 Tv, String
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println(tv);
		System.out.println(tvModel);
		// ----------------------------------------------------------
		
		Product<Car, String> product2 = new Product<>(new Car(), "SUV자동차");
		
		// Getter 리턴 값은  Car. String
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		System.out.println(car);
		System.out.println(carmodel);
	}

}


class Product<K, M> {
	// 필드생성
	
	private K kind;
	private M model;
	
	
	// 생성자
	public Product() {}
	public Product(K kind, M model) {
		this.kind = kind;
		this.model = model;
	}
	
	// 메서드	
	public K getKind() {return kind;}
	public void setKind(K kind) {this.kind = kind;}
	public M getModel() {return model;}
	public void setModel(M model) {this.model = model;}
	
}

class Car {}

class Tv {}



