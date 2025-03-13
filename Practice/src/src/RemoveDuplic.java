package src;

public class RemoveDuplic {

	public static void main(String[] args) {
		String name= "geeks";
		String newName="";
		int a[]= new int[256];
		for(int i=0;i<name.length();i++)
		{
			if(a[name.charAt(i)]==0)
			{
				newName+=name.charAt(i);
				a[name.charAt(i)]++;
			}
			
			
			
		}
		System.out.println(newName);
		
	}

}
