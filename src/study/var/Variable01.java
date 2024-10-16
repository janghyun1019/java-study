package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;	// 정수형 숫자 변수
		int floor;	//선언만 함 값이 없음
		
		int x, y, z;
		
		int score; // 선언
		int point = 50; // 선언 + 값 저장 = 초기화
		
		score = 90;
		
		// level = 99; 선언하지 않은 변수명 사용 불가능

		// time = 16; 변수 선언 이전에는 사용블가능, 변수 선언 한 후에 사용가능 
		int time;
		time = 16;
		
		int minute = time + 9;
					// 16 + 9
		
		// int myFloor = floor +7; 값이 없는 변수를 계산 할 수 없다
		
		int totalScore = point + point + score + score; //여러번사용가능
		
		System.out.println("출력합니다.");
		System.out.println("최종점수 : " + totalScore);
		System.out.println( totalScore ); //sysout -> Ctrl + Space
		System.out.println( totalScore + point );
							// 330     +50 = 380
		
		System.out.println( totalScore ); //330
		totalScore = totalScore + point; //380
		//totalScore = 330 +      50
		System.out.println( totalScore ); //380
		
		x = 10; //명확하게 의미를 가진것이 리터럴
		y = x;
		z = x + y;
		
		int a = 10;
		int b = 20;
		
		// a : 10 , b : 20
		// a : 20 , b : 10
		
		/* 서로 값 바꾸기 실패
		a = b;
		b = a;
		*/
		
		int c = a; //a:10 b:20 c:10
		
		a = b;	// a:20 b:20
		b = c;  // a:20 b:10 c:10
		
		
		
		
		
		
		
	}

}
