package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//평균
public class Quiz_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] arr = new double[N];
		for(int j=0; j<N; j++) {
			arr[j] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0; i<N; i++) {
			sum += arr[i] / arr[arr.length-1];
		}
		System.out.println(sum / N * 100);
	}
}
