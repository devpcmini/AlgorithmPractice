package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//알파벳 찾기
public class Quiz_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String[] arr = {"a", "b", "c", "d", "e",
                "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
		for(int j=0; j<arr.length; j++) {
			int answer = -1;
			for(int i=0; i<S.length(); i++) {
				if(arr[j].equals(String.valueOf(S.charAt(i)))) {
					answer = i;
					for(int z=0; z<S.length(); z++) {
						if(arr[j].equals(String.valueOf(S.charAt(z)))) {
							answer = answer > z ? z : answer;
						}
					}
				}
			}
			System.out.print(answer + " ");
		}
	}
}
