package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2 = 0b10;	//2
		int num8 = 012;		//10
		int num10 = 10;		//10
		int num16 = 0x30;	//48
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x0123;
		
		char var4 = 'D'; //'AD' x  "Q" x
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴"; // 여러개의 문자를 사용 할 수 있음
		String subMenu ="12313"; 		// 12313; 숫자X 큰따옴표로 감싸야함
		
		System.out.println(menu);
		System.out.println(subMenu);
		
		System.out.println(var2 + 10);
		System.out.println(num16 + 20);
		
		System.out.println(menu + var2);
		System.out.println(subMenu + 500);
		
		String msg = " \"안녕\" 하세요";
		System.out.println(msg);		
		
		
		double d1 =12.12; 
		double d2 = 0.1212e2;
		float f1 = 12.12f;
		
		boolean stop = false;
		boolean open = true;
		boolean close = false;
		
	}
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
// 각자 지역안에서만 사용가능함		
	}
	
	public static void main3(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void main4(String[] args) {
		// TODO Auto-generated method stub

	}

}
