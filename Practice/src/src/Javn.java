package src;

import java.util.Iterator;

public class Javn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,7,5,6};
		for(int i=1; i<=10;i++)
		{  int count=0;
			for(int j=0; j<a.length;j++)
			{
				if(a[j]==i)
				count++;
				
				
			}
			if(count==0)
				System.out.println(i);
		}
		

	}

}
