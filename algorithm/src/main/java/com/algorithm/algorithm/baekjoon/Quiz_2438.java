package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//별찍기
public class Quiz_2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();
	}
}
