package study.evaluation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[안내] 기기ID를 입력하세요: ");
        String machineId = scanner.nextLine();
        System.out.print("[안내] 지점명을 입력하세요: ");
        String branchName = scanner.nextLine();

        RouletteGame game = new RouletteGame(machineId, branchName);

        while (true) {
            System.out.println("\n[메뉴] 1. 충전  2. 게임 시작  3. 영업 마감");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (game.getRemainingAttempts() > 0) {
                        System.out.println("[안내] 충전된 횟수가 남아 있어 추가 충전이 불가능합니다.");
                        break;
                    }
                    System.out.println("[안내] 충전 금액을 입력하세요 (1000원 단위): ");
                    int amount = scanner.nextInt();
                    game.recharge(amount);
                    break;
                case 2:
                    game.startGame();
                    break;
                case 3:
                    if (game.getRemainingAttempts() > 0) {
                        System.out.println("[안내] 충전된 횟수가 남아 있어 영업 마감이 불가능합니다.");
                        break;
                    }
                    game.closeDay();
                    return;
                default:
                    System.out.println("[안내] 잘못된 선택입니다. 1~3 안에서 다시 선택하세요.");
            }
        }
    }
}
