package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_1527 {
	/* 1527 : 금민수의 개수
	은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다. 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
	A와 B가 주어졌을 때, A보다 크거나 같고, B보다 작거나 같은 자연수 중에 금민수인 것의 개수를 출력하는 프로그램을 작성하시오.
	 */
	static long min, max, result;

    public static void solution(long number) {
        if (number > max)
            return;
        if (number >= min)
        	result += 1;
        
        solution(number * 10 + 4);
        solution(number * 10 + 7);
    }

    public static void main(String[] args) throws IOException {
    	System.out.println("첫째 줄에 A와 B가 주어진다. A는 1보다 크거나 같고, 1,000,000,000보다 작거나 같은 자연수이다. "
    			+ "B는 A보다 크거나 같고, 1,000,000,000보다 작거나 같은 자연수이다.\r\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        min = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());
        solution(4);
        solution(7);
        System.out.println("\n첫째 줄에 A보다 크거나 같고, B보다 작거나 같은 자연수 중에 금민수인 것의 개수를 출력한다.\n");
        System.out.println(result);
    }
}
