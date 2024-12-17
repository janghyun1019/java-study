package study.cls.cls04;

public class IPad {


    // 클래스 필드 (static)
    static String madeBy = "Apple"; // 정적 멤버 변수 (제조사)
    String owner; //인스턴스 멤버 변수

    // 메서드
    public void powerOn() {
        System.out.println("iPad 전원을 켰습니다.");
    }

    // 정적 메서드
    static void check() {
        System.out.println("아이패드입니다.");
    }
}
