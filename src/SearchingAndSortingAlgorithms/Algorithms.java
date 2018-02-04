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
			if (words.get(i).length()>m.length()) {
				m = words.get(i);

			}
		}
		return m;
	}

	public static boolean  containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		String o = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains(o)) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		for (int j = 0; j < results.size(); j++) {


			for (int i = 0; i < results.size()-1; i++) {
				Double x = results.get(i);
				Double y = results.get(i+1);
				Double z = x;
				if (x > y) {
					x=y;
					y=z;

					results.set(i, x);
					results.set(i+1, y);
				}
			}
		}

		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		for (int j = 0; j < unsortedSequences.size(); j++) {
			
	
		for (int i = 0; i < unsortedSequences.size()-1; i++) {
			String x = unsortedSequences.get(i);
			String y = unsortedSequences.get(i+1);
			String z = x;
			if (x.length() > y.length()) {
				x=y;
				y=z;

				unsortedSequences.set(i, x);
				unsortedSequences.set(i+1, y);

			}
		}}


		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}




	//Add other methods here
}