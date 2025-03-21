package Array;

import java.util.EmptyStackException;

public class Queue<t> {
	private int count=0;
	private Object []a= new Object[5];
	public void add(t element)
	{
		checkSize();
		if(count==0)
		{
			a[0]=element;
			count++;
		}
		else
		{
			for(int i=count-1;i>=0;i--)
			{
				a[i+1]=a[i];
			}
			a[0]=element;
			count++;
		}
		
	}
	public t remove()
	{
		checkElement();
		t val = (t)a[count-1];
		a[count-1]=null;
		count--;
		return val;
		
	}
	 public void checkElement()
	 {
		 if(count==0)
		 {
			 throw new EmptyStackException();
		 }
	 }
	
	public void checkSize()
	{
		if(count>=a.length)
		{
			Object[] newa = new Object[a.length*2];
			for(int i=0;i<count;i++)
			{
				newa[i]=a[i];
			}
			a=newa;
		}
	}
	public String toString()
	{ 
		String s="[";
		for(int i=count-1;i>=0;i--)
		{
			s=s+(t)a[i];
			
			if(i>0)
			{
				s=s+",";
			}
		}
		return s+"]";
		
				
	}

}
