package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//큰 수 A+B
public class Quiz_10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		if(A.length() < B.length()) {
			String temp = A;
			A = B;
			B = temp;
		}
		int[] arr = new int[A.length()];
		int[] brr = new int[B.length()];
		int a = 0;
		int b = 0;
		for(int i=A.length()-1; i>=0; i--) {
			arr[a++] = A.charAt(i) - '0';
		}
		for(int i=B.length()-1; i>=0; i--) {
			brr[b++] = B.charAt(i) - '0';
		}
		String result = "";
		for(int i=0; i<arr.length; i++) {
			int aar = 0 , bbr = 0;
			aar = arr[i];
			if(i < brr.length) {
				bbr = brr[i];
			}
			if(aar + bbr >= 10 && i+1 < arr.length) {
				arr[i+1] = arr[i+1] + 1;
			}
			result = (aar + bbr) >= 10 && i != arr.length-1 ? String.valueOf(aar + bbr - 10) + result : String.valueOf(aar + bbr) + result;
		}
		System.out.println(result);
	}
}