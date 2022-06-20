package traning;

public class operater {
	 int a=20;
	int b=10;
   int add(){
	 
	  return a+b;
  }
   
   
  int sub(){
		 
		  return a-b;
	  }

   
   
   static int multi(int a,int b){
		 
		  return a*b;
	  }

   
   
  static int division(int a,int b){
		 
		  return a/b;
	  }


	public static void main(String[] args) {
		
		operater sc=new operater();
		System.out.println("addition:"+sc.add());
		System.out.println("substraction:"+sc.sub());
		System.out.println("multiplication:"+multi(10,20));
		System.out.println("division:"+division(20,10));
	//	System.out.println("addition:"+sc(10,20));
	
  

	}

}
