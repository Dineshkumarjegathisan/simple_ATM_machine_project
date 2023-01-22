package Module1;

public class CustomerDetails
{
	String Name="DineshkumarJegathisan";
	float phoneNumber=9043734070f;
	double SavingAccount=50000;
	double LoanAccount=50000;
	int AccNo=257401;
	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	//String password="Abc1234@";
	//public String getPassword() {
	//	return password;
	//}

	//public void setPassword(String password) {
		//this.password = password;
	//}

	//Password password=new Password();
	/*char[] P_W_D =Password.generatepassword(9);
	
	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public char[] getP_W_D() {
		return P_W_D;
	}

	public void setP_W_D(char[] p_W_D) {
		P_W_D = p_W_D;
	}*/

	public CustomerDetails()
	{
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getPhoneNumber() {
		return phoneNumber;
	}

	public double setPhoneNumber(float phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}

	public double getSavingAccount() {
		return SavingAccount;
	}

	public double setSavingAccount(double savingAccount) {
		return SavingAccount = savingAccount;
	}

	public double getLoanAccount() {
		return LoanAccount;
	}

	public double setLoanAccount(double loanAccount) {
		return LoanAccount = loanAccount;
	}
}
