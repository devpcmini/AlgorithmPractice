package com.algorithm.algorithm.programmers.level1;

public class Overpainting {
	public static void main(String[] args) {
		int n = 8, m = 4;
		int[] section = {2,3,6};
//		int n = 5, m = 4;
//		int[] section = {1, 3};
//		int n = 4, m = 1;
//		int[] section = {1,2,3,4};
		int solution = solution(n,m,section);
		System.out.println(solution);
	}
	
	public static int solution(int n,int m, int[] section) {
		int answer = 0;
		int[] arr = new int[n];
		for(int i=0; i<section.length; i++) {
			int value = section[i]-1;
			if(arr[value] == 0) {
				int len = value+m > arr.length ? arr.length : value+m;
				for(int j=value; j<len; j++) {
					arr[j] = 1;
				}
				answer++;
			}
		}
		return answer;
	}
}
