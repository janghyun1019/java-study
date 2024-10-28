package study.cls.cls03;

public class Calc {
	
	//필드
	
	//생성자
	
	//메소드
	
	//리턴   		o/x
	//매개변수		o/x
	
	//리턴X 매개변수X
	void powerOn() {
		System.out.println("전원 On");
	}
	
	//리턴X 매개변수O
	void setOwner(String name) {
		System.out.println(name + "님의 계산기입니다.");
	}
	
	//리턴O 매개변수O
	double divide(int x, int y) {
		
		//return 타입이 double
		
//		if(x > 0) {
//			return; //리턴을 만나는순간 끝
//		}
		
		
		
		double result = (double)x/y;
		
		return result;
	}
	
	//리턴X 매개변수O
	String madeByInfo() {
		
		String msg = "카시오";
		
		return "카시오";
		
	}
	

}
