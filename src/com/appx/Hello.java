package com.appx;
//������
/*�h�����*/
/**
 * javadoc������
 * 
 * @author jimmy
 * @since 2016-10-13
 */

public class Hello {

	public static void main(String[] args) {

		// primitive java 8�j���ܼƫ��A
		boolean bb = true;
		byte b = 100;
		float f = (float) 3.14;// �j���ഫCAST
		float f2 = 3.14F;
		double dd = 3.14;
		long l = 1111111111111111L;
		char c = '\u3080';// �s�X���A
		char c2 = 'c';// ���N�q����r
		short s = 22;
		int ii = 22;
		
		
		
		
		/*
		java �B��3�ث��A(�̤pInt)
		byte bb2 = 3,bb3 = 4;
		bb2=bb2+bb3; >> [error] ���byte ���B��| �ܦ����int �ҥH������w��byte
		���int/�����long/���B�I�� double
		�B�ⶶ��>>()>>�j���ഫ>>����>>�[��
		
		20161018
		int x=2,y
		y=++x y=2 >> �����W�b����(�]�����k����ݨ�+�ҥH�����W)
		y=x++ y=1 >> �������b���W(�]�����k����ݨ��ܼƩҥH������)
		++x >> prefix(�e�m�k)
		x++ >> postfix(��m�k)
		
		�줸�B��(bitwise operation)
		int i=2,y[int => 32bits,32��]
		1. (��j) y=i << 2 ==> .....010 (�������,��0) ==> .....01000 ==> 2��3����
		2. (�Y�psigned shift) y=i >> 2 ==> .....010 (�k�����,�ɭ쥻�̥��䪺bit) ==> .....01000 ==> 2��3����
		   (�Y�punSigned shift) y=i >>> 2 ==> .....010 (�k�����,�T�w��0) ==> .....01000 ==> 2��3����
		3. |1|0|0|0|0|.....|0|0|0|0|0|==>�̥��䪺��l��ܥ��t��
		4. y=i << 32 ==> �Ʀr >= 32�ɷ|����i��32���l�� �ӨM�w�첾����l
		5. Integer.toBinaryString(5) ==> 10�i����2�i��y�k
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
