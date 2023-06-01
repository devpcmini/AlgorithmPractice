package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//공 바꾸기
public class Quiz_10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			arr.add(i,i+1);
		}
		int M = Integer.parseInt(st.nextToken());
		for(int i=0; i<M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int fStI = Integer.parseInt(st1.nextToken());
			int fStJ = Integer.parseInt(st1.nextToken());
			Collections.swap(arr, fStI-1, fStJ-1);
		}
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
