package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A/B
public class Quiz_1008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());
		System.out.println(A/B);
	}
}
