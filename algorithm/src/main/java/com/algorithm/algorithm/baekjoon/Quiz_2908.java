package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//상수
public class Quiz_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb1 = new StringBuffer(st.nextToken());
		StringBuffer sb2 = new StringBuffer(st.nextToken());
		int A = Integer.parseInt(sb1.reverse().toString());
		int B = Integer.parseInt(sb2.reverse().toString());
		System.out.println(A > B ? A : B);
	}
}
