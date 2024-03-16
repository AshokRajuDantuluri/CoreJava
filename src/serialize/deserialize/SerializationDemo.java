package serialize.deserialize;

import java.io.*;

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		Human human = new Human();
		
		//serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(human);
	

		
		
		
		//deserialization
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Human  hu  = (Human) ois.readObject();
		System.out.println(hu.i);
		System.out.println(hu.j);
		System.out.println(hu.password);
		
		
      
		
	}

}



class Human implements Serializable
{
	
	   int i = 10;
	   int j = 20;
	  transient String password = "Ashok";
	  
	  
	  //customized serialization
	  
	  private void writeObject(ObjectOutputStream oos) throws IOException
	  {
		    oos.defaultWriteObject();
		    String epassword = "1223"+password;
		    oos.writeObject(epassword);
	  }
	  
	  private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
	  {
		    ois.defaultReadObject();
		    
		    String readpassword = (String) ois.readObject();
		    password = readpassword.substring(4);
	  }
}



