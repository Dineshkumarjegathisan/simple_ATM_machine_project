package Module1;

public class AccountDetails
{
	public double SavingAccountWithdraw(double Ammount)//method declaration with parameter 
	{
		CustomerDetails c1=new CustomerDetails();//create the object for customer details 
		
		double savcc_wid=c1.getSavingAccount();//to access SavingAccount and store it in Savcc_wid reference variable
	   //String name	=c1.getName();
		
		double SavingAccount=0;//define global variable
		 if (Ammount>0)
		   {
		   System.out.println("Withdraw ammount="+Ammount);
		    SavingAccount =savcc_wid-Ammount;//condition
		   System.out.println("current balance in savingAccount="+SavingAccount);
		   }
		   else 
		   {
			   System.out.println("Enter valid Amount");
		   }
			
		return SavingAccount;//return Saving Account because we use return type is data type
	}
	
	public double SavingAccountDeposit(double Ammount)
	{
		CustomerDetails c2=new CustomerDetails();
		double savacc_Dep=c2.getSavingAccount();
		double SavingAccount=0;//declare global variable
		 if (Ammount>0)
		   {
		   System.out.println("depositing ammount="+Ammount);
		   SavingAccount =savacc_Dep+Ammount;
		   System.out.println("current balance in savingAccount="+SavingAccount);
		   }
		   else 
		   {
			   System.out.println("Enter valid Amount");
		   }
		return SavingAccount;	
	}
	
	public double LoanAccountDep(double Ammount)
	{
		
		CustomerDetails c3=new CustomerDetails();
	     double	Loacc_dep=c3.getLoanAccount();
	     double LoanAccount=0;
	     
	     if(Ammount>0)
		 {
			 System.out.println("depositing ammount="+Ammount);
			 LoanAccount=Loacc_dep-Ammount;
			 System.out.println("current balance in LoanAccount="+LoanAccount);
	     }
	     else 
		 {
				   System.out.println("Enter valid Amount");
	     }
	     
		return LoanAccount;		
	}
	public double LoanAccountWithdraw(double Ammount)
	{
		CustomerDetails c4=new CustomerDetails();
		double Loan_Wid=c4.getLoanAccount();
		double LoanAccount=0;
		
		   if (Ammount>0)
			 {
				 System.out.println("withdraw amount="+Ammount);
				 LoanAccount=Loan_Wid+Ammount;
				 System.out.println("current balanace in LoanAccount="+LoanAccount);
		     }
		 else 
		   {
			System.out.println("limit reached");
		   }
		return LoanAccount;
		
	}

	public boolean AccNo(int Accno) 
	{
		boolean result=false;
		CustomerDetails c5=new CustomerDetails();
		int AccNo=c5.getAccNo();
		//int AccNo=0;
		if(AccNo==Accno)
		{
			result=true;
			System.out.println("WelCome your Account");
		}
		else
		{
			System.out.println("Enter Valid AccountNumber ");
		}
		return result;
		
	}
		

}
