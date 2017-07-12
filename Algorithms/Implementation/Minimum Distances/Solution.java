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
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        
        
        HashMap<Integer,Integer> distances = new HashMap<>();
        
        int minDistance = -1;
        
        for(int i = 0; i < n; i++)
        {
            if(distances.containsKey(A[i]))
            {
                
                int distance = Math.abs(distances.get(A[i]) - i);
                
                if( distance < minDistance || minDistance == -1)
                {
                    minDistance = distance;
                }
                
                distances.put(A[i], i);
            }
            else
            {
                distances.put(A[i], i);
            }
        }
        
        System.out.println(minDistance);
        
        
    }
}
