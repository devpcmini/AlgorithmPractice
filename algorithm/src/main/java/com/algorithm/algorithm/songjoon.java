package com.algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class songjoon {
	//숫자야구 친구가 해보래서 해봄
	/*public static void main(String[] args) throws IOException {
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
	}*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("몇개 생성?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			System.out.println("보너스 번호 Y/N");
			br = new BufferedReader(new InputStreamReader(System.in));
			int[] arr;
			String bonusYn = br.readLine().toUpperCase();
			if("Y".equals(bonusYn)) {
				arr = new int[7];
			} else if("N".equals(bonusYn)) {
				arr = new int[6];
			} else {
				System.out.println("Y 아니면 N만 입력가능");
				return;
			}
			for(int j=0; j<arr.length; j++) {
				arr[j] = (int)(Math.random() * 45 +1);
				for(int z=0; z<j; z++) {
					if(arr[j] == arr[z]) {
						j--;
						break;
					}
				}
			}
			Integer[] integerArr = new Integer[6];
			for(int g=0; g<integerArr.length; g++) {
				integerArr[g] = arr[g];
			}
			Arrays.sort(integerArr);
			if("Y".equals(bonusYn)) {
				System.out.println(i + "회차 :: " + Arrays.toString(integerArr) + "보너스 " + arr[6]);
			} else {
				System.out.println(i + "회차 :: " + Arrays.toString(integerArr));
			}
			
		}
	}
}
