package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_1789 {
	/* 1789 : 수들의 합
	 * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
	 */
	static long s = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = Long.parseLong(br.readLine());
		long end = s;
		long maxValue = 0;
		long start = 1;
		
		while(start<=end) {
			long mid=(start+end)/2;
			
			long sum=(mid*(mid+1))/2;
			
			
			if(sum>s) { // 합이 s보다 크다면 작은 범위 탐색
				end = mid-1;
			} else { // 합이 s보다 작다면 mid 값 저장 후, 더 큰 범위 탐색
				start=mid+1;
				maxValue=mid;
			}
		}
		
		System.out.println("\n첫째 줄에 자연수 N의 최댓값을 출력한다.\n");
		System.out.println(maxValue);
	}
}
