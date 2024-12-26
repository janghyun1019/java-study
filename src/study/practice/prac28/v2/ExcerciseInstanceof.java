package study.practice.prac28.v2;

//basecode
class ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
		// action(DenceRobot)  액션이라는 메소드를 불러야한다
		// action(SingRobot)
		// action(DrawRobot)
		
	} // main

	private static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			((DanceRobot)robot).dance();
		}
		if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();		
		}
		if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}
	}
	
//	private static void action(Robot[] robot) {
//		//for
//	}
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}