package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//숫자의 합
public class Quiz_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] st = br.readLine().split("");
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(st[i]);
		}
		System.out.println(sum);
	}
}
