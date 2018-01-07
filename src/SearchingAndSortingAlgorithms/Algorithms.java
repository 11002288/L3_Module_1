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

	public static int findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		
		//for (int i = 0; i < peeps.size(); i++) {
		//	if (peeps.get(i)==) {
				
//	}	
	//	}
		return (int) 6.6;
	}
	
	//Add other methods here
}