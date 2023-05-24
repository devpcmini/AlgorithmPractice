package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최댓값
public class Quiz_2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxVal = 0;
		int maxInd = 0;
		for(int i=0; i<9; i++) {
			int natNum = Integer.parseInt(br.readLine());
			if(maxVal < natNum) {
				maxVal = natNum;
				maxInd = i+1;
			}
		}
		System.out.println(maxVal);
		System.out.println(maxInd);
	}
}
