/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        final StringBuffer sb = new StringBuffer();
        
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
            final String[] input = br.readLine().split(" ");
            final int N = Integer.parseInt(input[0]);
            final int K = Integer.parseInt(input[1]);
            
            final int I = (K < (N >> 1)) ? 1 + (K << 1) : (N-1 - K) << 1;
            
            sb.append(I + "\n");
        }
        System.out.print(sb);
    }
}
