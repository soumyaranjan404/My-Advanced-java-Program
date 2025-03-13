package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int  star=5;
		int n=4;
		for(int i = 1;i<=(n*2-1);i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==(n*2-1)|| i==1 || j==1 || j==star )
				{
					System.out.print("* ");
				}
				else if(i%2!=0)
				{
					if(j%2==0)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				else if(i%2==0)
				{
					if(j%2==0)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				
					
				
			}
			System.out.println();
			
		}
	}

}
