//Name: Alexander Ross
//Student number:300213662

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class SuggestAFriend {

	/**
	 * Given social network g and name s, returns an ArrayList of all
	 * the names that this social network would suggest s may know
	 * @param g
	 * @param s
	 */
	public static ArrayList<String> suggest(Graph g, String s) {
		// First, let's make sure name s exists in this graph g
		if (g.containsName(s) == false) {
			System.err.println(s + " does not exist in this graph");
			return null;
		}
		// DONE: Find and store the friends of s
		Set<String> Layer1 = new HashSet<String>(g.getNbrs(s));
		// DONE: Find the list of friends of the friends of s
		// Don't forget to exclude s from this list
		Map<String, Integer>Layer2=new HashMap<>();
		for(String FriendOfs : Layer1)
			for(String f : g.getNbrs(FriendOfs)) {
				Layer2.remove(s);
				if(Layer2.containsKey(f)==false) {
					Layer2.put(f, 1);
				}
				if(Layer2.containsKey(f)==true) {
					int C1=Layer2.get(f);
					C1++;
					Layer2.put(f, C1);
				}	
			}
		for(String L1Friends : Layer1 ) {
			if(Layer2.containsKey(L1Friends)) {
				Layer2.remove(L1Friends);
			}

		}

		int bestSug=(Collections.max(Layer2.values()));
		ArrayList<String> recFriendArr = new ArrayList<String>();
		for(String S : Layer2.keySet()) {
			if(Layer2.get(S)==bestSug) {
				recFriendArr.add(S);
			}
		}
		return recFriendArr;

		// Adding some bonus marks to all the students
		// DONE: Of all the friends of friends of s, find the ones with
		// the largest number of common friends with s
	}

}





