package study.cls.cls02;

public class Car {
	
	//필드 변수
	String model;
	String color;
	int price;
	
	//생성자
	//기본생성자
	Car(){ //객체 생성후 초기에 해야할 일 / 필드의 초기화(필드변수에 저장할 값 세팅)
		System.out.println("Car 생성자 호출됨");
		color = "노랑";
	}
	
	// 변수타입이 중요하다
	Car(String _model) {
		System.out.println("매개변수 생성자 호출");
		model = _model;
	}
	
	// 매개변수는 타입만 인식
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	} //this.을 붙여주면 필드변수를 가르킨다
	
	// new Car ("검정", 150)
	Car(String color, int price) {
		this.color = color;
	}
	
	// new Car (150, "검정")
	Car(int price, String color) {
		this.color = color;
	}

}
