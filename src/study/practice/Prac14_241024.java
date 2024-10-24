package study.practice;

import java.util.Scanner;

public class Prac14_241024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			System.out.println("1.입력");
			System.out.println("2.수정");
			System.out.println("3.조회");
			System.out.println("4.삭제");
			System.out.println("5.종료");
			System.out.print("메뉴번호를입력하세요 : ");
			
			Scanner scanner = new Scanner(System.in); 
			int menu=scanner.nextInt();
			

			if(menu >=1 && menu<= 5) { // 정상범위
				// menu 1~5
				
				if(menu == 1) {
					System.out.println("입력메뉴입니다.");
				} else if (menu == 2) {
					System.out.println("수정메뉴입니다.");
				} else if (menu == 3) {
					System.out.println("조회메뉴입니다.");
				} else if (menu == 4) {
					System.out.println("삭제메뉴입니다.");
				} else { //5
					System.out.println("프로그램이 종료됩니다.");
//					return;
				} 
				
			} else { // 잘못됨
				System.out.println("잘못입력하셨습니다.");
				
			}
			
			System.out.println();
			
		

	}

}
