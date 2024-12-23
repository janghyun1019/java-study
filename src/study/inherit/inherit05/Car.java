package study.inherit.inherit05;

import java.util.ArrayList;

public class Car {
	// 필드
	
	//5.
	//타이어의 위치를 1 2 3 4 숫자 그대로 사용하지말고,
	// 해당 위치를 나타내는 상수형 변수를 생성해서 활용해보세요.
	//예) 오른쪽 앞 바퀴를 의미하는 상수형 변수의 값이 = 1 이라던가...
	public static final int FRONT_LEFT_TIRE = 0;
	public static final int FRONT_RIGHT_TIRE = 1;
	public static final int BACK_LEFT_TIRE = 2;
	public static final int BACK_RIGHT_TIRE = 3;
	
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//4.
	//자동차 타이어가 각각의 변수로 관리되는 중입니다.
	//4개 짜리의 배열로 변경하기. ( 단순[] 배열 or ArrayList 택 1)
	Tire[] tireArr;
	ArrayList<Tire> tireList;
	
	
	//3.
	//현재 자동차는 타이어가 정해진 채로 만들어집니다.
	//생성시에 타이어를 원하는데로 세팅해서 만들어질수있도록 변경.
	// 생성자
	public Car(Tire frontLeftTire, Tire frontRightTire, Tire backLeftTire, Tire backRightTire) {
		
		//4.
		//자동차 타이어가 각각의 변수로 관리되는 중입니다.
		//4개 짜리의 배열로 변경하기. ( 단순[] 배열 or ArrayList 택 1)
		tireArr = new Tire[4];
		tireList = new ArrayList<Tire>();
		
		//5.
		//타이어의 위치를 1 2 3 4 숫자 그대로 사용하지말고,
		// 해당 위치를 나타내는 상수형 변수를 생성해서 활용해보세요.
		//예) 오른쪽 앞 바퀴를 의미하는 상수형 변수의 값이 = 1 이라던가...
		tireArr[FRONT_LEFT_TIRE] = frontLeftTire;
		tireArr[FRONT_RIGHT_TIRE] = frontRightTire;
		tireArr[BACK_LEFT_TIRE] = backLeftTire;		
		tireArr[BACK_RIGHT_TIRE] = backRightTire;
		
		tireList.add(frontLeftTire);
		tireList.add(frontRightTire);
		tireList.add(backLeftTire);
		tireList.add(backRightTire);		
		
		
		this.frontLeftTire = frontLeftTire;
		this.frontRightTire = frontRightTire;
		this.backLeftTire = backLeftTire;
		this.backRightTire = backRightTire;
	}

	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		//if (frontLeftTire.roll() == false) {
		if ( tireArr[FRONT_LEFT_TIRE].roll() == false) {
		//if (tireArr.get(0).roll() == false) {	
			stop();
			return FRONT_LEFT_TIRE;			//0
		}
		;
		if ( tireArr[FRONT_RIGHT_TIRE].roll() == false) {
			stop();
			return FRONT_RIGHT_TIRE;		//1
		}
		;
		if ( tireArr[BACK_LEFT_TIRE].roll() == false) {
			stop();
			return BACK_LEFT_TIRE;			//2
		}
		;
		if ( tireArr[BACK_RIGHT_TIRE].roll() == false) {
			stop();
			return BACK_RIGHT_TIRE;			//3
		}
		;
		return 10;  //정상
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
