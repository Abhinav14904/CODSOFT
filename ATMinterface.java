import java.util.*;
public class ATMinterface{
		private static Scanner sc =new Scanner(System.in);
		private float balance=0.0f;
    public static void main(String[] args){
		ATMinterface atm=new ATMinterface();
	        atm.runatm();		  
	}

public void runatm(){
	
	boolean bool=true;
while(bool){
	System.out.println();
	System.out.println("choose your option below \n1.Withdraw \n2.Deposit \n3.check Balance\n4.Exit\n(Enter only Numbers 1/2/3/4)");
	int input=sc.nextInt();
	switch(input){
	case 1:
	    Withdraw();
	 break;
	case 2:
		Deposit();
		break;
	case 3:
		CheckBalance();
		break;
	case 4:
		bool=false;
		break;
	default:
		System.out.println("Enter valid option");
	}
System.out.println();
System.out.println("do you want see interface again \n1.yes \n2.no\n(Enter only Numbers 1/2)");

int repeat=sc.nextInt();
bool=repeat==1;
}
}
	public void Withdraw(){
		System.out.println();
		System.out.println("enter the amount: ");
		float withdrawamount=sc.nextFloat();
		if(withdrawamount<=balance){
			balance=balance-withdrawamount;
			System.out.println("you have sucessfully withdrawn amount: "+withdrawamount);
			System.out.println();
			System.out.println("Do  you  want to  check your balance \n1.yes \n2.no\n(Enter only Numbers 1/2)");
			int y=sc.nextInt();
			if(y==1){
				CheckBalance();
				}
			}
			else{
				System.out.println("insufficient balance");;
				}
	}
	public void Deposit(){
		System.out.println();
		System. out.println("Enter the amount to deposit: ");
		float depositamount =sc.nextFloat();
		balance=depositamount+balance;
		System.out.println("you have sucessfully  deposited amount: "+depositamount);
			System.out.println();
			System.out.println("Do  you  want to  check your balance \n1.yes \n2.no\n(Enter only Numbers 1/2)");
			int p=sc.nextInt();
		if(p==1){
				CheckBalance();
				}
			}
					
	
	public void CheckBalance(){
			System.out.println();
			System.out.println("your account balance is: "+balance);
			
	}

}