package serialize.deserialize;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ExternalizationConcept ec = new ExternalizationConcept("Ashok", 10, 20);
		FileOutputStream fos  = new FileOutputStream("abc.ser");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(ec);

		FileInputStream fis  = new FileInputStream("abc.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		ExternalizationConcept d1 = (ExternalizationConcept)ois.readObject();
		System.out.println(d1.s);
		System.out.println(d1.i);
		System.out.println(d1.j);



	}

}



class ExternalizationConcept implements Externalizable
{
	
	String s;
	int i;
	int j;
	
	public ExternalizationConcept()
	{
		System.out.println("No-Argument Constructor");
	}
	public ExternalizationConcept(String s, int i, int j)
	{
		 this.s=s;
		 this.i=i;
		 this.j=j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		   out.writeObject(s);
		   out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		    s = (String)in.readObject();
            i=in.readInt();
	}
	



}