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
        int testCases = input.nextInt();
        
        for(int i = 0; i < testCases; i++)
        {
            int cycles = input.nextInt();
            
            
            if(cycles % 2 == 0)
            {
                System.out.println((int) (Math.pow(2, cycles/2)*2) -1);
            }
            else
            {
                System.out.println((int) ((Math.pow(2, (cycles-1)/2)*2) -1)*2);
            }
        }
    }
}