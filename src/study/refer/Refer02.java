package study.refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// enum 써보기
		String day ="MONDAY";
		
		String day2 ="TUESDAY";
		
		String day3 ="FRIDAY";
		
		String today = "WEDNESDAY"; 
				
		today = "FRIDAY";		
		System.out.println();
		System.out.println();
		
		//if(today == day3) {
		if(today.equals(day3)) {
			System.out.println("퇴근준비~하자~");
		}
		
		Week day11 = Week.MON;
		Week day12 = Week.FRI;
		
		if(day12 == Week.FRI) {
			System.out.println("금요일 퇴근준비");
		}

		// 메뉴 : 짜장면 짬뽕 탕수육
		//			1  2  3

		String menu = "짜장면";  // "짬뽕";
		int menu2 = 3;
		
		Menu menu3 = Menu.TSY;
		
	}

}
