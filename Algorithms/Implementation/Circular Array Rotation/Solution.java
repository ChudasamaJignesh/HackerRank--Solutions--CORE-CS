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
        int k = in.nextInt()%n;
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
      
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            if(m-k >=0)
            {
                System.out.println(a[m-k]);
            }
            else
            {
                System.out.println(a[n+(m-k)]);
            }
            
        }
    } 
}
