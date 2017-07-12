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
        int t = in.nextInt();
        tests :
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] array = new int[n];
            Set<Integer> used = new HashSet<>();
            
            for(int i = 0; i < n/2; i++)
            {
                int leftMost = i + 1;
                int rightMost = n - i;

                if(leftMost - k > 0 && !used.contains(leftMost-k))
                {
                    array[i] = leftMost-k;
                    used.add(leftMost-k);
                }
                else if(i + 1 + k <= n && !used.contains(leftMost+k))
                {
                    array[i] = leftMost+k;
                    used.add(leftMost+k);
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
                
                if(rightMost + k <= n && !used.contains(rightMost+k))
                {
                    array[n-1-i] = rightMost+k;
                    used.add(rightMost+k);                    
                }
                else if(rightMost - k > 0 && !used.contains(rightMost-k))
                {
                    array[n-1-i] = rightMost-k;
                    used.add(rightMost-k);
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
            }
            
            if(n % 2 == 1)
            {
                int middle = (n/2) + 1;
                
                if(!used.contains(middle+k) || !used.contains(middle-k))
                {
                    if(!used.contains((n/2) +1 + k) && middle + k <= n)
                    {
                        array[(n/2)] = (n/2) + 1 + k;
                    }
                    else if(!used.contains((n/2) +1 - k) && middle - k > 0)
                    {
                        array[(n/2)] = (n/2) + 1 - k;
                    }
                    else
                    {
                        System.out.println("-1");
                        continue tests;    
                    }
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
            }
            
            for(int num : array)
            {
                System.out.print(num+" ");
            }
            System.out.println("");
            
        }
    }
}
