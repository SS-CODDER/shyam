package assenment;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	if(number%2==1){
		
		 
	for(int i=1; i<=number; i++) 
    {
        for(int space=1; space<i; space++) 
        {
            System.out.print("  ");
            space++;
        }
        for(int star=i; star<=number; star++) 
        {
            System.out.print(" *");
        }
        System.out.println();
        i++;
    }
    
    for(int i=number-1; i>=1; i--) 
    {
        i--;
        for(int space=1; space<i; space++) 
        {
            System.out.print("  ");
            space++;
        }
        for(int star=i; star<=number; star++)
        {
            System.out.print(" *");
        }
        
        System.out.println();
    }
    
	}
	else{
		System.out.println("Enter the odd no:");
	}
}
	
	 }



