/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int T = Integer.parseInt(br.readLine()); T > 0; T--){
   
            int N = Integer.parseInt(br.readLine());
            int D = N + 1;
            sb.append(D + "\n");
        }
        System.out.print(sb);
    }
}
