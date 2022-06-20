package traning;

import java.util.Scanner;

public class breakKeyword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(true){
		int n=sc.nextInt();
	if(n<5){
		continue;
	//break;
		}
		sum=sum+n;
		System.out.println(sum);
		}

}

}
