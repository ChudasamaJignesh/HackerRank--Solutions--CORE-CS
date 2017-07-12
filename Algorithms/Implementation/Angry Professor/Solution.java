/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        testCases: 
        for(int i = 0; i < T; i++)
        {
            int n = input.nextInt();
            int k = input.nextInt();
            int onTime = 0;
            for(int j = 0; j < n; j++)
            {
                int arrivalTime = input.nextInt();
                if(arrivalTime <= 0)
                {
                    onTime++;
                }
            }
            if(onTime >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");   
            }
        }
    }
}