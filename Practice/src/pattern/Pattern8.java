package pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int n=4;int star=1; int space=n*2-2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space-=2;
		}

	}

}
