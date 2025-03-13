package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int star=1;int n=4;
		for(int i=1;i<=n*2+1;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(j==1 || j==star)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
			if(i<n)
			{
				star++;
						
			}
			else
			{
				star--;
			}
		}

	}

}
