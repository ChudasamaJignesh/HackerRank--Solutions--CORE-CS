
/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] map = new int[n];  
        int[] distanceMap = new int[n]; 
        
        int leftNearest = n+1; 
        int rightNearest = -1; 
        int maxDistance  = 0;  
    
        for(int i = 0; i < m; i++)
        {
            int spacestation = input.nextInt();
            map[spacestation] = 1;
            
            rightNearest = (spacestation > rightNearest) ? spacestation : rightNearest;
            leftNearest = (spacestation < leftNearest) ? spacestation : leftNearest;
        }
        
        for(int i = 0; i < n; i++)
        {
            if(map[i] == 1)
            {
                distanceMap[i] = 0;
                leftNearest = i;
            }
            else
            {
                if(i > leftNearest)
                {
 
                    distanceMap[i] = i - leftNearest;
                }
                else
                {
                    distanceMap[i] = n+1;
                }
            }
        }
        
     
        for(int i = n-1; i>= 0; i--)
        {
            if(map[i] == 1)
            {
                rightNearest = i;
            }
            else
            {
                if(rightNearest > i)
                {
                    
                    distanceMap[i] = (distanceMap[i] > rightNearest - i) ? rightNearest - i : distanceMap[i];
                }
            }
            

            maxDistance = (distanceMap[i] > maxDistance) ? distanceMap[i] : maxDistance;
        }

        System.out.println(maxDistance);
        
    }
}