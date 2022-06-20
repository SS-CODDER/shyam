package traning;
//addition of given no range;like 5
import java.util.Scanner;

public class dowhileLoop {

	public static void main(String[] args) {
	int sum=0;
	int n=0;
	Scanner sc=new Scanner(System.in);
	do{
		sum=sum+n;
		n=sc.nextInt();
	}
	while(n<=5);
	 System.out.println("Addition of numbers"+ sum);
 //sc.close();
	}

}
