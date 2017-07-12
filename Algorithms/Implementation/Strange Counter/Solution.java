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
        long t = in.nextLong();
        
        
        long upperBound = 4;
        long lowerBound = 1;
        long upperValue = 6;
   
        while(t > upperBound)
        {
            lowerBound = upperBound;
            upperBound = (upperBound+upperValue);
            upperValue = upperBound + 2;
        }
        
   
        if(t == upperBound)
        {
            System.out.println(upperValue);
        }
        else
        {
            System.out.println(lowerBound+2 - (t-lowerBound));    
        }
        
        
    }
}
