package study.practice;

import java.util.Scanner;

public class Prac10_241022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korScore = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		int mathScore = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		int engScore = scanner.nextInt();

		int sum = korScore + mathScore + engScore;
		double average = sum/3;
		
		if (korScore < 40 || mathScore < 40 || engScore <40 || average<=59) {
			System.out.println("불합격입니다.");
		}else {	
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!",
					korScore,   mathScore,    engScore,   sum,     average );
		}

	}

}
