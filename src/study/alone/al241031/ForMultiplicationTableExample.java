package study.alone.al241031;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단
		for(int m=2; m<=9; m++) { //바깥쪽 for문
			System.out.println("***" + m +"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m +" x " + n + " = " + (m*n));
			}
		}
		

	}

}
