import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class SerializationDemo implements Serializable {
	 
	 Dog d = new Dog();
}	 
class Dog implements Serializable
{
    Cat  c = new Cat();	

}

class Cat implements Serializable
{
  int i = 20;	
}

class Testing {
    public static void main(String[] args) throws Exception
 {
    	SerializationDemo s = new SerializationDemo();
    FileOutputStream fos = new FileOutputStream("abc.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos);
     oos.writeObject(s);

     FileInputStream fis = new FileInputStream ("abc.ser");
    ObjectInputStream ois = new ObjectInputStream (fis);
    SerializationDemo s2 = (SerializationDemo) ois.readObject();

   System.out.println(s2.d.c.i);

  
}


}
