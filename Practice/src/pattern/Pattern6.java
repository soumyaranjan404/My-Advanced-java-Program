package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int star=5;int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=star;j++)
			{
				if(i==3 || j==3)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
