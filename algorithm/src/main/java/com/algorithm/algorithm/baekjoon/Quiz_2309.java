package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quiz_2309 {
	/*2309 : 일곱 난쟁이
	왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 
	일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
	아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 
	뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
	아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, "
				+ "아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arrList = new ArrayList<>();
		int sum = 0;
		for(int i=0; i<9; i++) {
			int iCm = Integer.parseInt(br.readLine());
			arrList.add(iCm);
			sum += iCm;
		}
		arrList = filterArr(sum,arrList);
		
		Collections.sort(arrList);
		System.out.println("\n일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.\n");
		for(int value : arrList) {
			System.out.println(value);
		}
	}
	
	@SuppressWarnings("removal")
	public static List<Integer> filterArr(int sum,List<Integer> arrList){
		for(int i=0; i<9; i++) {
			int iNum = arrList.get(i);
			for(int j=0; j<9; j++) {
				int jNum = arrList.get(j);
				if(iNum != jNum && sum - iNum - jNum == 100) {
					arrList.remove(new Integer(iNum));
					arrList.remove(new Integer(jNum));
					return arrList;
				}
			}
		}
		return arrList;
	}
} 
