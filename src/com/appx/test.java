/**
 * hollowworld!
import java.util.Scanner;

 */
package com.appx;
import java.util.Scanner;


/**
 * @author user
 *
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// 		TODO Auto-generated method stub
// 		�ؤ� = ���*(9/5)+32
// 		��� = (�ؤ�-32)*5/9
//		int tempC = 1;
//		int tempCC = 100 ;
//		double tempF = (tempC)*9.0/5 +32;
//		double tempFF =(tempCC)*9.0/5 +32;
//		System.out.println("Celsius:"+tempC+"="+tempF+"��F");
//		System.out.println("Celsius:"+tempCC+"="+tempFF+"��F");
		
//        System.out.print("please enter the score:");
//        
//        Scanner scanner = new Scanner(System.in);
//		int score = scanner.nextInt();
//	    int score2=	scanner.nextInt();
//
//	    System.out.println((score+score2));
//	    System.out.println((score-score2));
//	    System.out.println((score*score2));
//	    System.out.println((score/score2));
//	    System.out.println((score%score2));
		
		char score1 ='A';

		if(score1=='A')
			System.out.println("Score:90");
		else if(score1=='B')
			System.out.println("Score:80");
		else if(score1=='C')
			System.out.println("Score:70");		
		else
			System.out.println("Error");	
		
		switch(score1){
		//���L�Ҧ�case�����ŦX,�~��default,�򶶧ǵL��
		//���󤣯���ܼ�
		  case 'A' :
			  System.out.println("Score:90<");
			  break;
		  case  'B':
			  System.out.println("Score:80<");
			  break;
		  case  'C':
			  System.out.println("Score:70<");
			  break;
		   default :
			   System.out.println("Error<");	
			   break;
		}
        
		for(int i = 1; i < 11 ;i++){
			System.out.print((i*10-5)+" ");	
		}

		
//		for(boolean i = true; i = true ;i = false){
//			  System.out.println("step 3 : "+i);	
//		}	
	}
}
