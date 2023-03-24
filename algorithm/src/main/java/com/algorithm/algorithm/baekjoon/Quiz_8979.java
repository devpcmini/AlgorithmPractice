package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Quiz_8979 {
	/*
	8979 : 올림픽
	올림픽은 참가에 의의가 있기에 공식적으로는 국가간 순위를 정하지 않는다. 그러나, 많은 사람들이 자신의 국가가 얼마나 잘 하는지에 관심이 많기 때문에 비공식적으로는 국가간 순위를 정하고 있다. 두 나라가 각각 얻은 금, 은, 동메달 수가 주어지면, 보통 다음 규칙을 따라 어느 나라가 더 잘했는지 결정한다.
	
	금메달 수가 더 많은 나라 
	금메달 수가 같으면, 은메달 수가 더 많은 나라
	금, 은메달 수가 모두 같으면, 동메달 수가 더 많은 나라 
	각 국가는 1부터 N 사이의 정수로 표현된다. 한 국가의 등수는 (자신보다 더 잘한 나라 수) + 1로 정의된다. 만약 두 나라가 금, 은, 동메달 수가 모두 같다면 두 나라의 등수는 같다. 예를 들어, 1번 국가가 금메달 1개, 은메달 1개를 얻었고, 2번 국가와 3번 국가가 모두 은메달 1개를 얻었으며, 4번 국가는 메달을 얻지 못하였다면, 1번 국가가 1등, 2번 국가와 3번 국가가 공동 2등, 4번 국가가 4등이 된다. 이 경우 3등은 없다. 
	
	각 국가의 금, 은, 동메달 정보를 입력받아서, 어느 국가가 몇 등을 했는지 알려주는 프로그램을 작성하시오.  
	 */
    public static void main(String[] args) throws IOException {
    	System.out.println("입력의 첫 줄은 국가의 수 N(1 ≤ N ≤ 1,000)과 등수를 알고 싶은 국가 K(1 ≤ K ≤ N)가 빈칸을 사이에 두고"
    			+ " 주어진다. 각 국가는 1부터 N 사이의 정수로 표현된다. 이후 N개의 각 줄에는 차례대로 각 국가를 나타내는 정수와 "
    			+ "이 국가가 얻은 금, 은, 동메달의 수가 빈칸을 사이에 두고 주어진다. 전체 메달 수의 총합은 1,000,000 이하이다.\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]); // 국가의수
        int k = Integer.parseInt(t[1]); // 등수를 알고 싶은 국가
        ArrayList<Node>list = new ArrayList<>();
        int end_point=0;
        for(int i=0; i<n; i++) {
            String[] tt = br.readLine().split(" ");
            int num = Integer.parseInt(tt[0]);      //국가의 번호
            int gold = Integer.parseInt(tt[1]);
            int silver = Integer.parseInt(tt[2]);
            int bronze = Integer.parseInt(tt[3]);
            list.add(new Node(num,gold,silver,bronze,0));
        }
        Collections.sort(list);
        
        list.get(0).rate=1; // 정렬을 했으니 리스트의 첫번째 국가는 무조건 1등이다
        
        for(int i=1; i<list.size(); i++) {
            int tmp_gold= list.get(i-1).gold;
            int tmp_silver = list.get(i-1).silver;
            int tmp_bronze = list.get(i-1).bronze;
            Node now = list.get(i);
            if(list.get(i).num == k) {  // 국가의 번호가 k번이면 end_point를 찾고 마지막 정답 출력 할 때 사용
                end_point=i;
            }
            if(now.gold == tmp_gold && now.silver==tmp_silver && now.bronze==tmp_bronze) {
                list.get(i).rate=list.get(i-1).rate;
            }
            
            else {
                list.get(i).rate = i+1;
            }
        }
        System.out.println("\n출력은 단 한 줄이며, 입력받은 국가 K의 등수를 하나의 정수로 출력한다. 등수는 반드시 문제에서 정의된 방식을 따라야 한다. \n");
        System.out.println(list.get(end_point).rate);
    }
}
class Node implements Comparable<Node>{
    int num,gold,silver,bronze,rate;
    Node(int num, int gold, int silver, int bronze, int rate){
        this.num=num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.rate=rate;
    }
    public int compareTo(Node o) {
        if(this.gold==o.gold) {
            if(this.silver==o.silver) {
                return o.bronze-this.bronze;
            }
            else {
                return o.silver-this.silver;
            }
        }
        else {
            return o.gold-this.gold;
        }
    }
}
