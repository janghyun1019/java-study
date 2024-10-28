package study.practice.parc16;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor m1 = new Monitor(65, "삼성", "더프레임");
		Monitor m2 = new Monitor(80, "LG", "올레드");
		
		System.out.println("[모니터정보] 제조사:" + m1.company + " 모델명:" + m1.model + " 인치:" + m1.inch);
		System.out.println("[모니터정보] 제조사:" + m2.company + " 모델명:" + m2.model + " 인치:" + m2.inch);
		
		m1.printInfo();
		m2.printInfo();
		
  		
	}

}
