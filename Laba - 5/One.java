package lb5;

import java.util.Scanner;

public class One {
	Scanner sc = new Scanner(System.in);
	private String[] s = new String[10];
	void work() {
		try 
		{
			for(int i=0;i<10;i++) {
				System.out.println("¬ведите им€ "+(i+1)+": ");
				s[i] = sc.nextLine();
				for(int j=0;j<s[i].length();j++) {
					if((s[i].charAt(j)>='0'&&s[i].charAt(j)<='9')||s[i].isEmpty()) throw new TestErrorException();
				}
				if(s[i].isEmpty()) throw new TestErrorException();
			}
		}
		catch(TestErrorException e) {
			System.out.println("Error print");
			System.exit(0);
		}
		String c;
		String max="";
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(s[i].charAt(0)<s[j].charAt(0)) {
					c = s[i];
					s[i] = s[j];
					s[j] = c;
				}
				if(max.length()<s[j].length()) {
					max = s[j];
				}
			}	
		}
		for(int i=0;i<10;i++) {
			System.out.println(s[i]);
		}
		System.out.println("max: "+max);
	}
}
