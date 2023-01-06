// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12982

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 작은 수 부터 비교하여 최대로 지원할 수 있는 부서 수를 알아보기 위해서
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(d[i] <= budget){
                
                // 남은 예산이 지원 금액보다 크거나 같으면 예산에서 제외
                budget = budget - d[i];
                
                // 부서지원 할때마다 카운트 증가
                answer++;
                
            } else{
                // 예산이 부족한 경우 중단
                break;
            }
        }
        return answer;
    }
}