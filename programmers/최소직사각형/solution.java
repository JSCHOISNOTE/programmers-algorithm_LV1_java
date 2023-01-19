// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/86491

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_v=0;
        int max_h=0;
        
        // 가로를 두 변중에서 가장 긴 부분으로 설정
        // 세로를 두 변중에서 가장 작은 부분으로 설정
        // 가로와 세로의 길이가 모두 들어맞게, Max(가로)와 Max(세로)를 설정
        for(int i=0;i<sizes.length;i++){
            int v=Math.max(sizes[i][0],sizes[i][1]);
            int h=Math.min(sizes[i][0],sizes[i][1]);
            max_v=Math.max(max_v,v);
            max_h=Math.max(max_h,h);
        }
        return answer=max_v*max_h;
    }
}
