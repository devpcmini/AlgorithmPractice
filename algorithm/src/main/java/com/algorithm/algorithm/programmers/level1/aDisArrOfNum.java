package com.algorithm.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class aDisArrOfNum {
	//나누어 떨어지는 숫자 배열
	public static void main(String[] args) {
//		int[] arr = {5,9,7,10};
//		int divisor = 5;
//		int[] arr = {2,36,1,3};
//		int divisor = 1;
		int[] arr = {3,2,6};
		int divisor = 10;
		System.out.println(Arrays.toString(solution(arr,divisor)));
	}
	
	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			if(i%divisor == 0) {
				list.add(i);
			}
		}
		if(list.size() == 0) {
			list.add(-1);
		}
		Collections.sort(list);
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		return answer;
	}
}
