package traning;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		int leng=str.length();
	String s="";
		
		for(int i=leng-1;i>=0;i--){
			 s=s+str.charAt(i);
		 }
		if(str.equalsIgnoreCase(s)){
			System.out.println("given String is palindrom:");
		}
		else{
			System.out.println("given String not palindrom:");
		}

	}

}
