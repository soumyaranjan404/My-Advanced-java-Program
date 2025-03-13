package src;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="5689";
		int sum=0;
		for(int i =0;i<s.length();i++)
		{
			sum+=(s.charAt(i)-48);
		}
System.out.println(sum);
	}

}
