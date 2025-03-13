package src;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s= "aabcd";
 for(int i=0;i<s.length();i++) {
	 String m="";
	 m=m+s.charAt(i);
	 System.out.println(m);
	 for(int j=i+1;j<s.length();j++)
	 {
		 m+=s.charAt(j);
		 System.out.println(m);
	 }
 }
	}

}
