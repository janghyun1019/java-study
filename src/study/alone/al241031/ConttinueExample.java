package study.alone.al241031;

public class ConttinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) { // 2로 나눈 나머지가 0이 아닐경우, 즉 홀수인 경우
				continue;
			}
			System.out.println(i); // 홀수는 실행되지 않음
		}

	}

}
