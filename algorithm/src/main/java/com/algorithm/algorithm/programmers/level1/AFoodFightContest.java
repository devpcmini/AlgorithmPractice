package com.algorithm.algorithm.programmers.level1;

public class AFoodFightContest {
	//푸드 파이트 대회
	public static void main(String[] args) {
		int[] food = {1,3,4,6};
		System.out.println(solution(food));
	}
	
	public static String solution(int[] food) {
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<food.length; i++) {
			sb.append(Integer.toString(i).repeat(food[i]/2));
		}
		return sb.toString() + "0" + sb.reverse().toString();
	}
}
