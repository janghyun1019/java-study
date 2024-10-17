package study.practice;

public class Prac02_241017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
	___result = ___x/y;
	System.out.println(result);
	
	1) 결과가 2가 나오도록 작성하세요
	2) 결과가 2.5가 나오도록 작성하세요
	*/
	// 1)
		int x = 10;
		int y = 4;
		int result = (int) x/y;
		// 선생님풀이 
		//	int result = x/y;
		System.out.println(result);
		
	// 2)
		double result1 = (double) x/y;
		System.out.println(result1);
		
		
	/*
	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result = _______________;
	System.out.println(result);
	*/
		double a = 3.5;
		double b = 4.7;
		double result2 = (double)a + (int)b;
		// 선생님풀이
		// double result2 = a + (int)b;
		System.out.println(result2);
		
		
	/*	
	3. 계산결과가 12가 나오도록 작성하세요
	String a = "3.4";
	String b = "4";
	______ result = ________;
	System.out.println(result);
	*/
		String a1 = "3.4";
		String b1 = "4";
		int result3 = (int)Double.parseDouble(a1) * Integer.parseInt(b1);
		System.out.println(result3);	
		
	/*
	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a = "10";
	int b = 3;
	double c = 4.5;
	_____ result = _______;
	System.out.println(result);
	*/
		String a2 = "10";
		int b2 = 3;
		double c2 = 4.5;
		String result4 = a2 + (int)(b2 * c2); 
		System.out.println(result4);
		
		
	/*
	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a = 4;
	double b = 3.4;
	String c = "6.8";
	_____ result = _______;
	System.out.println(result);
	 */
	
		int a3 = 4;
		double b3 = 3.4;
		String c3 = "6.8";
		String result5 = "" + ((int)Double.parseDouble(c3)*a3) + (int)b3;
		// 선생님풀이
//		String result5 = a3 * (int)Double.parseDouble(c3)+ String.valueOf((int)b3);
		System.out.println(result5);	
		
	/*
	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x = 111;
	int y = 13;
	int result = _____;
	System.out.println(result);

	1) 출력결과 : 7
	2) 출력결과 : 8
	*/
	// 1)
		int x1 = 111;
		int y1 = 13;
		int result6 = x1 % y1;
		System.out.println(result6);
	// 2)
		int o = 111;
		int p = 13;
		int result7 = o / p;
		System.out.println(result7);
		
		
	}

}
