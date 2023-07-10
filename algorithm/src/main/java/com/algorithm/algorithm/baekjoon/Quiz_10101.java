package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//삼각형 외우기
public class Quiz_10101 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		if(A == 60 && B == 60 && C == 60) {
			System.out.println("Equilateral");
			return;
		} else if(A+B+C == 180 && (A == B || B == C || A == C)) {
			System.out.println("Isosceles");
			return;
		} else if(A+B+C == 180 && (A != B && B != C && A != C)) {
			System.out.println("Scalene");
			return;
		} else if(A+B+C != 180) {
			System.out.println("Error");
			return;
		}
	}
}
