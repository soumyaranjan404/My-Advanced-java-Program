package pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int n=4;int star=1;int space=n-1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<n)
			{
				star+=2;
				space--;
			}
			else
			{
				space++;
				star-=2;
			}
		}

	}

}
