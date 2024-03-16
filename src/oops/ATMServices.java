package oops;

public abstract class ATMServices {
	
	abstract double checkBalance(double balance);
	abstract void setPin(int pin);
	abstract void printPassbook();
	abstract int withdraw(int withdrawAmount);

}
