package lb5;

import java.util.Scanner;

public class Two {
	Scanner sc = new Scanner(System.in);
	private String s;
	
	public void work() {
		char word=' ';
		int w=0;
		try
		{
			System.out.println("Введите строку: ");
			s = sc.nextLine();
			if(s.isEmpty()) throw new TestErrorException();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==' ') {
					w++;
					if(w==2) word=s.charAt(i+1);
				}
			}
			if(w<2) throw new TestErrorException();
		}
		catch(TestErrorException e) {
			System.out.println("Error print!");
			System.exit(0);
		}
		System.out.println("Буква: "+word);
		
	}
}
