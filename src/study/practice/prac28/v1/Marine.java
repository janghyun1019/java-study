package study.practice.prac28.v1;

//base code
public class Marine extends Unit { // 보병
	int x, y; // 현재 위치

	public void move(int x, int y) {
        System.out.println("Marine 지정된 위치로 (" + x + ", " + y + ") by walking.");
        this.x = x;
        this.y = y;
    }
	// 지정된 위치로 이동

	public void stop() {
		System.out.println("Marine 정지."); }

	// 현재 위치에 정지

	public void stimPack() {
        System.out.println("Marine 스팀팩을 사용한다.");
    }

	// 스팀팩을 사용한다
}
