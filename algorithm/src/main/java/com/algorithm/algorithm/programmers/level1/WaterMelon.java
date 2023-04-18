package com.algorithm.algorithm.programmers.level1;

public class WaterMelon {
	//수박수박수박수박수박수?
	public static void main(String[] args) {
		int n = 3;
//		int n = 4;
		System.out.println(solution(n));
	}
	
	public static String solution(int n) {
		String answer = "";
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				answer = answer + "수";
			} else {
				answer = answer + "박";
			}
		}
		return answer;
	}
	
}
