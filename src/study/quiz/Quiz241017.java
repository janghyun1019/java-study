package study.quiz;

public class Quiz241017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String brand = "로지텍";
		String proName = "my Kyes";
		String proPrice = "135000";
		String serNumber = "332L1545k";
		
		System.out.println("브랜드명 : " + brand);
		System.out.println("상품명 : " + proName);
		System.out.println("상품가격 : " + proPrice);
		System.out.println("시리얼번호 : " + serNumber);
		
		String compName = "SAMSUNG";
		int motInch = 24;
		String motColor = "black";
		String hdmiPort = "true";
		String soundOut = "false";
		/* 
		 * >> 선생님풀이
		 * 		boolean hdmiPort = true;
		 * 		boolean playSount = false;
		 * 
		 *		open	isOpened
		 * 		close isClosed
		 * 		hdmiPort hasHdmiPort
		 * 		playSound canPlaySound
		 */
		
		System.out.println("회사명 : " + compName);
		System.out.println("모니터인치 : " + motInch);
		System.out.println("모니터색상 : " + motColor);
		System.out.println("HDMI포트여부 : " + hdmiPort);
		System.out.println("소리출력가능여부 : " + soundOut);
		
		double pi = 3.14;
		
		System.out.println("원주율 : " + pi);
		
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int mathScore1 = Integer.parseInt(mathScore);
		int englishScore1 = Integer.parseInt(englishScore);
		int artScore1 = Integer.parseInt(artScore);
		
//		System.out.println("String mathScore = " + mathScore1);
//		System.out.println("String englishScore = " + englishScore1);
//		System.out.println("String artScore = " + artScore1);
//		
		int toTal = mathScore1 + englishScore1 + artScore1;
		
		System.out.println("총점 : " + toTal);
		
		int num1 = 4;
		int num2 = 10;
		double num3 = (double) num1 / num2 ;
		
		/* 선생님풀이 
		 *  int / int -> int 4/10 = double num3 = 0.0
		 *  
		 *  double num3 = (double) num1 / num2 ;
		 *  double num3 = num1 / (double) num2 ;
		 *  double num3 = (double) num1 / (double) num2 ;
		 *  
		 *  double num4 = num1; 4.0
		 *  double num5 = num4 /num2
		 *  System.out.println( num5 );
		 */
		
		System.out.println( num3 );

				

	}

}
