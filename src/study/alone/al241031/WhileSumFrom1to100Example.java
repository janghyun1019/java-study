package study.alone.al241031;

public class WhileSumFrom1to100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
