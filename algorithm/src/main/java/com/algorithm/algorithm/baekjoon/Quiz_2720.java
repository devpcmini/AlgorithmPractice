package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//세탁소 사장 동혁
public class Quiz_2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int C = Integer.parseInt(br.readLine());
			System.out.print(C / 25 + " ");
			C = C % 25;
			System.out.print(C / 10 + " ");
			C = C % 10;
			System.out.print(C / 5 + " ");
			C = C % 5;
			System.out.println(C / 1);
		}
	}
}
