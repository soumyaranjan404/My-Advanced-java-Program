package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star=1; int n=5; int space = n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			for(int j=1;j<=star;j++)
			{
				if(i==n||j==1 || j==star)
				{
					System.out.print("*  ");
				}
				else
					System.out.print("   ");
				
				
			}
			System.out.println();
			star+=2;
			space--;
		}
		

	}

}
