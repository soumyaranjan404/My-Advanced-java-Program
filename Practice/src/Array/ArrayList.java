package Array;

public class ArrayList<T> {

	private int count=0;
	private Object []a= new Object[5];
	 public void add(int element)
	 {
		checkSize();
		
		a[count]=element;
		count++;
	 }
	 
	 public void add(int index, T element)
	 {
		 validateSize( index);
		 for(int i=count-1;i>=index;i--) {
			 a[i+1]=a[i];
		 }
		 a[index]=element;
		 
	 }
	 public T remove(int index)
	 {
		  validateSize(index);
		  T val = (T)a[index];
		  for(int i=index;i<count-1;i++)
		  {
			  a[i]=a[i+1];
		  }
		  a[count-1]=null;
		  count--;
		  return val;
	 }
	 public void set(int index,T element)
	 {   validateSize(index);
		 a[index]=element;
	 }
	 
	 public void validateSize(int index)
	 {
		 if(index<0 || count<=index)
		 { 
			 throw new ArrayIndexOutOfBoundsException();
		 }
		 else
		 {
			 checkSize();
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
