package study.exp;

import java.util.List;

public class Exp03 {

	public static void main(String[] args) { //
		Sample s = new Sample();
		
		try {
			s.addItem1("하나");
		} catch (Exception e) {
			System.out.println("main에서 하나 예외처리");
		} 
		
		try {
			s.addItem2("둘");
		} catch (Exception e) {
			System.out.println("main에서 둘 예외처리");
		}
		
//		s.addItem1("1");
//		s.addItem2("2");
		
		try {
			s.addItem3("3");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main에서 addItem3 호출 후 예외처리");
		}
		
		try {
			s.addItem1("4"); //실행예외
		} catch (NullPointerException e) {
			
		}
		
		//s.addItem3("5");
		
		s.addItem2("저장");
		System.out.println(s.list.get(0));
		System.out.println(s.list.get(1));
		
		try {
			s.addItem5("55");
		} catch (Exception e) {
			System.out.println("main에서 addItem5에 throw e 처리");
		}
	}

}

class Sample {
	List<String> list;
	
	void addItem1(String s) {
		list.add(s);
	}
	
	void addItem2(String s) {
		
		try {
			list.add(s);  //예외발생
		} catch (Exception e) {
			System.out.println("Sample addItem2에서 예외서 처리");
		} //예외 안난것처럼 처리해야지~
	}
	
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	
	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}
	
//	void addItem4(String s) throws ClassNotFoundException {
//		list.add(s);
//	}
	
	void addItem5(String s) throws Exception { //내가 직접 Exception 을 알리는거
		
		try {
			//list.add(s);  //예외발생
			list.get(10);
		} catch (Exception e) {
			System.out.println("Sample addItem5에서 예외서 처리");
			
			//예외를 발생시킨다 직접 전달
			throw e;
		} 
	}
}






