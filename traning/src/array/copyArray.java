package array;

import java.util.Scanner;

public class copyArray {

	public static void main(String[] args) {
     int count=0;
		Scanner sc=new Scanner(System.in);
    
		int[] array1=new int[5];
		
		for(int i=0;i<array1.length;i++){
			 array1[i]=sc.nextInt();
		
		}
	/*	 for(int n:array1){
			 System.out.print("elments are:"+n);
		 
		 }
	*/	 
		 for(int i=0;i<array1.length;i++){
			 for(int j=i+1;j<array1.length;j++){
				 if(array1[i]==array1[j]){
					 count++;
					 break;
				 }
			 }
		 }
			 System.out.println(count);
		 
		 
		// System.out.println();
			 
		 }
	}


