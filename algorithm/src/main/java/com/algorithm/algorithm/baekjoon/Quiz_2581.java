package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Quiz_2581 {
	/*2581 : 소수
	자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
	예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로,
	이들 소수의 합은 620이고, 최솟값은 61이 된다.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.\r\n"
				+ "M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=M; i<=N; i++) {
			boolean isPrime = solution(i);
			if(isPrime) {
				arr.add(arr.size(),i);
			}
		}
		
		
		System.out.println("\nM이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, "
				+ "둘째 줄에 그 중 최솟값을 출력한다. \r\n"
				+ "단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.\n");
		
		if(arr.size() == 0) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for(int i=0; i<arr.size(); i++) {
				sum += arr.get(i);
			}
			System.out.println(sum);
			System.out.println(arr.get(0));
		}
	}
	
	public static boolean solution(int value) {
		boolean isPrime = true;
		if(value == 1) {
			return false;
		}
		for(int j=2; j<value; j++) {
			if(value%j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
