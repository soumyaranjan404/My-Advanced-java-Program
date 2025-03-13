package pattern;

public class MirrorRightAngle {

	public static void main(String[] args) {
		int n=5;
		int star=n;
		for(int i=1;i<=(n*2);i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			if(i<5)
			{
				star--;
				
			}else if(i==n)
			{
			
			}
			else {
				star++;
			}
		}

	}

}
