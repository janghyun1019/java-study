package study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원배열
		
		
		//int[]
		//int[][][]
		//int[][][][]
		int[][] nArr1 = new int[3][5]; //3헹 5열짜리가 생기는거임
		
		// nArr1.length 3
		
		/* 0 1 2  3 4 
		0  ㅁ ㅁ ㅁ ㅁ ㅁ
		1  ㅁ ㅁ ㅁ ㅁ ㅁ
		2  ㅁ ㅁ ㅁ ㅁ ㅁ		  
		 */
		
		int[][] nArr2 = new int[2][3];
		// 기본값 : 0
	
		
		/* 0 1 2 
		0  ㅁ ㅁ ㅁ
		1  ㅁ ㅁ ㅁ		  
		 */
		
		int[] nA = {1,2,3,4,5};
		int[][] nArr3 = {{1,2,3},{4,5,6}};
		//			2	  3
		//			0 1   0 1 2
		
		System.out.println(nArr3[0][2]);
		
		/*
		 0  1 2
	0	 1 2 3
	1	 4 5 6
		 */
		
		//  [2][3]      행의 길이 2
		for(int i=0; i<nArr3.length; i++) {
			
			for(int j=0; j<nArr3[i].length; j++) {
				
				System.out.print(nArr3[i][j] + " ");
				
			}
			System.out.println();
		}
		int[][] nArr4 = new int[5][3];
		
		
		
		

	}

}
