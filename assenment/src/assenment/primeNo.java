package assenment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class primeNo {
	int i;

	public static void main(String[] args) {
	 int temp;
	 int arr[]=new int [100];
		Scanner sc=new Scanner(System.in);
	 int starting=sc.nextInt();
	 int ending=sc.nextInt();
	 for(int i=starting;i<=ending;i++){
		 if(i==1||i==0)
			 continue;
			 temp=1;
		 for(int j=2;j<i/2;j++){
			 if(i%j==0){
				 temp=0;
				 break;
			 }
		 }
		 
		 if(temp==1){
	 ArrayList<Integer> s=new ArrayList<Integer>();
	 s.add(i);
	for(int n=0;n<=10;n++){
	System.out.println(n+1);
	}
		 }
		 }
		
		
		 }	 
	 
	}
	

	
		 
	 

	


