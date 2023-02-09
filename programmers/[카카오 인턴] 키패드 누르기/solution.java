// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/67256

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer ="";
        
        // 시작 위치 * = 10 , # = 12
        int leftindex = 10;
        int rightindex = 12;
        // 1 4 7 이면 L 더함
        for(int n : numbers){
            if(n==1 || n==4 || n==7){
                answer += "L";
                leftindex = n;
        // 3 6 9 이면 R 더함       
            } else if(n==3 || n==6 || n==9){
                answer += "R";
                rightindex = n;
        // 2 5 8 0 일때 현재 손가락 위치로 거리 구함 * 0 은 11로 치환        
            } else {
                if(n == 0){
                    n += 11;
                }
                int ld = (Math.abs(n-leftindex)) /3 + (Math.abs(n-leftindex)) %3;
                int rd = (Math.abs(n-rightindex)) /3 + (Math.abs(n-rightindex)) %3;
                if(ld == rd){
                    if(hand.equals("right")){
                        answer += "R";
                        rightindex = n;
                    } else{
                        answer += "L";
                        leftindex = n;
                    }
                } else if(ld>rd){
                    answer += "R";
                    rightindex = n;
                } else{
                    answer += "L";
                    leftindex = n;
                }
            }
        }
        return answer;
    }
}