
public class LoopsTesting {

	public static void main(String[] args) {
       
		loop1:
			for(int i=0; i<=2; i++)
			{
				loop2:
					for(int j=0; j<=2;j++)
					{
						if(j==1)
						{
							break loop2;
						}
						
						else
						{
							System.out.println(i+"   "+j);
						}
					}
			}
	}

}
