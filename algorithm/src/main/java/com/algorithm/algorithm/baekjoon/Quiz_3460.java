package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_3460 {
	/* 3460 : 이진수
	 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 
	 최하위 비트(least significant bit, lsb)의 위치는 0이다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for(int i=0;i<T;i++) { //T번 반복
			int n = Integer.parseInt(br.readLine()); //정수 n을 입력받는다.

			int index=0; //인덱스값을 구하기 위한 변수
			System.out.println("\n각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.\n");
			while(n>0) { //나누는 수가 0 이상이면 실행
				if(n%2==1) { //나머지가 1이면 이진수로 나타냈을 때 1이 됨
					System.out.print(index + " "); //인덱스값 출력 (줄바꿈 하지 않기 위해 print 사용)
				}
				n/=2; //n은 n를 2로 나눈 몫
				index++; //인덱스값 +1 하고
			}
		}
	}
}
