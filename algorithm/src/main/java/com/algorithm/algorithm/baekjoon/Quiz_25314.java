package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//코딩은 체육과목 입니다.
public class Quiz_25314 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String result = "";
		for(int i=0; i<N/4; i++) {
			result = result + "long ";
		}
		result = result + "int";
		System.out.println(result);
	}
}
