// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17682

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String temp = ""; // 문자열 내 1번의 점수 저장 변수
        int arr[] = new int[3]; // 3번의 점수를 저장할 배열
        int idx = 0; // 배열을 참조하기 위한 idx
        
        // dartResult 문자열 탐색.
        for(int i = 0;i<dartResult.length();i++){
            // 문자열의 각 문자에 따라 조건 처리.
            switch(dartResult.charAt(i)){
                // *인 경우는 자신 이전의 점수 *2,idx는 S,D,T 증가하기 때문에 idx-1,idx-2 후 *2    
                case '*':
                    arr[idx-1]*=2;
                    if(idx >1) arr[idx-2]*=2;
                    break;
                // #은 자신의 점수를 음수로 만든다.                 
                case '#':
                    arr[idx-1]*=-1;
                    break;
                // S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.    
                case 'S':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),1);
                    idx++;
                    temp ="";
                    break;
                // D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화  
                case 'D':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),2);
                    idx++;
                    temp ="";
                    break;
                // T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화.                  
                case 'T':
                    arr[idx] = (int)Math.pow(Integer.parseInt(temp),3);
                    idx++;
                    temp ="";
                    break;
                // 그 외의 정수들은 temp 변수에 저장    
                default:
                    temp+=String.valueOf(dartResult.charAt(i));
                    break;                    
            } 
        }
        
        // 점수를 모두 더한다
        for(int i =0;i<arr.length;i++){
            answer+=arr[i];
        }
        
        return answer;
    }
}