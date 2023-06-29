package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//벌집
public class Quiz_2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 1;
		int i = 1;
		while(true) {
			if(N <= 1) {
				break;
			}
			N = N - (6 * i++);
			result++;
		}
		System.out.println(result);
	}
}
