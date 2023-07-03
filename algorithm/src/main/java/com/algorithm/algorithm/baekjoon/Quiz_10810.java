package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//공 넣기
public class Quiz_10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		for(int z=0; z<M; z++) {
			StringTokenizer stn = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stn.nextToken());
			int j = Integer.parseInt(stn.nextToken());
			int k = Integer.parseInt(stn.nextToken());
			for(int p=i; p<=j; p++) {
				arr[p-1] = k;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
