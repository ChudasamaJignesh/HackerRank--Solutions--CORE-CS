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
        int n = in.nextInt();
        int[] scores = new int[n];
        int[] ranks = new int[n]; 

        for(int i=0, rank=1; i < n; i++){
            int s = in.nextInt();
            scores[i] = s;
            if(i > 0 && scores[i-1] != s)
                rank++;
            ranks[i] = rank;    
        }
        

        int aliceRank = ranks[ranks.length-1] + 1; 
        int leaderboardIndex = n-1;
        int m = in.nextInt();
        
        int prevScore = -1; 
        
        for(int aliceScores=0; aliceScores < m; aliceScores++)
        {
            int levelScore = in.nextInt();
        
            
            for(int i = leaderboardIndex; i >= -1; i--)
            {
                if(i < 0 || scores[i] > levelScore)
                {
                    System.out.println(aliceRank);
                    break;
                }
                else if(scores[i] < levelScore)
                {
                    if(scores[i] != prevScore)
                    {
                        aliceRank--;    
                    }
                    leaderboardIndex--;
                }
                else
                {
                    leaderboardIndex--;
                    aliceRank = ranks[i];
                }
                prevScore = scores[i];
            }
        }
    }
}
