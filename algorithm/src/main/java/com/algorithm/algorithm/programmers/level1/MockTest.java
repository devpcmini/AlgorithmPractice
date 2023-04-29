package com.algorithm.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTest {
	//모의고사

	static int[] SPG1 = {1,2,3,4,5};
	static int[] SPG2 = {2,1,2,3,2,4,2,5};
	static int[] SPG3 = {3,3,1,1,2,2,4,4,5,5};
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
//		int[] answers = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answers)));
	}
	
	public static int[] solution(int[] answers) {
		int rslt1 = question(SPG1,answers);
		int rslt2 = question(SPG2,answers);
		int rslt3 = question(SPG3,answers);
		int max = Math.max(Math.max(rslt1, rslt2),rslt3);
		List<Integer> list = new ArrayList<>();
		if(max == rslt1) { list.add(1); }  
		if(max == rslt2) { list.add(2); } 
		if(max == rslt3) { list.add(3); }
		Collections.sort(list);
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	public static int question(int[] arr, int[] answers) {
		int result = 0;
		int count = 0;
		boolean flag = true;
		while(flag) {
			for(int i=0; i<answers.length; i++) {
				if(answers[i] == arr[count++]) {
					result++;
				}
				if(count == arr.length) {
					count = 0;
				}
				if(i == answers.length-1) {
					flag = false;
				}
			}
		}
		return result;
	}
}
