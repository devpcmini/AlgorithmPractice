package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_1978 {
	/* 1978 : 소수 찾기
	 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. "
				+ "다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			result += sosuCount(Integer.parseInt(st.nextToken()));
		}
		System.out.println("\n주어진 수들 중 소수의 개수를 출력한다.\n");
		System.out.println(result);
	}
	public static int sosuCount(int value) {
		int count = 0;
		
		for(int i=1; i<value; i++) {
			if(value%i == 0) {
				count++;
			}
		}
		return count == 1 ? 1 : 0;
	}
}
