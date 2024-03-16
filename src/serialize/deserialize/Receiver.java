package serialize.deserialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
      
		FileInputStream fis  = new FileInputStream("abc.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Ashok a = (Ashok)ois.readObject();
		System.out.println(a.i);
		System.out.println(a.j);
	}

}
