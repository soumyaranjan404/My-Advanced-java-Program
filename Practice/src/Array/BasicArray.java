package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BasicArray  implements ArrayInterface {

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BasicArray bc = new BasicArray();
		int b[]=null;
		try {
			b = bc.addElementAtFirst(br,8);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
		for(int d:b)
		{
			System.out.print(d);
		}
	}

	@Override
	public int[] addElementAtFirst(BufferedReader br,int element) throws NumberFormatException, IOException {
		int a[]= new int[10] ;
		
		
		int i=0; int last=0;
		for( i=0;i<(a.length)/2;i++)
		{  
			a[i]=Integer.parseInt(br.readLine());

		}
		
		last=i-1;
		
		for(int j=last; j>=0;j--)
		{
			a[j+1]=a[j];
		}
		a[0]=element;
		
		
		return a;
	}

	@Override
	public int[] addElementAtPossition(int index, int element) {
		
		return null;
	}

}
