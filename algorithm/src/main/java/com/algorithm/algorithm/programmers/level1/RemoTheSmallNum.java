package com.algorithm.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoTheSmallNum {
	//제일 작은 수 제거하기
	public static void main(String[] args) {
//		int[] arr = {4,3,2,1};
		int[] arr = {10};
		System.out.println(Arrays.toString(solution(arr)));
	}
	
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			list.add(i);
		}
		list.remove(Collections.min(list));
		//방법1
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		//방법2
//		int[] answer = new int[list.size()]; // 배열 생성
//
//		for(int i = 0; i < list.size(); i++) {
//			answer[i] = list.get(i); // List의 요소를 배열에 복사
//		}
		return answer.length == 0 ? new int[] {-1} : answer;
	}
}
