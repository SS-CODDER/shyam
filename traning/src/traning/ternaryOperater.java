package traning;

import java.util.Scanner;

public class ternaryOperater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time=sc.nextInt();
		int a=10;
		int b=20;
		int c=8;
		int max;
	//	max=(a>b)?(a+b):(b-a);
		max=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(max);
	
	
	String result=(time>24)?"enter invalid time":((time>=18)?"good nigth":((time>=12&&time<18)?"good after noon":"good mornig"));
	System.out.print(result);
	}

}
