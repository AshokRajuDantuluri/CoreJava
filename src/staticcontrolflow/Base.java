package staticcontrolflow;

public class Base {
	
     static int i = 10;   // 1-->0-->10
     
     static //2
     {
    	 m1();
    	 System.out.println("First static block"); //op2
     }
     
     public static void main (String[] args) // 3
     {
    	   m1();
    	   System.out.println("Main Method"); //op4
     }
     
     public static void m1() //4
     {
    	 System.out.println(j);  // op1-->0    op3-->20
     }
     
     static int j = 20; //5 -->0 [RIWO] -->20
     
     //0
     //First static block
     //20
     //Main Method
}
