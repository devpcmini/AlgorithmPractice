package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//약수들의 합
public class Quiz_9506 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1) {
				break;
			}
			List<Integer> list = new ArrayList<>();
			int sum = 0;
			for(int i=1; i<n; i++) {
				if(n%i == 0) {
					list.add(i);
					sum += i;
				}
			}
			if(sum == n) {
				System.out.print(n + " = ");
				for(int i=0; i<list.size(); i++) {
					System.out.print(list.get(i));
					if(list.size()-1 > i) {
						System.out.print(" + ");
					}
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}
