package study.practice;

import java.util.Scanner;

public class Prac12_241023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.
		2x + 4y = 10 이 만족하는
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)
		*/
		
		for(int x=1; x<=10; x++) {
			for(int y=1;y<=10;y++) {
				if(2*x+4*y == 10) {
					System.out.println("x=" + x + ", y=" + y);
//					System.out.printf("(x:%d y:%d)\n", x, y);  //선생님풀이
				}
			}
		}
		
		System.out.println(); // 열 
		
		/*
		2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 첫번째입력: ");
		int data1 = scanner.nextInt();
		System.out.println("정수 두번째입력: ");
		int data2 = scanner.nextInt();
		// 두수 중 크면 큰수
		// 두수 중 작으면 작은수
		if (data1>data2) {
			System.out.println("큰수" + "-" + "작은수");
		} else {
			System.out.println("작은수" + "-" + "큰수");
		} 
				
		System.out.println(); // 열 		
		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		ex) 입력 0 0 1 0
		결과 도
		입력 0 1 0 1
		결과 개
		*/
		
		System.out.print("윷 4개(0과 1 중에 하나씩 4번)입력하세요 : ");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		int input3 = scanner.nextInt();
		int input4 = scanner.nextInt();
			if (input1 + input2 + input3 + input4 == 1) {
				System.out.println("결과 : 도");
			} else if (input1 + input2 + input3 + input4 == 2) {
				System.out.println("결과 : 개");
			} else if (input1 + input2 + input3 + input4 == 3) {
				System.out.println("결과 : 걸");
			} else if (input1 + input2 + input3 + input4 == 4) {
				System.out.println("결과 : 윷");
			} else if (input1 + input2 + input3 + input4 == 0) {
		    	System.out.println("결과 : 모");
		    } else {
		    	System.out.println("잘못입력했습니다.");
		    }
				
		System.out.println(); // 열 
		/*
		4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****
		*/
		System.out.println("정수를 입력해 주세요");
	     int numAll =  scanner.nextInt();
	     
	     System.out.println(numAll);
	     for(int i=1; i<=numAll; i++) {
	    	 System.out.print("*");
	     }
	
		

	}

}
