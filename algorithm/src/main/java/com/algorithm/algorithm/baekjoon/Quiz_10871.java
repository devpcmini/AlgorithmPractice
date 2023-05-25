package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//X보다 작은 수
public class Quiz_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		StringTokenizer A = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(A.nextToken());
			if(X > a) {
				bw.write(a + " ");
			}
		}
		bw.close();
	}
}
