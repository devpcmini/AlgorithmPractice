package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//나머지
public class Quiz_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arr = new ArrayList<>();
		for(int i=0; i<10; i++) {
			arr.add(i,Integer.parseInt(br.readLine()) % 42);
		}
		List<Integer> result = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(result.size());
	}
}
