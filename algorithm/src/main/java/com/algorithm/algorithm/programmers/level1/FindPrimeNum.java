package com.algorithm.algorithm.programmers.level1;

public class FindPrimeNum {
	//소수 찾기
	
	/*
	에라토스테네스의 체는 가장 먼저 소수를 판별할 범위만큼 배열을 할당하여, 해당하는 값을 넣어주고, 
	이후에 하나씩 지워나가는 방법을 이용한다.
	배열을 생성하여 초기화한다.
	2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
	(지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
	2부터 시작하여 남아있는 수를 모두 출력한다.
	 */
	public static void main(String[] args) {
		int n = 10;
//		int n = 5;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int answer = 0;
		int[] arr = new int[n+1];
		
		//배열을 생성하여 초기화한다.
		for(int i=2; i<=n; i++) {
			arr[i] = i;
		}
		
		//2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
		//지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.
		for(int i=2; i<=n; i++) {
			if(arr[i] == 0) {
				continue; //이미 지워진 숫자는 건너뛰기
			}
			//이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
			for(int j=2*i; j<=n; j+=i) {
				arr[j] = 0;
			}
		}
		
		//소수 개수 추가
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				answer++;
			}
		}
		
		return answer;
	}
}
