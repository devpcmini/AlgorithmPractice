package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소인수분해
public class Quiz_11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while(N > 1) {
			if(N%i == 0) {
				N = N/i;
				System.out.println(i);
			} else {
				i++;
			}
		}
	}
}
