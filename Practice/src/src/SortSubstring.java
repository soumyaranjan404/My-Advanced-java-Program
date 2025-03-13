package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSubstring implements Comparator<String> {
	

	public static void main(String[] args) {
		 String s= "abc";
		 List<String> l= new ArrayList<String>();
		 
		 for(int i=0;i<s.length();i++) {
			 String m="";
			 m=m+s.charAt(i);
			 l.add(m);
			 for(int j=i+1;j<s.length();j++)
			 {   
				 m+=s.charAt(j);
				 l.add(m);
			 }
			
		 }
		Collections.sort(l,new SortSubstring());
		System.out.println(l);
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}

	

}
