package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class TheNearSameLetterCloseTo {
	//가장 가까운 같은 글자
	public static void main(String[] args) {
		String s = "banana";
		System.out.println(Arrays.toString(solution(s)));
	}
	
	public static int[] solution(String s) {
		int[] answer = new int[s.length()];

        for(int i=0;i<s.length();i++){
            String subStr = s.substring(0,i);
            if(subStr.indexOf(s.charAt(i)) == -1) {
            	answer[i] = -1;
            } else {
            	answer[i] = i - subStr.lastIndexOf(s.charAt(i));
            }
        }
        return answer;
	}
}
