/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;

public class Solution {
	private final static int MOD = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short T = Short.parseShort(br.readLine());
        
   
        short[] Ns = new short[T];
        short[] Ks = new short[T];
        for(int t = 0; t < T; t++){
            Ns[t] = Short.parseShort(br.readLine());
            Ks[t] = Short.parseShort(br.readLine());
        }
        
   
        Map<Short, int[]> map = new TreeMap<Short, int[]>();
        for(short t = 0; t < T; t++){
            map.put((short)(Ns[t] + Ks[t] - 1), null);
        }
        
           short curN = 1;
        int[] curC = new int[]{1, 1};
        for(short n : map.keySet()){
            while(curN < n){
                curN++;
                short length = (short)(curN + 1);
                int[] C = new int[length];
                C[0] = C[curN] = 1;
                for(short i = 1; i < curN; i++){
                    C[i] = (curC[i] + curC[i-1])%MOD;
                }
                curC = C;
            }
            map.put(n, curC);
        }
        
   
        StringBuffer sb = new StringBuffer();
        for(short t = 0; t < T; t++){
            short N = Ns[t];
            int[] C = map.get((short)(N + Ks[t] - 1));
            sb.append(C[N-1] + "\n");
        }
        System.out.print(sb);
    }
}