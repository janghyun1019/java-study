package study.alone.al241031;

public class ForSumFrom1To100ExampleLe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //합계변수
		
		int i = 0; //루프 카운터 변수
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합" + sum);

	}

}
