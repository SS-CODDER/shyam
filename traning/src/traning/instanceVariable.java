package traning;

public class instanceVariable {
  int a;    
   instanceVariable(){
	  this.a=20; 
   }
   instanceVariable(int i,int j){
	   System.out.println(a+i+j);
	   
   }
	public static void main(String[] args) {
			
		instanceVariable sc=new instanceVariable();
		System.out.println(sc.a);
		new instanceVariable(25,10);
		
		

	}

}
