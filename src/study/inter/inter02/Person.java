package study.inter.inter02;

public class Person {
	
	// Phone p; 부모가 있다면 사용가능
	// GalaxyPhone gp;
	// IPhone ip;
	
	Callable callPhone; //new GalaxyPhone() new IPhone() 둘다 담을수 있다
	
	public void call(String phoneNumber) {
		// phoneNumber 쪽 전화번호로 전화를 걸자!
		callPhone.call(); // 다형성을 유지할수 있다
	}
}
