package revision;

public class SubString1 {
public static void main(String[]args) {
	String str="arrmskvccdjkhhtroyz";
	String[]b=str.split("");
	String t="";
	String t1="";
	String[]r=new String[str.length()];
	for(int i=0;i<b.length;i++) {
		int c=0;
		int d=0;
		String e=" ";
		for(int j=i+1;j<b.length;j++) {
			if(b[i].equals(b[j])) {
				c++;
				b[j]="$";	
			}
		}
		
		if(c==0&&b[i]!="$") {
			t=t+b[i];
		}
		t=t+" ";
	}
	String[]st=t.split("  ");
	int max=0;
	String y="";
	for(int i=0;i<st.length;i++) {
		if(st[i].length()>max) {
			max=st[i].length();
			y=st[i];
		}
	}
	System.out.println(y);
	}

}
