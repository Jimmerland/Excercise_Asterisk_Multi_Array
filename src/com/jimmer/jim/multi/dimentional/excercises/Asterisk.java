package com.jimmer.jim.multi.dimentional.excercises;

public class Asterisk {
	//row= 출력하는 줄수;
	//num= 찍히는 별의 최대 개수;
	//index= 별이 찍히기 시작하는 지점;
	
	public void test1() {
		int row=11;
		int num=row;
		
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
		int num=row;
		
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
				int index =row-1-i; 
				bool= (j>=index)?true:false;
				if (bool) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
	public void test4() {
		int row=11; 	
		
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
		boolean bool=true;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<2*row-1;j++) {			
				int num=2*(row-1-i)+1; 
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
		boolean bool=true;
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<row;j++) {				
				int num=2*(row-1-i)+1;
				int index=row-1-num;
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

		for(int i=0;i<row;i++) {			
			int num = Math.abs(2*(row/2-i))+1; 
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
