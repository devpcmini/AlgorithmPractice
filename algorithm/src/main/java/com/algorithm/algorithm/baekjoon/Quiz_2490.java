package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2490 {
	/* 2490 : 윷놀이
	  우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다. 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때 
	  도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개) 중 
	  어떤 것인지를 결정하는 프로그램을 작성하라.*/
	
	private String solution(BufferedReader br) throws IOException {
		String result = "";
        String[] arr = {"D", "C", "B", "A", "E"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            //토큰이 있다면 다음 토큰을 가져온다.
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb.append(arr[sum] + "\n");
        }
        result = sb.toString();
        return result;
	}
	
	public static void main(String[] args) throws IOException {
		Quiz_2490 quiz = new Quiz_2490();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println(quiz.solution(br));
	}
}
