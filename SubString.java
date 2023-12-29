package revision;

public class SubString {

	public static void main(String[] args) {
		String str = "arrmskvccd";
		String[] b = str.split("");
		String t = "",t1 = "";
		int d = 0;
		int h = 123;
		for (int i = 0; i < b.length; i++) {
			int c = 0;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].equals(b[j])) {
					c++;
					b[j] = "$";
				}
			}
			if (c == 0 && b[i] != "$") {
				d = i;
				if (d == h) {
					t1 = t1 + t + b[i];
					b[i] = "";
				}
				h = d + 1;
				t = b[i];
			}
		}
		System.out.println(t1);
	}
}
