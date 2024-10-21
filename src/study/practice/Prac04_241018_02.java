package study.practice;

import java.util.Scanner;

public class Prac04_241018_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------1번----------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간을 입력하세요 : ");
		int hour = scanner.nextInt();
		
		if(hour >= 1 && hour <= 12) {
			System.out.print("오전입니다. " + "\n");
			if(hour <= 6) {
				System.out.println("이른 오전입니다.");
			} else {
				System.out.println("늦은 오전입니다.");
			}
		} else if(hour > 12 && hour <= 24) {
			System.out.print("오후입니다. " + "\n");
			if(hour <= 18) {
				System.out.println("이른 오후입니다.");
			} else {
				System.out.println("늦은 오후입니다.");
			}
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------2번----------");
		
		
		int diceNum = 3; //주사위 수 1~6

		// if문 변환
		switch(diceNum) {
		case 1: // diceNum == 1
		System.out.println("1");
		break;
		case 2:
		System.out.println("2");
		break;
		case 3:
		System.out.println("3");
		case 4:
		System.out.println("4");
		case 5:
		System.out.println("5");
		break;
		default:
		System.out.println("6");
		//case 6:
		}
		
		if(diceNum == 1) { //1 조건에 맞으면 모두
			System.out.println("1");
		} else if (diceNum == 2) { //2
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
			System.out.println("6");
		} else {
			System.out.println("6");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------3번----------");
		
		
		String localNum = "031";
		// switch 문으로 변경
		if ( localNum.equals("031") ){
		System.out.println("경기도입니다");
		}
		if ( localNum.equals("02") ){
		System.out.println("서울입니다.");
		}
		if ( localNum.equals("041") ){
		System.out.println("충남입니다");
		}
		if ( localNum.equals("051") ){
		System.out.println("부산입니다");
		}
		
		System.out.println("----------제꺼----------");
		
		localNum = "031";
		switch(localNum) {
		case "031":			
			System.out.println("경기도입니다");
			break;
		case "02":			
			System.out.println("서울입니다.");
			break;
		case "041":	
			System.out.println("충남입니다");
			break;  // 현재 switch문을 멈추고 나가라~ 그 케이스에 맞으면 그것만 실행하고 나가라
		case "051":	
			System.out.println("부산입니다");
			break;

		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("----------4번----------");
		
		int score;
		
		score = 89;
		
		if( score >= 90) {
			System.out.println("학점 A");
			} else if ( score >= 80) {
			System.out.println("학점 B");
			} else if (score >= 70) {
			System.out.println("학점 C");
			} else if (score < 70) {
			System.out.println("학점 F");
			}
		
		System.out.println("----------제꺼----------");
		
		int score1 = score;
		switch(score1) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:					
			System.out.println("학점 A");
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:			
			System.out.println("학점 B");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70: 
			System.out.println("학점 C");
			break;
			default:
				System.out.println("학점 F");
			
			
			
			

		}
		


	}

}
