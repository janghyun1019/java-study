package study.practice.prac19;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		야구 게임 (스크린 야구, 공격만)

		스크린 야구 게임을 제작하려고 합니다.
		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)

		- 기본 문제
		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
		사용자의 입력도 1 ~10까지 이며,
		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
		해당 게임은 3아웃이면 종료됩니다.
		
		- 레벨 1
		1회부터 3회까지만 진행합니다.
		각 회는 3아웃 마다 회가 넘어가며, 회가 시작 할 때마다 0아웃으로 시작합니다.
		
		*/
		
		// 투수가 던진공 (1~10)
		int pitcherBall = (int)(Math.random()*10)+1;
		
		// 사용자 입력 (1~10)
		Scanner scanner = new Scanner(System.in);
		
		int outCount = 0; // 아웃갯수
		
		// round : 회차를 의미
		for(int round=1; round<=3; round++) { //1회 부터 3회차까지 게임진행
			
			System.out.println("==== " + round + "회차 게임 시작 ====");
			outCount = 0; // 회차 시작시 아웃갯수 0으로 초기화

			while(true) {
				
				System.out.println("타자 입력(1~10) : ");
				int playerBall = scanner.nextInt();
				
				System.out.printf("투수:%d 플레이어:%d \n", pitcherBall, playerBall);
				
				// 안타 or 아웃
				// 투수공 == 사용자입력 (안타) else 아웃
				if(pitcherBall == playerBall) { //안타
					System.out.println("안타!");
				} else {
					outCount++;
					System.out.println("아웃!");
				}
				
				//아웃이 3개면 게임 종료
				if(outCount == 3) {
					System.out.println("==== " + round + "회차 게임종료 ====");
					break;
				}
			
			}//while문 종료
			
		} //for문 종료
		System.out.println("==== 게임종료 ====");
		

	}

}
