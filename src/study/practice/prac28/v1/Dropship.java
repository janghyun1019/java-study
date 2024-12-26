package study.practice.prac28.v1;

public class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치
	
	@Override
	public void move(int x, int y) {
        System.out.println("Dropship 지정된 위치로 (" + x + ", " + y + ") by flying.");
        this.x = x;
        this.y = y;
    }
	// 지정된 위치로 이동
	
	public void stop() {
		System.out.println("Dropship 정지."); } 
	// 현재 위치에 정지
	
	public void load() {
        System.out.println("Dropship 선택된 대상을 태운다.");
    }
	// 선택된 대상을 태운다
	
	public void unload() {
        System.out.println("Dropship 선택된 대상을 내린다.");
    }
	// 선택된 대상을 내린다
}