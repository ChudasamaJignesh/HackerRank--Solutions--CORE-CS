/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int returnDay = input.nextInt();
        int returnMonth = input.nextInt();
        int returnYear = input.nextInt();
        
        int expectedDay = input.nextInt();
        int expectedMonth = input.nextInt();
        int expectedYear = input.nextInt();
        
        int hackosFine = 0;
        

        
        if(expectedYear < returnYear)
        {
            hackosFine = 10000;
        }
        else if(expectedYear == returnYear )
        {
            if(expectedMonth < returnMonth)
            {
                hackosFine = (returnMonth-expectedMonth) * 500;
            }
            else if(expectedMonth == returnMonth)
            {
                if(expectedDay < returnDay)
                {
                    hackosFine = (returnDay - expectedDay) * 15;
                }
            } 
        }
        
        System.out.println(hackosFine);
    }
}