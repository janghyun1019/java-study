package study.quiz;

public class Quiz241025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[5][5];
		
		// 기본값:0
		
		for (int i = 0; i < 5; i++) {
			// i: 0~4
			for (int j = 0; j < 5; j++) {
				// j : 0~4
				if (i == j) {
					array[i][j] = 1; // 대각선
				} else if (j < i) {
					array[i][j] = 3; // 대각선 아래
				} else {
					array[i][j] = 2; // 대각선 위
				}
			}
		}
		// 출력
		for (int i = 0; i < 5; i++) {
			// i : 0~4
			for (int j = 0; j < 5; j++) {
				// j: 0~4
			System.out.print(array[i][j] + " ");
			}
		System.out.println();
		}
				

	}

}
