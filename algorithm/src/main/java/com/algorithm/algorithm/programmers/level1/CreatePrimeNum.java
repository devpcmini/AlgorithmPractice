package com.algorithm.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatePrimeNum {
	//소수 만들기
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
//		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
		Arrays.sort(nums);
		List<Integer> arr = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=1+i; j<nums.length; j++) {
				for(int k=1+j; k<nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					arr.add(sum);
				}
			}
		}
		for(int i=0; i<arr.size(); i++) {
			int count = 0;
			for(int j=2; j<=arr.get(i); j++) {
				if(arr.get(i)%j == 0) {
					count++;
				}
			}
			if(count == 1) {
				answer++;
			}
		}
		return answer;
	}
}
