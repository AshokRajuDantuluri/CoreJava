package oops;

public class ImplementationClass extends ATMServices {

	int balance = 2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementationClass ic = new ImplementationClass();
		System.out.println("Available Balance :"+ic.checkBalance(ic.balance));
		ic.printPassbook();
		ic.setPin(789);
		System.out.println("withdraw Amount :"+ ic.withdraw(150));

	}

	@Override
	double checkBalance(double balance) {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	void setPin(int pin) {
		//
		// TODO Auto-generated method stub
		System.out.println(pin + " : is setted sucessfully");
	}

	@Override
	void printPassbook() {
      
		System.out.println("Passbook is printed sucessfully");
	}

	@Override
	int withdraw(int withdrawAmount) {
		
		int remainingBalance = this.balance - withdrawAmount-2;
		System.out.println("Remaining Balance is : "+ remainingBalance );
		return withdrawAmount;
	}

}
