package study.inherit.inherit05;

public class CarExample {
	public static void main(String[] args) {
		//3.
		//현재 자동차는 타이어가 정해진 채로 만들어집니다.
		//생성시에 타이어를 원하는데로 세팅해서 만들어질수있도록 변경.
		//내가 원하는 형태로 셋팅해서 사용하겠다
		Tire t1 = new HankookTire("앞왼쪽", 15);
		Tire t2 = new HankookTire("앞오른쪽", 15);
		Tire t3 = new HankookTire("뒤왼쪽", 15);
		Tire t4 = new HankookTire("뒤오른쪽", 15);
		Car car = new Car(t1, t2, t3, t4);
		
		//Car car = new Car();		
		
		//1.
		//달리는 횟수가 현재 5바퀴만 돌아갑니다. 10번 돌아가도록 수정하세요.		
		for(int i=1; i<=10; i++) {
			int problemLocation = car.run();
			// 1 2 3 4 : 0 정상
			// 0 1 2 3 : 10 정상
			switch(problemLocation) {
			//5.
			//타이어의 위치를 1 2 3 4 숫자 그대로 사용하지말고,
			// 해당 위치를 나타내는 상수형 변수를 생성해서 활용해보세요.
			//예) 오른쪽 앞 바퀴를 의미하는 상수형 변수의 값이 = 1 이라던가...
				case Car.FRONT_LEFT_TIRE:
					System.out.println("앞왼쪽 HankookTire로 교체");
					//car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15);
					break;
				case Car.FRONT_RIGHT_TIRE:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);	
					break;
				case Car.BACK_LEFT_TIRE:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);	
					break;
				//2.
				//오른쪽 뒷바퀴 타이어는 터지면 넥센타이어로 교체하기. (넥센타이어 생성)	
				case Car.BACK_RIGHT_TIRE:
					System.out.println("뒤오른쪽 NexenTire로 교체");
					car.tireArr[Car.BACK_RIGHT_TIRE] = new KumhoTire("뒤오른쪽", 25);		
					break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
