package study.cls.cls05.pack1;

public class Cup {
	
	private String type; // 나만 가지고 있겠다
	
	private Cup() {
		
	}
	public Cup(String type) {
		this.type = type;
	}
	
	public void method() {
		System.out.println("pack1.Cup method() 111");
	}

}

