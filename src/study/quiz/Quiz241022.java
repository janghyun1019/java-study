package study.quiz;

import java.util.Scanner;

public class Quiz241022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("출생년도를 입력하세요 :");
		int birthYear = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 :");
		int idcardBackFnum = scanner.nextInt();
		int age = (2024 + 1) - birthYear;
		          
		if (idcardBackFnum  == 1 && birthYear <=1999) {
		    System.out.println("결과 : " + age + "살 남자" + "입니다.");
		} else if (idcardBackFnum  == 3 && birthYear >=2000) {
		     System.out.println("결과 : " + age + "살 남자" + "입니다.");
		} else if (idcardBackFnum  == 2 && birthYear <=1999) {
		     System.out.println("결과 : " + age + "살 여자" + "입니다.");
		} else if (idcardBackFnum == 4 && birthYear >=2000) {
		     System.out.println("결과 : " + age + "살 여자" + "입니다.");
		} else
		     System.out.println("잘못된 입력입니다.");
		
		

	}

}
