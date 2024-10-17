package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
		// 줄바꿈
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		// 줄바꿈 없음
		
		int hour = 10;
		int minute = 26;
		
		//현재 10시 26분 입니다.
		System.out.println("현재" + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute);
		
		double rate = 1.15512;
		
		System.out.printf( "%10.2f %%", rate );
		
		System.out.println(); //출력내용 없는데... 줄바꿈
		
		Scanner scanner = new Scanner(System.in);
		
				
		//실행 후 입력
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine();  // "아무거나입력"
		System.out.println(input);
		
		// "12333" -> int
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n", input);
		
		System.out.print("정수를 입력하세요 : ");
		int point = scanner.nextInt();
		//sxanner.nextDouble();
		//String -> int
		System.out.println(point);
		
		
		
	}

}
