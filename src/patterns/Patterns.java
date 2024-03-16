package patterns;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		 int length = 10;
		 
		 for(int row=1; row<=length;row++)
		 {
			 for(int column =1; column<=length; column++)
			 {
				 if(row==1 || row== length || row+column == length+1)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 
			 System.out.println();
			 
		 }
	}

}
