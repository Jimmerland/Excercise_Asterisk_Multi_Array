package com.jimmer.jim.multi.dimentional.excercises;

public class AsteriskWithExplanation {
	//row= 출력하는 줄수 (대칭을 원하면 홀수를 넣으세요, 사용자에게 입력받아도 됨.)
	//num= 각라인에 찍히는 별의 개수
	//index= 별이 찍히기 시작하는 지점
	
	public void test1() {
		int row=11;
		int maxNum=row;
		for(int i=0;i<row;i++) {
			int index = row-i;
			for (int j=0;j<index;j++) {				
				if(j>=0&&j<index) {
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void test2() {
		int row=11;
		int maxNum=row;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	public void test3() {
		int row=11;		
		boolean bool=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				int num=i+1; 
				int index =row-1-i; // (0,4) (1,3) (2,2) ... 
				bool= (j>=index)?true:false;
				if (bool) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
//				같은 의미
//				if(j<index) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
			}
			System.out.println();	
		}
	}
	public void test4() {
		int row=11; 
		//최대 별의 수 = 총 필요 공간= row*2-1
		//행(row) 5개, 대칭이되는 지점= j좌표값=row-1인 지점
		//별의 갯수(num) = 2*i+1, 
		//별의 시작위치(index)= row-i-1
		//0이상 (index)미만/ index이상 (index+value)미만 /index+value이상 row*2-1이하		
		for (int i=0;i<row ; i++) {
			for (int j=0;j<row*2-1;j++) {
				int num=2*i+1;
				int index =row-i-1;
				if(j<index) {
					System.out.print(" ");
				} else if(j>=index&&j<index+num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void test5() {
		int row=11;
		//asterisk갯수 0행 2*row-1개, 1행 2*(row-1)-1개 -> 2*(row-i)-1
		//* 시작하는 index는 i행일때 2i부터
		boolean bool=true;
		for(int i=0;i<row;i++) {
			for(int j=0;j<2*row-1;j++) {			
				int num=2*(row-1-i)+1; //2(n-i)+1형태
				int index=2*i;
				bool= (j>=2*i)? true:false;
				if (bool) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
							
			}
			System.out.println();	
		}
	}
	public void test6() {
		int row=11;
		//asterisk 가 찍히는 개수 num = 2*(row-1-i)+1
		//(row-2i-1)이 음수가 되면 찍히는 index는 2i-row+1=(row-2*i-1)*(-1)
		boolean bool=true;
		for(int i=0;i<row;i++) {	
			for(int j=0;j<row;j++) {				
				int num=2*(row-1-i)+1;
				int index=row-1-num;
				//(num>0)일때 index는 row-2*i-1
				//(num<0)일때 index는 2*i-row+1 부호가 바뀐값
				bool= (j>=row-2*i-1)&&(row-2*i-1>=0)? true:((j>=2*i-row+1)&&(row-2*i-1<0)? true:false);
				if (bool) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
					
			System.out.println();	
		}
	}
	
	// 부호가 바뀌는 부분을 절대값으로 처리해보자.
	
	public void test7() {
		int row=13;
		//asterisk가 찍히는 최대 개수 = 행의 개수 (row) 
		//행의 중간값 = row/2 (i좌표) 
		//int num= 2*(row-1-i)+1
		//대칭점 j=row/2	(j좌표)
		//int index =대칭점으로부터-i
		for(int i=0;i<row;i++) {		
			int index = Math.abs(row/2-i);//시작하는 지점
			int blank = Math.abs(2*(i-row/2));//빈칸의 개수
			int num = Math.abs(row-blank);//별의 개수 2*Math.abs(row/2-i)+1과 같음.
			for(int j=0;j<row;j++) {					
					 if (index<=j&&j<index+num){
						System.out.print("*");
					} else {
						System.out.print(" ");
					}				
			}					
			System.out.println();	
		}
	}
	
	public void test8 () {
		int row=13;
		//행의 중간값=row/2 (i좌표)
		//별의 개수(num)=|2*(row/2-i)|+1, 별의 개수 2개씩 줄어들다가 2개씩 늘어남.
		//별이 찍히는 시작점(index) = 전체 좌표-별의 개수
		for(int i=0;i<row;i++) {			
			int num = Math.abs(2*(row/2-i))+1; //(5,0) (3,1) (1,2) (3,3) (5,4)
										   	   //(7,0) (5,1) (3,2) (1,3) (3,4) (5,5) (7,6) 			
			int index = row-num;			
			for(int j=0;j<row;j++) {								
					if (index<=j&&j<index+num){
						System.out.print("*");
					} else {
						System.out.print(" ");
					}				
			}					
			System.out.println();	
		}
	}
}
