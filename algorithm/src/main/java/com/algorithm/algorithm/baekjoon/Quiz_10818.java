package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_10818 {
	/* 10818 : 최소, 최대
	 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. "
				+ "둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. "
				+ "모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0,min = 0;
		for(int i=0; i<N; i++) {
			int thisVal = Integer.parseInt(st.nextToken());
			if(i == 0) {
				min = thisVal;
				max = thisVal;
			} else {
				if(min > thisVal) {
					min = thisVal;
				}
				if(max < thisVal) {
					max = thisVal;
				}
			}
		}
		System.out.println("\n첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.\n");
		System.out.println(min+ " " + max);
	}
}
