package com.algorithm.algorithm.programmers.level1;

public class HasNum {
	//하샤드 수
	public static void main(String[] args) {
//		int arr = 10;
//		int arr = 12;
//		int arr = 11;
		int arr = 13;
		System.out.println(solution(arr));
	}
	
	public static boolean solution(int x) {
		boolean answer = true;
		String[] xSplit = String.valueOf(x).split("");
		int sum = 0;
		for(int i=0; i<xSplit.length; i++) {
			sum += Integer.parseInt(xSplit[i]);
		}
		if(x%sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		
		return answer;
	}
}
