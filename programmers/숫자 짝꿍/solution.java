// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131128

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        // 가장 좋아요를 많이 받은 정답 참고 *
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }else if(answer.toString().charAt(0)==48){
           return "0";
        }else {
            return answer.toString();
        }
    }
}