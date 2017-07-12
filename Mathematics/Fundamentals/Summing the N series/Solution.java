/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;

public class Solution{
    
    private final static int MOD = 1000000007;
    
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
            long N = Long.parseLong(br.readLine());
            N = N%MOD;
            int sN = (int)((N*N)%MOD);
            sb.append(sN + "\n");
        }
        System.out.print(sb);
    }
}
