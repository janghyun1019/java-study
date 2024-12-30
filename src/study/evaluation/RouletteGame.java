package study.evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RouletteGame {

    private String machineId; // 기기 ID
    private String branchName; // 지점명
    private int totalPoints; // 총합 포인트
    private int successCount; // 성공 횟수
    private int failureCount; // 실패 횟수
    private int remainingAttempts; // 잔여 시도 횟수
    private int totalSales; // 총 매출액

    private List<SalesInfo> salesInfoList;

    public RouletteGame(String machineId, String branchName) {
        this.machineId = machineId;
        this.branchName = branchName;
        this.totalPoints = 0;
        this.successCount = 0;
        this.failureCount = 0;
        this.setRemainingAttempts(0);
        this.totalSales = 0;
        this.salesInfoList = new ArrayList<>();
    }

    public void recharge(int amount) {
        if (amount <= 0) {
            System.out.println("[안내] 잘못된 금액입니다. 0보다 큰 값을 입력하세요.");
            return;
        }
        if (getRemainingAttempts() > 0) {
            System.out.println("[안내] 남은 시도 횟수가 있는 동안에는 충전할 수 없습니다.");
            return;
        }
        if (amount % 1000 != 0) {
            System.out.println("[안내] 충전 금액은 1000원 단위로 입력해야 합니다.");
            return;
        }
        int newAttempts = amount / 500;
        this.setRemainingAttempts(this.getRemainingAttempts() + newAttempts);
        this.totalSales += amount;
        System.out.println("[충전 완료] 남은 시도 횟수: " + this.getRemainingAttempts());
    }

    public void startGame() {
        if (getRemainingAttempts() == 0) {
            System.out.println("[안내] 남은 시도 횟수가 없습니다. 충전 후 게임을 시작하세요.");
            return;
        }

        Random random = new Random();

        while (getRemainingAttempts() > 0) {
            int result = random.nextInt(6) + 1;
            if (result <= 4) {
                totalPoints += result;
                successCount++;
                System.out.println("[게임 결과] 성공! " + result + "점을 획득했습니다.");
            } else {
                failureCount++;
                System.out.println("[게임 결과] 실패. 꽝~ 다음 기회에 도전하세요.");
            }
            setRemainingAttempts(getRemainingAttempts() - 1);
            System.out.println("[남은 시도 횟수] " + getRemainingAttempts());
        }

        System.out.println("[게임 종료] 총 성공 횟수: " + successCount + ", 총 실패 횟수: " + failureCount);
        System.out.println("[총 점수] " + totalPoints);
        resetGame();
    }

    public void closeDay() {
        if (getRemainingAttempts() > 0) {
            System.out.println("[안내] 남은 시도 횟수가 있는 동안에는 마감할 수 없습니다.");
            return;
        }

        SalesInfo salesInfo = calculateSalesInfo();
        salesInfoList.add(salesInfo);

        System.out.println("[영업 마감] 총 매출액: " + totalSales);
    }

    private SalesInfo calculateSalesInfo() {
        int lostPointsValue = successCount * 500;
        int income = totalSales - lostPointsValue;

        System.out.println("[마감 정보]");
        System.out.println("기기 ID: " + machineId);
        System.out.println("지점명: " + branchName);
        System.out.println("총 매출액: " + totalSales);
        System.out.println("포인트 손실 금액: " + lostPointsValue);
        System.out.println("순수익: " + income);

        return new SalesInfo(machineId, branchName, totalSales, lostPointsValue, income);
    }

    private void resetGame() {
        this.totalPoints = 0;
        this.successCount = 0;
        this.failureCount = 0;
    }

	public int getRemainingAttempts() {
		return remainingAttempts;
	}

	public void setRemainingAttempts(int remainingAttempts) {
		this.remainingAttempts = remainingAttempts;
	}
}