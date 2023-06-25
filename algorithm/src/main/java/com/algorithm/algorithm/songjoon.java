package com.algorithm.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	/*public static void main(String[] args) throws NumberFormatException, IOException {
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
	}*/
	/*public static void main(String[] args) throws IOException {
		int[] arr = {1,7,8,4};
		Student[] sArr = new Student[5];
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = new Student();
		}
		sArr[0].setInfo(1);
		sArr[1].setInfo(2);
		sArr[2].setInfo(3);
		sArr[3].setInfo(4);
		sArr[4].setInfo(5);
		
		int maxScore = sArr[0].sum;
		for(int i=0; i<sArr.length; i++) {
			//최고점수 구하기
			for(int j =1; j<sArr.length; j++) {
				if(maxScore < sArr[j].sum) {
					maxScore = sArr[j].sum;
				}
			}
			//최고점수로 반복문 돌면서 로그 찍기
			if(maxScore == sArr[i].sum) {
				sArr[i].getInfo();
			}
		}
	}*/
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = {"송준","통준","통수"};
		for(int i=0; i<arr.length; i++) {
			if(str.indexOf(arr[i]) > -1) {
				int index = str.indexOf(arr[i]);
				for(int j=index; j<index+arr[i].length(); j++) {
					str = str.replace(String.valueOf(str.charAt(j)), "*");
				}
			}
		}
		System.out.println(str);
	}
}

/*class Student {
	String name;
	int kor;
	int eng;
	int sum;
	
	
	public void setInfo(int i) {
		switch(i) {
			case 1 : name = "박창민"; kor = 50; eng = 100; sum = kor + eng; break;
			case 2 : name = "송준"; kor = 100; eng = 100; sum = kor + eng; break;
			case 3 : name = "김도영"; kor = 0; eng = 10; sum = kor + eng; break;
			case 4 : name = "김동기"; kor = 70; eng = 80; sum = kor + eng; break;
			case 5 : name = "홍"; kor = 10; eng = 30; sum = kor + eng; break; 
		}
	}
	
	public void getInfo() {
		System.out.println(name + "/" + kor + "/" + eng + "/" + sum); 
	}
}*/

