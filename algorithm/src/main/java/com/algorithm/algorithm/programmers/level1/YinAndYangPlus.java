package com.algorithm.algorithm.programmers.level1;

public class YinAndYangPlus {
	//음양 더하기
	public static void main(String[] args) {
//		int[] absolutes = {4,7,12};
//		boolean[] signs = {true,false,true};
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		System.out.println(solution(absolutes,signs));
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i=0; i<absolutes.length; i++) {
//			if(signs[i]) {
//				answer += absolutes[i];
//			} else {
//				answer += absolutes[i] - (absolutes[i] *2);
//			}
			answer += absolutes[i] * (signs[i] ? 1 : -1);
		}
		return answer;
	}
}
