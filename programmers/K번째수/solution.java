// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42748

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int a,b,c;
            a=commands[i][0];
            b=commands[i][1];
            c=commands[i][2];
            int[] temp = Arrays.copyOfRange(array,a-1,b);
            Arrays.sort(temp);
            answer[i]=temp[c-1];
        }
        return answer;
    }
}