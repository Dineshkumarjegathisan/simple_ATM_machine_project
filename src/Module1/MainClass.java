package Module1;
import Module1.AccountDetails;
import Module1.CustomerDetails;
import java.util.Scanner;
public class MainClass 
{
	public static void main(String[] args)
	{
		
		AccountDetails A1=new AccountDetails();
		CustomerDetails cp=new CustomerDetails();
		
	     //String pw =cp.getPassword();
	     
	  /*char[] pswd	=cp.getP_W_D();
	    System.out.println(pswd);
		Password password=new Password();
		password.reAssianPWD();
		char[] pwd =password.reAssianPWD();
		System.out.println(password.reAssianPWD());*/
			
		Scanner sc1=new Scanner(System.in);
		while(true)
		{
		System.out.println("Please Enter Your AccountNumber");
		
		int AccountNumber=sc1.nextInt();
		if(A1.AccNo(AccountNumber))
		{
			boolean result = true;
			System.out.println(cp.getName());
		do {
			System.out.println(" --------------------------------------------------   ");		
			System.out.println("|  Press 1 for DdepositAmmount in    SavingAccount   |");
			System.out.println("|  Press 2 for WithDrawAmoun   in    SavingAccount   |");
			System.out.println("|  Press 3 for CheckBalance    in    SavingAccount   |");
			
			System.out.println("  *************************************************   ");
			
			System.out.println("|  Enter 4 for DepositAmmount  in    LoanAccount     |");
			System.out.println("|  Press 5 for WithdrawAmmount in    LoanAccount     |");
			System.out.println("|  Press 6 for CheckBalance    in    LoanAccount     |");
			System.out.println("|  Press 7 for Exist                                 |");
			System.out.println(" --------------------------------------------------   ");
			
			
			int choose=sc1.nextInt();
			switch(choose)
			{
			case 1:{
				System.out.println("Eneter Deposit Ammount in SavingAccount");
				double ammount = sc1.nextDouble();
				//A1.SavingAccountDeposit(ammount);
				
				double DepositAmmount=A1.SavingAccountDeposit(ammount);//access saving account and store DepositAmmount
																	  // reference variable 
				System.out.println("Balance in Saving Account After Deposit :"+DepositAmmount);
			       }break;
			
			case 2:{
				System.out.println("Enter Withdraw Ammount");
				double ammount =sc1.nextDouble();
				double WithdrawAmmount=A1.SavingAccountWithdraw(ammount);
				System.out.println("Balance in Saving Account After Withdraw :"+WithdrawAmmount);
				
				   }break;
				   
			case 3:
			{
				CustomerDetails c3= new CustomerDetails();
				double balance =c3.getSavingAccount();
				//balance=balance-WithdrawAmmount;
				System.out.println("Total Balance :"+balance);	
			}break;
			case 4:
		      {
		    	  System.out.println("Enter Deposit Ammount in LoanAccount");
		    	  double ammount=sc1.nextDouble();
		    	  double DepositAmmount=A1.LoanAccountDep(ammount);
		    	  System.out.println("Balance in LaonAccount After Deposit :"+DepositAmmount);
		      }break;
		      
			case 5:
			{
				System.out.println("Enter Withdraw Ammount in LoanAccount");
				double ammount=sc1.nextDouble();
			  double WithdrawAmmount=A1.LoanAccountWithdraw(ammount);
			  System.out.println("Balance in LoanAccount After Withdraw :"+ammount);
				
			}break;
			
			case 6:
			{
				CustomerDetails c4= new CustomerDetails();
				double balance =c4.getLoanAccount();
				//A1.LoanAccountDep(Ammount)
				//balance=balance-WithdrawAmmount;
				System.out.println("Total Balance :"+balance);	
				
			}break;
			case 7:
			{
				System.out.println("<<<<< Thanks for Comming >>>>>");
				result=false;
				
			}break;
			
		 }		
		} while (result);	
	}//account number braciesss
		else
		{
			System.out.println("Invalid Account Number");
		}	
		//sc1.close();
	}
 }
	
}
