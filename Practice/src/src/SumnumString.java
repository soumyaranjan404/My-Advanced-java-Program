package src;

public class SumnumString {

	public static void main(String[] args) {
	String s= "java143";
	int sum=0;
	String m="";
	for(int i=0; i<s.length();i++)
	{
		if(s.charAt(i)>48 && s.charAt(i)<59)
		{
			sum+=(s.charAt(i)-48);
		}
		else
		{
			m+=s.charAt(i);
		}
	}
	System.out.println(m+sum);
	}

}
