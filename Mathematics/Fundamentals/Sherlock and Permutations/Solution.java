/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int M = in.nextInt();
            
            System.out.println(solve(N, M - 1).mod(BigInteger.valueOf(1000000007)));
        }
    }
    
    private static final BigInteger solve(int N, int M) {
        return factorial(N + M).divide(factorial(N).multiply(factorial(M)));
    }
    
    private static final BigInteger factorial(int n) {
        BigInteger total = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        
        return total;
    }
}