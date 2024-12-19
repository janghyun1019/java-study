package study.practice.prac23_241219;

public class Computer {
	
	/*
		 //3.
		다음을 만족하는 클래스 Computer를 작성하시오.
		· 다음을 상수 필드로 선언
		public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
		· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
		자와 메소드 구현
		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
		운영체제: 윈도우10, 메인메모리: 16
		운영체제: 애플 OS X, 메인메모리: 32
		운영체제: 안드로이드, 메인메모리: 16
	 */
	
	//정적 static
	//상수 final -> static final -> 상수인 경우 -> 모두 대문자로 표기
	
	//상수는 한번 만들어지면 변경 되면 안된다
	
	//public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	
	int osIndex;
	// String os;
	int memory;
	
	//생성자
	public Computer(int osIndex, int memory) {
		this.osIndex = osIndex;
		// this.os = OS_TYPE[osIndex];
		this.memory = memory;
	}
	
	public void print() {
		System.out.println("운영체제: " + OS_TYPE[osIndex] + " 메인메모리: " + memory);
		// System.out.println("운영체제: " + os + " 메인메모리: " + memory);
	}
	
	/*
    // 상수 필드 선언
    public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};

    // 인스턴스 필드 선언
    private String operatingSystem;
    private int mainMemory;

    // 생성자
    public Computer(int osIndex, int mainMemory) {
        if (osIndex >= 0 && osIndex < osType.length) {
            this.operatingSystem = osType[osIndex];
        } else {
            this.operatingSystem = "Unknown OS";
        }
        this.mainMemory = mainMemory;
    }

    // 출력 메서드
    public void print() {
        System.out.println("운영체제: " + operatingSystem + ", 메인메모리: " + mainMemory);
    }

    public static void main(String[] args) {
        // Computer 객체 생성
        Computer pc = new Computer(0, 16);
        Computer apple = new Computer(1, 32);
        Computer galaxy = new Computer(2, 16);

        // 정보 출력
        pc.print();
        apple.print();
        galaxy.print();
    }
    */
}