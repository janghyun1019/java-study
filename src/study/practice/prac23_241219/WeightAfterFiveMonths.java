package study.practice.prac23_241219;

import java.util.Scanner;

public class WeightAfterFiveMonths {

    public static void main(String[] args) {
        // 입력값 받기
        Scanner scan = new Scanner(System.in);
        System.out.print("현재 몸무게와 n개월 수를 입력하세요 (예: 72.4 5): ");
        double start = scan.nextDouble();
        int after = scan.nextInt();
        scan.close();

        // 계산
        double result = weight(start, after);

        // 결과 출력
        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg", after, result);
    }

    // 시작 몸무게와 n개월 후 값을 입력받아 예상 몸무게를 반환
    public static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        
        // expectedWeight = currentWeight + (0.23 * months);
        
        // 5달 5번 0~4 1~5
        // 10달   0~9 1~10
        for (int i = 0; i < months; i++) {
            expectedWeight += 0.231; // 매달 0.231kg 증가
        }
        return expectedWeight;
    }
}