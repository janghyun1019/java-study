package study.inherit.inherit05;

public class NexenTire extends Tire {
	
	//2.
	//오른쪽 뒷바퀴 타이어는 터지면 넥센타이어로 교체하기. (넥센타이어 생성)
	//최대수명횟수는 자유롭게~ 1000 ~
	
	//필드
	//생성자
	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " NexenTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " NexenTire 펑크 ***");
			return false;
		}
	}
}

