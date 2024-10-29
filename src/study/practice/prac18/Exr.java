package study.practice.prac18;

public class Exr {
	String company;
	int madeYear;
	int inch;
	
	Exr(String company, int madeYear, int inch) {
		this.company = company;
		this.madeYear = madeYear;
		this.inch = inch;
	}
	
	void mytvInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf(" %s제품 %d년형 %d인치 TV ", company, madeYear, inch);
	}
	

}
