package com.algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//숫자야구 친구가 해보래서 해봄
public class songjoon {
	public static void main(String[] args) throws IOException {
		int[] answer = new int[3];
		answer[0] = random(0,0);
		answer[1] = random(answer[0],0);
		answer[2] = random(answer[0],answer[1]);
		for(int c=1; c<=10; c++) {
			System.out.println("ㅋㅋ아 "+c+"번쨰 회차구연");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] scans = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			String[] result = new String[3];
			int strike = 0;
			int ball = 0;
			for(int i=0; i<scans.length; i++) {
				int count = 4;
				for(int j=0; j<answer.length; j++) {
					if(scans[i] == answer[j]) {
						count = j;
					}
				}
				if(i == count) {
					result[i] = "S";
					strike++;
				} else if(count != 4) {
					result[i] = "B";
					ball++;
				} else {
					result[i] = "O";
				}
			}
			System.out.println("Strike : " + strike + ", Ball : " + ball);
			if("S".equals(result[0]) && "S".equals(result[1]) && "S".equals(result[2])) {
				System.out.println("정답이구연");
				break;
			} else if(c == 10) {
				System.out.println("이걸 못깨노");
			}
		}
	}
	
	public static int random(int A, int B) {
		int result = (int) (Math.random() * 9) + 1;
		result = A == result || B == result ? random(A,B) : result;
		return result;
	}
}
