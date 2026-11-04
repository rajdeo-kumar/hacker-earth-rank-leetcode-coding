package com.hackerCoding.hackerearth;

import java.util.HashMap;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		String str = "Programming";

		System.out.println(findMaximumOccuringCharacter(str));
	}

	private static char findMaximumOccuringCharacter(String str) {
		char maxChar = 'a';
		int maxFrequency = 0;

		HashMap<Character, Integer> countMap = new HashMap<>();
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			countMap.put(ch, countMap.getOrDefault(ch, 0) +1);
		}

		for (char ch = 'a'; ch <= 'z'; ch++){
			if(countMap.containsKey(ch) && countMap.get(ch)>maxFrequency){
				maxFrequency = countMap.get(ch);
				maxChar = ch;
			}
		}
		System.out.println(maxFrequency);
		return maxChar;
	}
}
