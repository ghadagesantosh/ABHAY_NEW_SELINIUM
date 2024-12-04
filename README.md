package MyJavaCodes;

import java.util.Scanner;

public class AccountDetails extends CustomerDetails{
	
	public static long accountNumber;
	public double Balance=0;
		
	AccountDetails(String CustomerName,long PhoneNumber,long customerNumber,String Address) 
	{
		super(CustomerName,PhoneNumber,customerNumber,Address);
		this.accountNumber=accountNumber;
		this.Balance=0;
	}
	
	public void Deposit() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the money do you want to deposit \n");
		double money = sc.nextDouble();
		
		Balance=Balance+money;
		Menu();
	}
	
	public void Withdrawal() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the money do you want to Withdraw \n");
		double cash = sc.nextDouble();
		if(cash<=0)
		{
			System.out.println("Please enter amount more than 0");
			
		}else if(cash<Balance)
		{
			Balance=Balance-cash;
		}else 
		{
			System.out.println("Insufficient Funds");
		}
		
		Menu();
	}
	public void getBalanceDetails() 
	{
		System.out.println("Customer Name is : "+CustomerName);
		System.out.println("Customer Number is : "+CustomerNumber);
		System.out.println("Account No is : "+accountNumber);
		System.out.println("Total Bal is : "+Balance);
		Menu();
		
	}
	public void Menu()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Which activity do you want to perform \n");
		System.out.println("1.Customer Details 2.Deposit and 3.Withdrawal 4.Balance 5.Quit : \n");
		int a = sc.nextInt();
		if(a==1){
			getCustomerDetails();
		}else if(a==2){
			Deposit();
		}else if(a==3){
			Withdrawal();
		}else if(a==4){
			getBalanceDetails();
		}else if(a==5){
			System.out.println("Thank You !!!!");
			System. exit(0);
		}else
		{
			System.out.println("Please enter correct no :");
		}
		Menu();
		
	}
	
      public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name : \n");
		String CustName = sc.nextLine();
		System.out.println("Enter Phone Number  :\n");
		long PhnNumber =sc.nextLong();
		System.out.println("Enter Customer Number : \n");
		long CustNumber =sc.nextLong();
		System.out.println("Enter Address : \n");
		sc.nextLine();
		String Add =sc.nextLine();
		
		System.out.println("Enter Account no : \n");
		accountNumber =sc.nextLong();

		AccountDetails ad = new AccountDetails(CustName, PhnNumber, CustNumber, Add);
		 
		ad.Menu();
		

	}


}


----------------------------------------------------------------------------------------------------------------------------------
//BaseClass
package MyJavaCodes;

public class CustomerDetails {
	
		public String CustomerName;
		public long PhoneNumber;
		public long CustomerNumber;
		public String Address;

	    CustomerDetails(String CustomerName, long PhoneNumber, long customerNumber2, String Address)
		{

			this.CustomerName=CustomerName;
			this.PhoneNumber=PhoneNumber;
			this.CustomerNumber=customerNumber2;
			this.Address=Address;
			
		} 

		public void getCustomerDetails()
		{
			System.out.println("Customer Name is : "+CustomerName);
			System.out.println("PhoneNumber is : "+PhoneNumber);
			System.out.println("CustomerNumber is : "+CustomerNumber);
			System.out.println("Address is : "+Address);
			
			AccountDetails ad = new AccountDetails(CustomerName, PhoneNumber, CustomerNumber, Address);
			ad.Menu();
			
			
		}
		
		

}


