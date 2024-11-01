package study.jhtest;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int hitCnt = 0; // 안타 수
		int outCnt = 0; // 아웃 수
		int totalRound = 3; // 총횟수

		System.out.println("★★★ 1단계 게임을 시작합니다 ★★★");

		// 총횟수만큼만 게임 진행
		for (int i = 1; i <= totalRound; i++) {
			System.out.printf("▷▷%d회차\n", i);
//            System.out.println();

			while (true) {
				int pitchBall = (int) (Math.random() * 10) + 1; // 투수가 던지는 랜덤 공

				System.out.print("▶▶ 공을 던져주세요 : ");
				int playerBall = scanner.nextInt(); // 플레이어가 입력한 공

				// 입력한 공이 1~10을 벗어나면
				if (playerBall < 1 || playerBall > 10) {
					System.out.println("*공은 1~10까지 던질 수 있습니다.*");
				} else { // 1~10 사이로 잘 입력했으면

					// 투수공과 플레이어공이 같은면 안타수 증가
					if (pitchBall == playerBall) {
						hitCnt++;
					} else { // 다르면 아웃수 증가
						outCnt++;
					}

					System.out.printf("%d번투수 %d번타자 %d안타 %d아웃\n", pitchBall, playerBall, hitCnt, outCnt);
	                System.out.println();

					// 아웃 3번이 되면 반복문 종료
					if (outCnt == 3) {
						System.out.printf("▶▶▶ %d회차를 종료합니다 ◀◀◀\n", i);
						break;
					}
				}
			}
			outCnt = 0; // 다음 회차 시작 전에 안타수 초기화
		}
		System.out.println("▷▷▷ 게임을 종료합니다 ◁◁◁");
	}
		
	

}
