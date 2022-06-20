package assenment;

import java.util.Scanner;


class bank{
	
	public static void LoanSection(){
		
		System.out.println("press 1 for personal loan:");
		System.out.println("press 2 for housing loan:");
		System.out.println("press 3 for car loan:");
		System.out.println("press 4 for gold loan:");
		System.out.println("press 9 to go back to previous menu:");
		Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
		
		switch(s){
		case 1:
			System.out.println("personal loan");
	//		System.out.println("press 9 to go back to previous menu:");
			LoanSection();
			break;
			
			
		case 2:
			System.out.println("housing loan");
			//System.out.println("press 9 to go back to previous menu:");
			LoanSection();
			break;
			
		case 3:
			System.out.println("car loan");
			//System.out.println("press 9 to go back to previous menu:");
			LoanSection();
			break;
			
		case 4:
			System.out.println("gold loan");
			//System.out.println("press 9 to go back to previous menu:");
			LoanSection();
			break;
			
		case 9:
			System.out.println("back to main menu:");
			BankTeleCaller.main(null);
			default:
				System.out.println("plz press valid key:");
				LoanSection();
		}
		
	}
	
	public static void Savingsaccount(){
		Scanner B=new Scanner(System.in);
	//	System.out.println("enter your savingaccount number:");
		long accountno=B.nextLong();
	    String b=String.valueOf(accountno);
	    int leng=b.length();
	        if(leng<=8){
	        	System.out.println("Thank you for account number");
	        	
	        	System.out.println("press 1 to show account balance");
	        	System.out.println("press 2 to speak customer care");
	        	System.out.println("press 9 to go back to previous menu");
	        	
	     int A=B.nextInt();
	    		switch(A){
	    		case 1:
	    			System.out.println("show account balance");
	    			System.out.println("press 9 to go back to previous menu");
	    			Savingsaccount();
	    			break;
	    			
	    			
	    		case 2:
	    			System.out.println("speak customer care");
	    			System.out.println("press 9 to go back to previous menu");
	    			Savingsaccount();
	    			break;
	    			
	    		case 9:
	    			System.out.println(" go back to main menu");
	    			BankTeleCaller.main(null);
	    			break;
	    		    			
	    		default:
	    				System.out.println("plz press valid key:");
	    				Savingsaccount();
	    		}
	        	
	        	
	        }
	        
	        
	        else{
	        	
	        	System.out.println("enter valid account no");
	        //	System.out.println("press 9 go back account no ");
	        	Savingsaccount();
	        	
	      
	        }
		
	}
	
	public static void Currentaccount(){
		
		
		Scanner B=new Scanner(System.in);
		
			long accountno=B.nextLong();
		    String b=String.valueOf(accountno);
		    int leng=b.length();
		        if(leng<=8){
		        	System.out.println("Thank you for account number");
		        	
		        	System.out.println("press 1 to show account balance");
		        	System.out.println("press 2 to speak customer care");
		        	System.out.println("press 9 to go back to previous menu");
		     	
		     int A=B.nextInt();
		     
		    		switch(A){
		    		case 1:
		    			System.out.println("show account balance");
		    			System.out.println("press 9 to go back to previous menu");
		    			 Currentaccount();
		    			break;
		    			
		    			
		    		case 2:
		    			System.out.println("speak customer care");
		    			System.out.println("press 9 to go back to previous menu");
		    			 Currentaccount();
		    			break;
		    			
		    		case 9:
		    			System.out.println(" go back to main menu");
		    			BankTeleCaller.main(null);
		    			break;
		    		    			
		    		default:
		    				System.out.println("plz press valid key:");
		    				 Currentaccount();
		    		}
		        	
		        	
		        }
		        }
		
	
	public static void  cardsSection(){

		Scanner sc=new Scanner(System.in);
	//	int s=sc.nextInt();
		System.out.println("press 1 for credit card");
		System.out.println("press 2 for debit card");
		System.out.println("press 9 to go back to previous menu");
/*	 int D=sc.nextInt();
	 
	 if(D==1){
		System.out.println("enter account no");
		long accountno=sc.nextLong();
	    String b=String.valueOf(accountno);
	    int leng=b.length();
	        if(leng>=8 && leng<=16){
	        	System.out.println("Thank you for account number");
	        	
	        	System.out.println("press 1 to block your card");
	        	System.out.println("press 2 to speak customer care");
	        	System.out.println("press 9 to go back to previous menu");
	        	
	     int A=sc.nextInt();
	    		switch(A){
	    		case 1:
	    			System.out.println("block your card");
	    			System.out.println("press 9 to go back to previous menu");
	    			cardsSection();
	    			break;
	    			
	    			
	    		case 2:
	    			System.out.println("speak customer care");
	    			System.out.println("press 9 to go back to previous menu");
	    			cardsSection();
	    			break;
	    			
	    		case 9:
	    			System.out.println(" go back to main menu");
	    			BankTeleCaller.main(null);
	    			break;
	    		    			
	    		default:
	    				System.out.println("plz press valid key:");
	    				cardsSection();
	    		}
	        	
	        	
	        
	        }
	        
	        else{
	        	
	        	System.out.println("enter valid account no");
	        //	System.out.println("press 9 go back account no ");
	        	cardsSection();
	        	
	      
	        
		
	        }
		
		*/
		
		
		
		
		int s=sc.nextInt();
		if(s==1){
			System.out.println("enter your credit card number:");
			long accountno=sc.nextLong();
		    String b=String.valueOf(accountno);
		    int leng=b.length();
		        if(leng>=8 && leng<=16){
		        	System.out.println("Thank you for account number");
		 // Credit card 
		        	System.out.println("press 1 to block your card");
		   		 
		        	System.out.println("press 2 to speak customer care");
		   		 
		        	System.out.println("press 9 to go back to previous menu");
		   		 
		        	
		        	int c=sc.nextInt();
		        	 if(c==1){
		        			System.out.println("block your card");
		        			System.out.println("press 9 to go back to previous menu");
		        			cardsSection();
		        	 }
		        	 else if(c==2){
		        		 System.out.println("speak customer care");
		        	//	 System.out.println("press 9 to go back to previous menu");
		        			cardsSection();
		        //			 System.out.println("press 9 to go back to previous menu");
		        		//	BankTeleCaller.main(null);
		        			
		        	 }
		        	 else{
		        		 System.out.println("plz enter 9 previes mainu");
		        		 BankTeleCaller.main(null);
		        	 }
		        
			}else{
				System.out.println("invalid no try again:");
				cardsSection();
				//BankTeleCaller.main(null);

			}
			
		}
		else if(s==2){
			System.out.println("please enter your debit card number number:");
				long accountno=sc.nextLong();
			    String b=String.valueOf(accountno);
			    int leng=b.length();
			        if(leng>=8 && leng<=16){
			        	System.out.println("Thank you for account number");
			   		 // debit card 
			   		        	System.out.println("press 1 to block your card");
			   		   		 
			   		        	System.out.println("press 2 to speak customer care");
			   		   		 
			   		        	System.out.println("press 9 to go back to previous menu");
			   		   		 

					        	int c=sc.nextInt();
					        	 if(c==1){
					        			System.out.println("block your card");
					        			 cardsSection();
					        			
					        	 }
					        	 else if(c==2){
					        		 System.out.println("speak customer care");
					        		 cardsSection();
					        	 }
					        	 else{
					        		 System.out.println("plz enter 9 previes mainu");
					        		 cardsSection();
					        	 }
			   
			        }
			        else {
			        	System.out.println("press 9 to go to previous menu");
			        	BankTeleCaller.main(null);
			        }
	
	}  
	}
	}


public class BankTeleCaller {

	public static void main(String[] args) {
		

		System.out.println("press 0 for exit:");
		System.out.println("press 1 for loan:");
		System.out.println("press 2 for saving account:");
		System.out.println("press 3 for current account:");
		System.out.println("press 4 for card :");
	
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//while(n!=0){
			switch(n){
			case 0:
				System.out.println("exit");
		        break;
		        
			case 1:
				System.out.println("loans Section");
				bank.LoanSection();
				
				break;
				
			case 2:
				System.out.println(" enter your Saving account:");
				bank.Savingsaccount();
				break;
				
				
			case 3:
				System.out.println("enter Current account number");
				bank.Currentaccount();
				break;
				
				
			case 4:
		//		System.out.println("cards section ");
				bank.cardsSection();
				break;
				
			default:
				System.out.println("plz press valid key:");
			}
		}

//	}

}
