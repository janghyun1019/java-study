package study.practice.prac28.v1;

public class Tank extends Unit { // 탱크
	int x, y; // 현재 위치

	public void move(int x, int y) {
        System.out.println("Tank 지정된 위치 (" + x + ", " + y + ") on wheels.");
        this.x = x;
        this.y = y;
    }

	// 지정된 위치로 이동

	public void stop() {
		System.out.println("Tank 정지."); }

	// 현재 위치에 정지

	public void changeMode() {
        System.out.println("Tank 공격모드를 변환한다.");
    }

	// 공격모드를 변환한다
}
