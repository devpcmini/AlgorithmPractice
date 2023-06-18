package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<str.length(); i++) {
			int count = map.get(Character.toString(str.charAt(i))) == null ? 0 : map.get(Character.toString(str.charAt(i)));
			map.put(Character.toString(str.charAt(i)), ++count);
		}
		List<String> maxKeys = new ArrayList<>();

		int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value > max) {
                max = value;
                maxKeys.clear();
                maxKeys.add(entry.getKey());
            } else if (value == max) {
                maxKeys.add(entry.getKey());
            }
        }
        System.out.println(maxKeys.size() > 1 ? "?" : maxKeys.get(0));
	}
}
