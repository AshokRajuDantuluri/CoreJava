package serialize.deserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializaInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Dog d = new Dog();
		  d.i=888; // Non serializable area
		  d.j=999; // serializable Area
		
		
		FileOutputStream fos  = new FileOutputStream("abc.ser");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		System.out.println("Serialization Started");
		oos.writeObject(d); // i=0; j=999;

		FileInputStream fis  = new FileInputStream("abc.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		System.out.println("De-Serialization Started");
		Dog d1 = (Dog)ois.readObject();
		
		System.out.println(d1.i +"************"+ d1.j);

	}

}


class Cat   {
	
	
	int i = 10;
	
	Cat()
	{
		System.out.println("Parent Dog Constructor");
	}
	
}

class Dog extends Cat implements Serializable
{
	
   int j = 20;
   
   Dog()
	{
		System.out.println("Child Dog Constructor");
	}


}