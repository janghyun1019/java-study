package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if문

		int num = 20;
		int x = 10;
		
		if(num > 10) { //(num > 10)안에 참거짓이 들어가면 됨
			System.out.println("확인을 해보니까");
			System.out.println("10보다 크더라~");
			x = 20;
		}
		else {
			System.out.println("10보다 안크던데?");
		}
		
		boolean b = num == 15; // true /false
		
		if(num > 15) {
			System.out.println("한번더 살펴보니");
			System.out.println("15랑 똑같더라");
		}
		
		
		System.out.println("끝");
	}

}
