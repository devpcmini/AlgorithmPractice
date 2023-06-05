package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//과제 안 내신 분..?
public class Quiz_5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<30; i++) {
			temp.add(i,i+1);
		}
		int[] arr = new int[28];
		for(int i=0; i<28; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++) {
			if(temp.indexOf(arr[i]) > -1) {
				temp.remove(temp.indexOf(arr[i]));
			}
		}
		System.out.println(temp.get(0));
		System.out.println(temp.get(1));
	}
}
