package study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp tt = null;
		
		if( tt != null) {
			tt.t = 10;
		}
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.printf("숫자를 입력하세요:");
		
		// int in = scanner.nextLine();
		
		String s = scanner.nextLine();
		int n= 0;
		
		try {
			System.out.println("presInt 전");
			n = Integer.parseInt(s);
			System.out.println("presInt 후");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();			
		} finally {
			System.out.println("여기 finally");
		}
		
		System.out.println("입력한 숫자는 : " + n);
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) { //일반예외처리 사전에 잡은거임
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Temp {
	int t;
}