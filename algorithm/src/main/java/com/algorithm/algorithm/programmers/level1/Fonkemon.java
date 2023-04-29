package com.algorithm.algorithm.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Fonkemon {
	//폰켓몬
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}
	
	public static int solution(int[] nums) {
		Set<Integer> hSet = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			hSet.add(nums[i]);
		}
		return nums.length/2 > hSet.size() ? hSet.size() : nums.length/2;
	}
}
