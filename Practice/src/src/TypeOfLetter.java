package src;

public class TypeOfLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java new Edition#2025";
		String vowel = "";
		String consonant = "";
		String num = "";
		String upper = "";
		String lower = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				upper += s.charAt(i);
				if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
						|| s.charAt(i) == 'U') {
					vowel += s.charAt(i);
				} else {
					consonant += s.charAt(i);
				}

			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				lower += s.charAt(i);
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {
					vowel += s.charAt(i);
				} else {
					consonant += s.charAt(i);
				}
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				num += s.charAt(i);
			} else {
				System.out.println("special character" + s.charAt(i));
			}
		}
		System.out.println(vowel + "  " + consonant + "  " + num + " " + upper + " " + lower);

	}

}
