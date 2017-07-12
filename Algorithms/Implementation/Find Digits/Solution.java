/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            String numberString = String.valueOf(input.nextInt());
            int numberInteger = Integer.parseInt(numberString);
            int evenlyDivisibleDigits = 0;
            
            for(int j = 0; j < numberString.length(); j++)
            {
                int digit = Character.getNumericValue(numberString.charAt(j));
                
                if(digit != 0 && numberInteger % digit == 0)
                {
                    evenlyDivisibleDigits++;
                }
            }
            System.out.println(evenlyDivisibleDigits);
        }
    }
}