package study.practice.parc16;

public class Monitor {
	
	// 필드
	int inch;
	String company;
	String model;
		
	// 생성자
	Monitor(int inch, String company, String model) {
		this.inch = inch;
		this.company = company;
		this.model = model;
		
	}
	
	//메소드(동작/기능)
	void printInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf("[모니터정보] 제조사:%s 모델명:%s 인치:%d\n", company, model, inch);
	}
	

}
