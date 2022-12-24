// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12917

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}