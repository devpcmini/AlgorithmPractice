package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분수찾기
public class Quiz_1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N == 1) {
			System.out.println("1/1");
			return;
		}
		int i=1;
		int result = 1;
		while(N > (N - i)) {
			N -= i++;
			result++;
			if(N - i <= 0) {
				break;
			}
		}
		int len = result;
		if(result % 2 == 1) {
			for(long z=1; z<=len; z++) {
				N--;
				if(N == 0) {
					System.out.println(result + "/" + (z));
				}
				result--;
			}
		} else {
			for(long z=1; z<=len; z++) {
				N--;
				if(N == 0) {
					System.out.println(z + "/" + (result));
				}
				result--;
			}
		}
	}
}
