// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}