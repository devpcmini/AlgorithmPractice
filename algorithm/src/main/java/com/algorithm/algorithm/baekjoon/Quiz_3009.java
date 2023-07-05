package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//네 번째 점
public class Quiz_3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> arr1 = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr1.add(st.nextToken());
			arr2.add(st.nextToken());
		}
		String result = "";
		String temp1 = arr1.get(0);
		int count1 = 0;
		for(int i=0; i<arr1.size(); i++) {
			if(arr1.get(i).equals(temp1)) {
				count1++;
			}
		}
		if(count1 == 2) {
			arr1.remove(temp1);
			arr1.remove(temp1);
			result = arr1.get(0) + " ";
		} else {
			result = temp1 + " ";
		}
		
		String temp2 = arr2.get(0);
		int count2 = 0;
		for(int i=0; i<arr2.size(); i++) {
			if(arr2.get(i).equals(temp2)) {
				count2++;
			}
		}
		if(count2 == 2) {
			arr2.remove(temp2);
			arr2.remove(temp2);
			result = result + arr2.get(0);
		} else {
			result = result + temp2;
		}
		
		System.out.println(result);
	}
}
