package src;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "auma";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = s.charAt(i) + r;
		}
		if (s.equals(r))

			System.out.println("pallindrome");
		else
			System.out.println("not palindrome");

	}

}
