package study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// null과 NullPointerException
		
		int n;
		int num = 0;
		
		String s1;
		String s2 = null; // null 빈주소에요
		
//		System.out.println(n);			 // 초기화가 안되서 안됨
		System.out.println(num);
//		System.out.println(s1);			 // 초기화가 안되서 안됨
		System.out.println(s2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 :");
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();
		String str4 = new String("아침");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));
		
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
//		String test = null;
//		System.out.println(test.equals("널이냐"));
		// NullPointerException이 발생한다! 오류가 나는게 당연함.
		
		
		int n1 = 10;
		int n2 = n1;
		
		String ss1 = "점심";
		String ss2 = ss1;  // 같은 주소를 가리키고 있다.

	}

}
