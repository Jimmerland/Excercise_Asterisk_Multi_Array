package com.jimmer.jim.multi.dimentional.excercises;

public class Asterisk {
	//row= row that gonna be printed;
	//num= asterisk number in each line;
	//index= starting point of asterisk;
	
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
	//try out abstract process for reverse sign with Math.abs() 
	
	
	public void test7() {
		int row=13;
		
		for(int i=0;i<row;i++) {		
			int index = Math.abs(row/2-i);//starting point of asterisk시작하는 지점
			int blank = Math.abs(2*(i-row/2));//number of blank
			int num = Math.abs(row-blank);//number of asterisk= 2*Math.abs(row/2-i)+1 = row-blank
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
