package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PickTwoAndAddMore {
	//두 개 뽑아서 더하기
	public static void main(String[] args) {
//		int[] numbers = {2,1,3,4,1};
		int[] numbers = {5,0,2,7};
		System.out.println(Arrays.toString(solution(numbers)));
	}
	
	public static int[] solution(int[] numbers) {
		HashSet<Object> hashSet = new HashSet<>();
		int len = numbers.length;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				hashSet.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = new int[hashSet.size()];
		Iterator<Object> iter = hashSet.iterator();
		int c = 0;
		while(iter.hasNext()) {
			answer[c++] = (int) iter.next();
		}
		Arrays.sort(answer);
		return answer;
	}
}
