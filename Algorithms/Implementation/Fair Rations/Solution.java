/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        
        int bread = 0;
        
        for(int i = 0; i < B.length; i++)
        {
            if(i == B.length-1)
            {
                if(B[i] % 2 == 1)
                {
                    System.out.println("NO");
                    System.exit(0);
                }
                else
                {
                    System.out.println(bread);
                    System.exit(0);
                }
            }
            
            
            if(B[i] % 2 == 1) 
            {
                B[i] = B[i] + 1;
                B[i+1] = B[i+1] +1; 
                bread += 2;
            }
        }
        
    }
}
