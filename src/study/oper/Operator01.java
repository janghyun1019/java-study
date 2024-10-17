package study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 산술
		System.out.println(1+1);
		System.out.println(9-4);
		System.out.println(3*1);
		System.out.println(7/3.0); //소숫점입력하면 double로 인식함
		System.out.printf("%.2f\n", 7/3.0); //소수 2번째까지 나타내라
		System.out.println(9%5);
		
		// 부호
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		
		System.out.println("===========================");
		
		// 증감연산자
		int x = 10;
		System.out.println(++x); // 앞에 ++붙으면 11 뒤에 붙으면 10
									// ++ 변수 +를 먼저    변수++ +를 나중에
		System.out.println(x--);	// 9
		System.out.println(x);		//9
		
		int y= 20;
		System.out.println( ++y ); 	// 21
		System.out.println( y );	// 21
		
		int z= 30;
		System.out.println( ++z ); 	// 31+1 => 31
		System.out.println( z );
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q; 	// 10 + ++q -> ++q가 먼저 연산됨 ++q는 2임 >> 12
		int r = 3 + w--;	// 3 + w-- -> w--는 나중에 연산됨 w--는 3임 >> 6
		
		System.out.printf("%d %d %d %d\n", q,w,e,r);
		
		boolean isFinished = false;
		System.out.println( !isFinished );
		System.out.println( isFinished );
		
		// isSleep  true false  !isSleep
		
		// 비교연산자
		System.out.println( 1 == 2 );
		System.out.println( 1 != 2 );
		System.out.println( 3 < 5 );
		System.out.println( 4 <= 4 );
		System.out.println( 5 > 10 );
		System.out.println( 9 >= 8 );
		boolean b1 = ( 9 >= 8 ); 
		
		System.out.println("===========================");
		
		// 논리연산자
		boolean b2 =  ( 10 > 6 ) && ( 10 > 5 );
		//				true 			true
		System.out.println(b2);
		
		boolean b3 = ( 5 != 1 ) || ( 10 <4 );
		// 				true			false
		
		boolean b4 = ( 2 >= 1 ) && !( 3 < 4 );
		System.out.println(b4);
		System.out.println(!b4);
		
		//대입
		int a = 30;
		
		a += 30;	// a = a + 30;
		a -= 5; 	// a = a - 5;
		a *= 3; 	// a = a * 3;
		a /= 2; 	// a = a / 2;
		a %= 4; 	// a = a % 4;
		
		System.out.println("===========================");
		
		// 삼항
		int point = -50;
		
		// 0 ~ 200 : 생수
		// 201 ~  : 커피

		String eventItem = ( point <= 200 ) ? "생수" : "커피" ;
		System.out.println(eventItem);
		
		eventItem = ( point > 200 ) ? "커피" : "생수" ;
		
		
		// 0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		// 301 ~  : 맥주
		
		//			   -50  > 200
		eventItem = ( point > 200 ) ? ( point > 300 ? "맥주" : "커피") : ( point  >=0 ? "생수" : "사은품없음") ;
									// 201~
		System.out.println(eventItem);
		
		eventItem = ( point > 200 ) ? ( ( point>=201 && point<=300) ? "맥주" : "커피") : "생수" ;
											// true		false
		System.out.println(eventItem);
		//eventItem = "맥주";
		
		// (point >=0 && point <= 200 )
		
	}

}
