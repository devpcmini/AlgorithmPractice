package com.algorithm.algorithm.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReceReportRslt {
	
	static int K;
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		K = 2;
//		String[] id_list = {"con", "ryan"};
//		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//		K = 3;
		int[] abc = solution(id_list,report,K);
	}
	
	public static int[] solution(String[] id_list,String[] report,int k) {
		int[] answer = new int[id_list.length];
        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<String>();
        for (String rep : report)
            reportSet.add(rep);

        // 2. report에서 각 사람이 신고당한 횟수를 countHash으로 정의하기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet){
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx + 1);
            
            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if(reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        // 3. notifyListHash를 기반으로 reportHash만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values())
            if (notifyList.size() >= k)
                for(String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);

        // 4. reporterHash 정보를 answer에 옮겨담기
        for (int i = 0; i < id_list.length; i++)
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
