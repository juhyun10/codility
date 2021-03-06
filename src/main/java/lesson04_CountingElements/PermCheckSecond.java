package lesson04_CountingElements;

import java.util.Arrays;

/**
 * 6mins, 100%
 *
 * @author 이주현
 * @since 2019.08.13
 */
public class PermCheckSecond {
    public static void main(String[] args) {
        int[] A = {4,1,3};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i=1; i<=A.length; i++) {
            if (A[i-1] != i) {
                return 0;
            }
        }
        return 1;
    }
}
