package pattern;

public class Pattern11 {

	public static void main(String[] args) {
	int n=4;int star=n;int space=0;
	for(int i=1;i<=n*2-1;i++)
	{
		for(int j=1;j<=star;j++)
		{
			if(j==star)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			if(j==1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		if(i<n)
		{
			star--;
			space+=2;
		}
		else
		{
			star++;
			space-=2;
		}
	}

	}

}
