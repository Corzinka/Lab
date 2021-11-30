package lb5;

import java.util.Scanner;

public class Three {
	Scanner sc = new Scanner(System.in);
	private String s;
	private String s1;
	private String s2;
	private String find = " и ";
	private int findindex;
	void work() {
		try
		{
			System.out.println("¬ведите строку: ");
			s = sc.nextLine();
			if(s.isEmpty()) throw new TestErrorException();
			findindex = s.indexOf(find);
			if(findindex == -1) throw new TestErrorException();
			while(findindex != -1) {
				s1 = s.substring(0,findindex);
				s2 = s.substring(findindex + 3);
				s = s1+" или "+s2;
				findindex = s.indexOf(find);
			}
		}
		catch(TestErrorException e) {
			System.out.println("Error print");
			System.exit(0);
		}
		System.out.println(s);
	}
}
