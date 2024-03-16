package serialize.deserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Account acc = new Account();
		
		// serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		
		// deserialization
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc1 = (Account)ois.readObject();
		
		System.out.println(acc.userName);
		System.out.println(acc.password);

		
	}

}
 


class Account implements Serializable
{
	
    String userName = "Ashok";
    String password = "Ashok@789";
    
    private void writeObject(ObjectOutputStream oos) throws IOException
    {
    	oos.defaultWriteObject();
    	String epwd = "123"+password;
    	oos.writeObject(epwd);
    	
    }
    
    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
    {
    	
    	        ois.defaultReadObject();
    	        String epwd = (String)ois.readObject();
    	        password = epwd.substring(3);
    }


}