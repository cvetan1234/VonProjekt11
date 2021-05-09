package smg4;
import java.util.*;

public class Project11ex2 {
	public static void main(String args[]) {
		//T(n) = n*c + (n-1)*c + (n-2)*c + .... + 1*c = 
		//= c*(1 + ... + n) =
		//= c*n*(n-1)/2
		//= O(n^2)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		LinkedList <Character> max = new LinkedList<>();
		
		for (int i = 0; i < str.length(); i++) {
			LinkedList <Character> list = new LinkedList<>();
			list.add(str.charAt(i));
			
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) > list.getLast()) {
					list.add(str.charAt(j));
				}
			}
			
			if (list.size() > max.size()) {
				max.clear();
				max.addAll(list);
			}
			list.clear();
		}
		
		System.out.println(max.toString());
	}
}
