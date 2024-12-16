package study.practice.prac241216;

public class Elevator {

    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 10;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘리베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘리베이터\n", c, guide(c));
    }

    public static String guide(int floor) {
        // 메소드를 완성
        if (floor >= 1 && floor <= 4) {
            return "A";
        } else if (floor >= 5 && floor <= 8) {
            return "B";
        } else if (floor >= 9) {
            return "C";
        } else {
            return "유효하지 않은 층";
        }
    }
}
