// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12910

import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt=0;
        // 입출력 예 1
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0) cnt++;
        }
        // 입출력 예 2
        if(cnt==0){
            int[] answer={-1};
            return answer;
        }
        // 입출력 예 3
        int[] answer=new int[cnt];
        for(int i=0,j=0; i<arr.length; i++){
            if(arr[i]%divisor==0) answer[j++]=arr[i];
        }

        Arrays.sort(answer);
        return answer;
    }
}