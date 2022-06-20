package traning;

import java.util.Scanner;

public class ifelseCondition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int time =sc.nextInt();
	 
	 if(time<12){
		 System.out.print("Good mornig");
	 }
	 else if(time>=12&& time<=17){
		 System.out.println("good after noon");
	 }
	 else if(time>=17&&time<20){
		 System.out.println("good evenig");
	 }
	 else if(time<=24&&time>=20){
		 System.out.println("good night");
	 }
	 else{
		 System.out.println("plz enter valid time");
	 }
	}

}
