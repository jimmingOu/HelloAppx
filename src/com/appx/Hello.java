package com.appx;
//單行註解
/*多行註解*/
/**
 * javadoc文件註解
 * 
 * @author jimmy
 * @since 2016-10-13
 */

public class Hello {

	public static void main(String[] args) {

		// primitive java 8大基本變數型態
		boolean bb = true;
		byte b = 100;
		float f = (float) 3.14;// 強制轉換CAST
		float f2 = 3.14F;
		double dd = 3.14;
		long l = 1111111111111111L;
		char c = '\u3080';// 編碼型態
		char c2 = 'c';// 有意義的文字
		short s = 22;
		int ii = 22;
		
		
		
		
		/*
		java 運算3種型態(最小Int)
		byte bb2 = 3,bb3 = 4;
		bb2=bb2+bb3; >> [error] 兩個byte 做運算會 變成兩個int 所以不能指定給byte
		整數int/長整數long/雙浮點數 double
		運算順序>>()>>強制轉換>>乘除>>加減
		
		20161018
		int x=2,y
		y=++x y=2 >> 先遞增在指派(因等號右邊先看到+所以先遞增)
		y=x++ y=1 >> 先指派在遞增(因等號右邊先看到變數所以先指派)
		++x >> prefix(前置法)
		x++ >> postfix(後置法)
		
		位元運算(bitwise operation)
		int i=2,y[int => 32bits,32格]
		1. (放大) y=i << 2 ==> .....010 (左移兩格,補0) ==> .....01000 ==> 2的3次方
		2. (縮小signed shift) y=i >> 2 ==> .....010 (右移兩格,補原本最左邊的bit) ==> .....01000 ==> 2的3次方
		   (縮小unSigned shift) y=i >>> 2 ==> .....010 (右移兩格,固定補0) ==> .....01000 ==> 2的3次方
		3. |1|0|0|0|0|.....|0|0|0|0|0|==>最左邊的格子表示正負數
		4. y=i << 32 ==> 數字 >= 32時會先取i跟32的餘數 來決定位移的格子
		5. Integer.toBinaryString(5) ==> 10進位轉2進位語法
		*/
//		int xx=0;
//		int x1=0;
//		int x2=0;
//		int x3=0;
//		xx=1+2;
//		x1=2*2;
//		x2=1/2;
//		x3=2%1;		
//		double dx = (double)(1/2);
//		System.out.println("dx="+dx);
//		System.out.println("xx="+xx);
//		System.out.println("xx="+x1);
//		System.out.println("xx="+x2);
//		System.out.println("xx="+x3);
//		System.out.print("cc=" + c);
//		int x= -1,y;
//		y = x<<5;
//		System.out.println("dx="+y);
//		System.out.println(Integer.toBinaryString(y));
		
		int grade=500;
		if(grade>=60){
		   System.out.println("PASS");
		}else{
		   System.out.println("FAIL");
		}

		int number=47;
		if(number%2==0){
		   System.out.println("Even");
		}
		else{
		   System.out.println("Odd");
		}
		

		
		


	}
}
