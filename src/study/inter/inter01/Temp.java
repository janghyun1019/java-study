package study.inter.inter01;

public interface Temp {
	
	static final int CODE = 30;  //인스턴프 멤버 변수가 아니다
	/* static final */int TYPE = 50;  // 상수 (항상 앞에 static final 이 있다)
	
	public abstract void method1();  //추상메소드
	public /*abstract*/ void method2(); // 보이진 않지만 abstract 가 있다 //추상메소드 메소드 선언부분만 작성
}
