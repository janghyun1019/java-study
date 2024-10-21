package study.iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지금은 단순 반복을 하기위한 코드
		
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		
		for ( int i=1; i<10; i++ ) {
			System.out.println("화요일");
		}
		
		int i = 3;
		
		for ( i=35; i<45; i++ ) {
			// 35 36 37 38 39 40 41 42 43 44
			System.out.println("수요일");
			
		}
		
		for ( int j=1; j<=5; j++ ) {
			System.out.println("오늘은 java 공부 " + j + "일차");
		}
		
		// 10 20 30 40 50 ... 100
		// 10 30 90 150 <-??어떤식으로 증감하는지 알아야함
		
				
		// 10~100 까지 10단위 합
		// 10 + 20 + 30 + 40 ... 100
		int sum = 0; // 덧셈연산할때 아무런 영향을 주지 않는 0으로 초기화 0+0 +0+0+0
		
		for ( int n=10; n<=100; n=n+10 ) {
			sum = sum + n;
			//			+10
			//			+20
			
		}
		System.out.println("10~100까지(10단위) 합 :" + sum);
		
		// n: 1   2  3  4  5  6  7  8  9  10
		//    10 20 30 40 50 60 70 80 90 100
		
		
		// sum : 550 + 550 = 1100
		sum = 0; // 변수 초기화를 해줘야 함
		for ( int n=1; n<=10; n++ ) {
			sum = sum + (n*10);
		}
		System.out.println("10~100까지(10단위) 합 :" + sum);
		
		
		for (int k=2; k<20; k=k*2) {
			// k : 2 4 8 16
		}
		for (int k=400; k<100; k=k-50) {
			// k : 400 350 300 250 200 150    | 100
		}
		for (int k=100; k>=90; k--) {
			// k : 100 99 98 97 96 ... 91 90  | 89
		}
		
		
		
		
		

	}

}
