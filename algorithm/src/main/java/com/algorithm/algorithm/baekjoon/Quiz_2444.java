package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//별 찍기 - 7
public class Quiz_2444 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N ; i++) {
			for(int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = N; i >= 1; i--) {
			for(int j = 0; j < N-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
