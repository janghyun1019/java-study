package study.practice.prac21_241217;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.setColor("검은색");
		
		Monitor m2 = new Monitor("LG", 32, 330000);  
		// 7. 두 개의 모니터를 생성합니다. -> main 에서 객체 생성 new Monitor

		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		// 8. 모니터의 색상과 해상도가 결정되었습니다. -> 해상도값 저장 4번 생성한 set메소드 활용
		// 1) 1080 * 780
		// 2) 흰색, 4096 * 2048
		
		
		m1.printInfo();
		m2.printInfo();
		// 10. 1), 2) 모니터의 정보를 출력합니다. -> 9번활용 출력
		
		
		int returnPrice = m2.addPrice(70000); //7만 인상
		System.out.println("인상된 금액:" + returnPrice);
		//11. 2) 의 가격이 7만원 인상시키고, 그 결과 총금액을 받아서 출력합니다.-> 6번,9번 메소드활용 (9번은...밑에 12번에서 출력을 다시 하니까...6번만해도..되겠군요)
		
		m1.printInfo();
		m2.printInfo();
		// 12. 1), 2)에 해당하는 정보를 다시 출력합니다. -> 9번활용 출력
	}

}
