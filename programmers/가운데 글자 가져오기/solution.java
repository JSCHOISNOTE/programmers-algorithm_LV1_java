// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){ //짝수
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else { //홀수
            answer = s.substring(s.length()/2, s.length()/2+1);
        }

        return answer;
    }
}