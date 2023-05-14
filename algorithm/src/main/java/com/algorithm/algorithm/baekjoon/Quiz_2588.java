package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//곱셈
public class Quiz_2588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		for(int i=B.length(); i>0; i--) {
			System.out.println(A*Integer.parseInt(B.substring(i-1,i)));
		}
		System.out.println(A*Integer.parseInt(B));
	}
}
