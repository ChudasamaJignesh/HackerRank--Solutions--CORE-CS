/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] sticks = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            sticks[i] = input.nextInt();
        }
        
        Arrays.sort(sticks);
 
        int sticksLeft = N;
        
        int curr = sticks[0];
        int currCount = 0;
        System.out.println(N);
        
        for(int i = 0; i < N; i++)
        {
            if(curr == sticks[i])
            {
                currCount++;
            }
            else
            {
                sticksLeft -= currCount;
                currCount = 1;
                curr = sticks[i];
                System.out.println(sticksLeft);
            }
        }
        
        
    }
}