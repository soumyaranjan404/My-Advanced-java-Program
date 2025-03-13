package pattern;

public class Pattern3 {

	public static void main(String[] args) {
	int star=5, n=5 , space=0 ;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=star;j++)
		{
			if(i==1 || j==1 || j==star )
			{
				System.out.print("* ");
			}
			else
				System.out.print("  ");
		}
		System.out.println();
		star--;
		space++;
	}
	}

}
