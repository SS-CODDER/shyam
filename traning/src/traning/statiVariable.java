package traning;

public class statiVariable {
	static int  a;
	
	static int sum(int a,int b){
		a=10;
		return a+b;
	}
	
	static int sum1(int b,int c){
	
		return b+c;
	}

	public static void main(String[] args) {
		
		
		System.out.println(sum(15, 20));
		System.out.println(sum1(40, 20 + a));
		

	}

}
