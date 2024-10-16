package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 3.14;
		double d2 = d1;
		
		int i1 = 30;
		int i2 = i1;
		
		i2 = (int)d2;	 // int=double
					 // i2 = (int)3.14;
					// i2 = 3;
		
		System.out.println(i2);
		
		// double -> int 변환 소수점이 사라진다.
		
		//java 정수 -> int 인식
		//java 실수 -> double 인식
		
		float f1 = 4.43f;
		double d3 = f1; // double =float
		
		double d4 = 300; //double = 정수형숫자(int) 자동타입변환
		// 300.0
		System.out.println(d4);
		
		// 연산에서 형변환

		int intValue = 10;
		double doubleValue = 5.5;
		
		// 잘못된 케이스 >> int result = intValue + doubleValue;
					// int + double -> double
		// int = double
		
		int result = intValue + (int)doubleValue;
		// int     = int      + (int)double     (int)5.5 -> 5
		// int     = int      + 5
		
		result = (int)(intValue + doubleValue);
		//			int 10 + double 5.5 _> double 15.5
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2; // 형변환시 데이터 손실됨
		//			  5          6 처음부터 소숫점 날리고 계산 
		System.out.println(rt);
		
		rt = (int)(dv1 + dv2);
		// 연산 후 소숫점 날림 그래서 12.1이었던것이 12가 나옴
		System.out.println(rt);
		
	}

}
