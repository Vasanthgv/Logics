package revision;

public class SubString2 {

	public static void main(String[] args) {
		String str = "arrmskvccdjkhhtroyz";
		String[] b = str.split("");
		String t = "",t1 = "",y="";
		int d = 0,h = 123;
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
				else {
					t1=t1+" ";
				}
				h = d + 1;
				t = b[i];
			}
		}
		String[]t2=t1.split(" ");
		for(int i=0;i<t2.length;i++) {
			if(t2[i].length()>t2[1].length()) {
		
				y=t2[i];
			}
		}
		System.out.println(y);
	}
}
