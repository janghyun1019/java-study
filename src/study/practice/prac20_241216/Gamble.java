package study.practice.prac20_241216;

public class Gamble {

    public static void main(String[] args) {
        // 주사위를 3번 굴려 나온 값의 합 계산
        double dollar = dice() + dice() + dice();
        // 환율을 적용하여 원화로 변환
        double won = exchange(dollar);
        // 결과 출력
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
    }

    // 주사위 굴리기: 1~6 사이의 정수 반환
    public static int dice() {
        return (int)(Math.random() * 6) + 1;
    }

    // 환전하기: 달러를 원화로 변환
    public static double exchange(double dollar) {
        double exchangeRate = 1300.0; // 환율: 1달러 = 1300원
        return dollar * exchangeRate;
    }
}
