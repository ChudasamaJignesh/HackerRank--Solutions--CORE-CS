/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        
        String result = "ERROR";
        
        
        if(s.equals(t))
        {
            result = (k >= s.length()*2 || k % 2 == 0) ? "Yes" : "No";
        }
        else
        {
            int matchingCharacters = 0;
            
            for(int i = 0; i < Math.min(s.length(), t.length()); i++)
            {
                
                if(s.charAt(i) != t.charAt(i))
                {    
                    break;
                }
                matchingCharacters++;
            }
            
            int nonMatchingCharactersInS = s.length() - matchingCharacters;
            int nonMatchingCharactersInT = t.length() - matchingCharacters;
            
            
            int nmcS = nonMatchingCharactersInS;
            int nmcT = nonMatchingCharactersInT;
            
           
            boolean conditionA = nmcS + nmcT == k;
            boolean conditionB = (nmcS + nmcT < k && (nmcS + nmcT - k) % 2 == 0 );
            boolean conditionC = s.length() + t.length() <= k;
            
            result = (conditionA || conditionB || conditionC) ? "Yes" : "No";
            
        }
        
        System.out.println(result);
    }
}