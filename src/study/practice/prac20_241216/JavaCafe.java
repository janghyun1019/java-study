package study.practice.prac20_241216;

public class JavaCafe {

    public static void main(String[] args) {
        // 주급 계산 호출
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);
    }

    // 시급과 일한 시간을 입력받아 주급을 계산하고 출력
    public static void printPay(double basePay, int hours) {
        double pay = 0.0;

        // 시급 검증
        if (basePay < 8.00) {
            System.out.println("Error: 최저 시급 에러!");
            return;
        }

        // 근무 시간 검증
        if (hours > 60) {
            System.out.println("Error: 초과 근무시간 에러!");
            return;
        }

        // 주급 계산
        if (hours <= 40) {
            pay = basePay * hours;
        } else {
            int overtimeHours = hours - 40;
            pay = (basePay * 40) + (basePay * 1.5 * overtimeHours);
        }

        // 결과 출력
        System.out.printf("$ %.2f\n", pay);
    }
}
