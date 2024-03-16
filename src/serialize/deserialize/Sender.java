package serialize.deserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
           
		Ashok as = new Ashok();
		FileOutputStream fos  = new FileOutputStream("abc.ser");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(as);

	}

}
