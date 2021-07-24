package com.jimmer.jim.multi.dimentional.excercises;

public class Sample {
 
	/**
	 * 1. 3행 5열 2차원배열 선언 및 생성
	 * 2. 1~100사이의 임의의 정수를 모든 방에 기록함
	 * 3. 열의 값이 5의 배수인 경우만 값(행,열) 출력함
	 */
	public void exercise1() {
		int[][] arr = new int[3][5];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				int num = (int)(Math.random()*100+1);
				arr[i][j]=num;
				if(num%5==0) {
					System.out.print(arr[i][j]+"("+i+","+j+") ");
				}
			}
		}
		System.out.println(" \n\n");
	}
	
/**	1. 3행4열 2차원배열 선언 및 생성
*	2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
*	3. 아래의 내용처럼 처리함
*		0열	1열	2열	3열	
*	0행	값	값	값 	0행 값들의 합계
*	1행	값	값	값	1행 값들의 합계
	2행	값	값	값	2행 값들의 합계
*/
	public void excercise2() {
		int row = 4;
		int column =4;
		int[][] arr = new int[row][column];
		int sumRow= 0;
		int total=0;
		int[] sumColumn = new int[column];
		System.out.printf("%4s %4s %4s %4s %3s %n"," ","0열", "1열", "2열", "3열");
		for (int i= 0; i<row-1;i++) {
			System.out.printf("%3d%s",i,"행");
			for (int j=0;j<column-1;j++) {
				arr[i][j]=(int)(Math.random()*100+1);
				System.out.printf("%5d",arr[i][j]);
				sumRow+=arr[i][j];//행의 합 누적시키기
				sumColumn[j]+=arr[i][j];//열의 합 누적	
			}			
			total+=sumRow;
			arr[i][column-1]=sumRow;				
			System.out.printf("%5d",arr[i][column-1]);
			System.out.println();
		}
		
		arr[row-1][column-1]=total;
		System.arraycopy(sumColumn, 0, arr[row-1], 0, column-1);
		System.out.printf("%3d%s",row,"행");
		for (int k=0; k<column; k++) {			
			System.out.printf("%5d",arr[row-1][k]);
		}
		System.out.println(" \n\n");
	}
}
