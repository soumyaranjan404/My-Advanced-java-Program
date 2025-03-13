package Array;

import java.util.NoSuchElementException;

public class Stack<T> {
	private int count=0;
	private Object []a= new Object[5];
	public void push(T element)
	{
		checkSize();
		a[count]=element;
		count++;
	}
	public T pop()
	{  
		validateSize();
		T val=(T)a[count-1];
		count--;
		return val;
	}
	public T peek()
	{ 
		validateSize();
		return (T)a[count-1];
	}
	 public void validateSize()
	 {
		 if(count==0)
		 { 
			 throw new NoSuchElementException();
		 }
		
	 }
	 public void checkSize()
	 {
		 if(count>=a.length)
		 {
			 Object [] newa = new Object[a.length*2];
			 for(int i=0;i<count;i++)
			 {
				 newa[i]=a[i];
			 }
			 a=newa;
			
		 }
	 }
	 public boolean isEmpty()
	 {
		 if(count==0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	 }
	 public String toString()
	 {
		 String s="[";
		 for(int i=0;i<count;i++)
		 {
			 s=s+(T)a[i];
			 if(i<count-1)
			 {
				 s=s+",";
			 }
		 }
		 return s+"]";
	 }

}
