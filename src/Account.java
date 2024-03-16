import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	 
	String userName = "AshokRaju";
	 
	transient String password = "Ashok@789";
	 
	transient int pin = 7897;
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		 oos.defaultWriteObject();
		 String pwd = "123"+password;
		 int epin = 222+pin;
		 oos.writeObject(pwd);
		 oos.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		 ois.defaultReadObject();
		 String pwd= (String)ois.readObject();
		 password = pwd.substring(3);
		 int epin = (int)ois.readInt();
		 pin = epin-222;
		 
	}

}
 

