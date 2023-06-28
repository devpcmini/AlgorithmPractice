package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//중앙 이동 알고리즘
public class Quiz_2903 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cg = 2;
		for(int i=0; i<N; i++) {
			cg = cg + (cg - 1);
		}
		System.out.println(cg * cg);
	}
}
