package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//세 막대
public class Quiz_14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int max = A > B ? A : B;
		max = max > C ? max : C;
		if(A == B && B == C && A == C) {
			System.out.println(A + B + C);
		} else if(max == A) {
			if(max >= (B+C)) {
				max = B+C-1;
				System.out.println(max + B + C);
			}
		} else if(max == B) {
			if(max >= (A+C)) {
				max = A+C-1;
				System.out.println(max + A + C);
			}
		} else if(max == C) {
			if(max >= (A+B)) {
				max = A+B-1;
				System.out.println(max + A + B);
			}
		}
	}
}
