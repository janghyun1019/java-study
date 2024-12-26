package study.practice.prac28.v1;

//공통 기능을 가진 Unit 클래스 정의
public abstract class Unit {
	int x, y; // 현재 위치

	// 이동 메서드는 서브클래스에서 정의
	public abstract void move(int x, int y);

	// 멈추는 동작은 모든 클래스에서 동일
	public void stop() {
		System.out.println("Unit stops at current position: (" + x + ", " + y + ")");
	}
}