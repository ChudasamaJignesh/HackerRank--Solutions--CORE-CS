/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        byte[] A = new byte[N];
        String[] T = br.readLine().split(" ");
        for(int i = 0; i < N; ++i){
            A[i] = Byte.parseByte(T[i]);
        }
        for(int Q = Integer.parseInt(br.readLine()); Q > 0; --Q){
            
            T = br.readLine().split(" ");
            int X = Integer.parseInt(T[0]) - 1;
            int Y = Integer.parseInt(T[1]) - 1;
            byte base = A[X];
            byte power = (X == Y) ? 1 : A[X+1];
            sb.append((power == 0 || (base & 1) == 1) ? "Odd\n" : "Even\n");
        }
        

        System.out.print(sb);
    }
}