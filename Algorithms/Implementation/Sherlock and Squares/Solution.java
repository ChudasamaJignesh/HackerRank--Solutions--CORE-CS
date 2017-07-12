/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            int A = input.nextInt();
            int B = input.nextInt();
                        
            
            int start = (int) Math.sqrt(A); 
            int end = (int) Math.sqrt(B);   
            
            int squareIntegers = end-start; 
            
            squareIntegers += (Math.pow(start,2) >= A) ? 1 : 0; 
            
            System.out.println(squareIntegers);
        }
    }
}