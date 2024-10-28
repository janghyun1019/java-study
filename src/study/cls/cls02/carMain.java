package study.cls.cls02;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car1.color); //기본생성자값 null이 나옴
		
		car2.color = "파랑";
		System.out.println(car2.color);
		
		System.out.println(car3.color);
		System.out.println(car3.price);
		
		System.out.println("main 끝");
		
		int num = 10;
		
		Car car4 = new Car("모닝");
		System.out.println(car4.model);
		System.out.println(car4.color);
		
		//String 타입의 매개변수가 2개 필요하다
		Car car5 = new Car("캐스퍼", "회색");
		System.out.println(car5.model);
		System.out.println(car5.color);
		
	}

}
