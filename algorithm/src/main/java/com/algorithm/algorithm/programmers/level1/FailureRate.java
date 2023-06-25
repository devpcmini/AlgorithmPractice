package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class FailureRate {
	//실패율
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		System.out.println(Arrays.toString(solution(N,stages)));
	}
	
	public static int[] solution(int N, int[] stages) {
		int[] result = new int[N];
		double[] answer = new double[N];
		Arrays.sort(stages);
		int len = stages.length;
		for(int i=0; i<N; i++) {
			int stageC = 0;
			for(int j=0; j<stages.length; j++) {
				if(stages[j] == i+1) {
					stageC++;
				}
			}
			answer[i] = (double)stageC / (double) (len) * 100.0;
			System.out.println((double)stageC / (double) (len) * 100.0);
			len = len - stageC;
		}
		System.out.println(Arrays.toString(answer));
		
		for(int i=0; i<answer.length; i++) {
			int bigger = (int)answer[0];
			for(int j=i+1; j<answer.length; j++) {
				bigger = bigger > answer[j] ? bigger : (int)answer[j];
			}
		}
		return result;
	}
}
