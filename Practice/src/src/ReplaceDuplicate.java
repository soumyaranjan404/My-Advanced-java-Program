package src;

public class ReplaceDuplicate {

	public static void main(String[] args) {
	String s= "geeksforgeeks";
	String m="";
	String k="";
	int i=0;
	while(s.length()!=0) {
		char c=s.charAt(i);
	  m=s.replace(c+"", "");
	  int length = s.length()-m.length();
	  k=k+s.charAt(i)+length;
	  
;	}

	}

}
