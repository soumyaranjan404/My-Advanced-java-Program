package src;

public class PrintDup {

	public static void main(String[] args) {
		String s = "aabbcdd";
		String p = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			
				int count = 0;
				
			
				while (j<s.length() ) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
						j++;
					} else {
						
						break;
					}
				}

				i = j - 1;
		
				
			
				p = p+s.charAt(i)+ count;
			
			
			
		}
		System.out.println(p);
	}
}
