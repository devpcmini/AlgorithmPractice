package com.algorithm.algorithm.programmers.level1;

public class TrioThreesome {
	//삼총사
	public static void main(String[] args) {
		int[] number = {-2,3,0,2,-5};
//		int[] number = {-3,-2,-1,0,1,2,3};
//		int[] number = {-1,1,-1,1};
		System.out.println(solution(number));
	}
	
	public static int solution(int[] number) {
		int answer = 0;
		int len = number.length;
	    for (int i = 0; i < len-2; i++) {
	         for (int j = i+1; j < len-1; j++) {
	             for (int k = j+1; k < len; k++) {
	                 if (0 == number[i] + number[j] + number[k]) {
	                     answer++;
	                 }
	             }
	         }
	     }
		 return answer;
	}
}
