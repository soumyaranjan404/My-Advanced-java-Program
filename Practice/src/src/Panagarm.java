package src;

public class Panagarm {

	public static void main(String[] args) {
		String s = "ghijklmnopqrsxzzzzyxx";
		char c = 'a';
		int count = 0;

		if (s.length() >= 26) {
			while (c <= 'z') {

				String s1 = s.replace(c + "", "");
				int len = s.length() - s1.length();
				if (len == 0) {
					count++;
					System.out.println("not panagram");
					break;
				}
				c++;
			}
			if (count == 0) {
				System.out.println("panagarm");
			}
		} else {
			System.out.println("not a panagarm");
		}

	}

}
