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
        int d = input.nextInt();
        
        Set<Integer>  values = new HashSet<>();
        
        int beautifulTriplets = 0;
        
        for(int i = 0; i < n; i++)
        {
            int x = input.nextInt();
            
            if(!values.contains(x))
            {
                values.add(x);
            }
        }

        for(Integer digit : values)
        {
            if(values.contains(digit+d) && values.contains(digit+(2*d)))
            {
                beautifulTriplets++;
            }
        }
        
        System.out.println(beautifulTriplets);
    }
}