package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		//<- this needs changing
		int c = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				c = c+1;
			}	
		}
		return c;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				j = j+1;
			}
		}
		return j;
	}

	public static Double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double w = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>=w) {
				w = peeps.get(i);

			}	

		}
		return w;

	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String m = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length()>=m.length()) {
				m = words.get(i);
			}
		}
		return m;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String o = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains(o)) {
				System.out.println("test");
			}
		}
		return o;
	}

	//Add other methods here
}