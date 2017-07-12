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
        input.nextLine();
        int[] map = new int[n*n];
        
        int index = 0;

        for(int i = 0; i < n; i++)
        {
            String row = input.nextLine();
            
            for(int j = 0; j < n; j++)
            {
                
                map[index++] = Character.getNumericValue(row.charAt(j));;
            }
        }
        
        for(int num : map)
        {
           
        }
        
        
        for(int i = 0; i < n*n; i++)
        {    

            if(i % n != 0 && (i-(n-1)) % n != 0 && i > n-1 && i < (n*n)-n)
            {

                int L = map[i-1];              

                int R = map[i+1];
 
                int T = map[i-n];

                int B = map[i+n];

                if(L < map[i]  && R < map[i] && T < map[i] && B < map[i])
                {
                    System.out.print("X");
                    continue;
                }
            }
            
            System.out.print(map[i]);
            
            
            if((i-(n-1)) % n == 0)
            {
                System.out.println("");
            }
        }
    }
}