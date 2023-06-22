package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최댓값
public class Quiz_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int maxValue = 0;
		int A = 0;
		int B = 0;
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(maxValue <= arr[i][j]) {
					maxValue = arr[i][j];
					A = i + 1;
					B = j + 1;
				}
			}
		}
		System.out.println(maxValue);
		System.out.print(A + " " + B);
	}
}
