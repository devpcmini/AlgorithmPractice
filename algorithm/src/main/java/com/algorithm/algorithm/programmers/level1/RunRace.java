package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RunRace {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		solution(players,callings);
	}
	//풀이1
//	public static void solution(String[] players, String[] callings) {
//		ArrayList<String> answer = new ArrayList<>(Arrays.asList(players));
//		for(int i=0; i<callings.length; i++) {
//			int idx = answer.indexOf(callings[i]);
//			Collections.swap(answer, idx-1, idx);
//		}
//		System.out.println(answer);
//	}
//	
//	public static int indSearch(String[] answer, String callings) {
//		int i;
//		for(i=0; i<answer.length; i++) {
//			if(answer[i].equals(callings)) {
//				return i;
//			}
//		}
//		return -1;
//	}
	//풀이2
	public static void solution(String[] players, String[] callings){
		String[] answer = new String[players.length];

        Map<Integer,String> tMap = new TreeMap<>();
        Map<String,Integer> hMap2 = new HashMap<>();

        for(int i=0; i<players.length; i++){
        	tMap.put(i+1,players[i]);
            hMap2.put(players[i],i+1);
        }

        for(int i=0; i<callings.length; i++){

            String call = callings[i];

            int idx = hMap2.get(call);

            String a = tMap.get(idx-1);

            hMap2.put(call,idx-1);
            hMap2.put(a,idx);

            tMap.put(idx-1,call);
            tMap.put(idx,a);

        }

        int idx = 0;
        for(int key:tMap.keySet()){
            answer[idx++] = tMap.get(key);
        }


        System.out.println(Arrays.toString(answer));
    }
}
