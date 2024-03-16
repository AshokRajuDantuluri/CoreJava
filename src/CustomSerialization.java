import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialization {
	

		
	public static void main(String[] args) throws Exception

	{
		
		Account a = new Account();
		
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a1 =(Account)ois.readObject();
        
        System.out.println(a1.password +"******"+a1.pin);
        
	}

	}

