package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//삼각형과 세 변
public class Quiz_5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if(A == 0 && B == 0 && C == 0) {
				return;
			} else  {
				int max = Integer.MIN_VALUE;
				max = max > A ? max : A;
				max = max > B ? max : B;
				max = max > C ? max : C;
				if(max == A) {
					if(max >= (B+C)) {
						System.out.println("Invalid");
					} else if(A == B && B == C && A == C) {
						System.out.println("Equilateral");
					} else if(A == B || B == C || A == C) {
						System.out.println("Isosceles");
					} else {
						System.out.println("Scalene");
					}
				} else if(max == B) {
					if(max >= (A+C)) {
						System.out.println("Invalid");
					} else if(A == B && B == C && A == C) {
						System.out.println("Equilateral");
					} else if(A == B || B == C || A == C) {
						System.out.println("Isosceles");
					} else {
						System.out.println("Scalene");
					}
				} else if(max == C) {
					if(max >= (A+B)) {
						System.out.println("Invalid");
					} else if(A == B && B == C && A == C) {
						System.out.println("Equilateral");
					} else if(A == B || B == C || A == C) {
						System.out.println("Isosceles");
					} else {
						System.out.println("Scalene");
					}
				} 
			}
		}
	}
}
