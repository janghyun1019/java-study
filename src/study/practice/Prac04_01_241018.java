package study.practice;

import java.util.Scanner;

public class Prac04_01_241018 {

	public static void main(String args []) {
		
		System.out.println("----------1번----------");
		
		Scanner triAngle = new Scanner(System.in);
		
		System.out.println("삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요.");
        
		System.out.print("밑변:");
		double a = triAngle.nextDouble();
        
		System.out.print("높이:");
		double b = triAngle.nextDouble();
        
		System.out.print("삼각형의 넓이는 " + (a * b / 2) + "입니다.");
		
		System.out.println();
		System.out.println();
		System.out.println("----------2번----------");
		
		Scanner traPeZoid = new Scanner(System.in);
		
		System.out.println("사다리꼴의 밑변과 높이를 입력받아서 넓이를 출력하세요.");
        
		System.out.print("윗변 길이:");
		double c = traPeZoid.nextDouble();
		
		System.out.print("밑변 길이:");
		double d = traPeZoid.nextDouble();
        
		System.out.print("높이:");
		double e = traPeZoid.nextDouble();
        
		System.out.print("사다리꼴의 넓이는 " + (((c + d) * e) / 2 ) + "입니다.");
		
		System.out.println();
		System.out.println();
		System.out.println("----------3번----------");
		
		int student = 24;
		int snack = 100;
		int result1 = snack / student;
		int result2 = snack % student;
		System.out.println("한명당 과자 갯수 : " + result1);
		System.out.println("남는 과자 갯수 : " + result2);
		System.out.printf("남는 과자는 %d개 입니다.", result2);
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------4번----------");
		
		
		Scanner threeInteger = new Scanner(System.in);
		System.out.print("세자리의 정수를 입력하세요 : ");
		int num1 = threeInteger.nextInt();
		System.out.printf("백의자리 : %d\n", num1/100);
		System.out.printf("십의자리 : %d\n", (num1 % 100) / 10);
		System.out.printf("일의자리 : %d\n", (num1 % 100) % 10);
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------5번----------");
		

		int x = 10, y = 20; 
		
		int temp = x; 		// x의 값을 temp에 저장
		x = y; 				// y의 값을 x에 저장
		y = temp; 			// x의 값을 y에 저장
		System.out.println("x = " + x); // 화면에 x = 5  이 출력
		System.out.println("y = " + y); // 화면에 y = 10 이 출력
		
		
		
		
	}
}
