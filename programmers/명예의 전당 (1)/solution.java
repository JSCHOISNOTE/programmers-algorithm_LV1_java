// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 명예의전당 리스트 
        List<Integer> topLst = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++){
            
            if(topLst.size() < k){
                topLst.add(score[i]);
            } else {
                if(topLst.get(0) < score[i]){
                    topLst.set(0, score[i]);
                }
            }
            // 내림차순
            Collections.sort(topLst);
            
            answer[i] = topLst.get(0);
        }
        
        return answer;
    }
}