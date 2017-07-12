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
        int k = input.nextInt();
        int[] bill = new int[n];
        int totalCost = 0;
        
        
        for(int i = 0; i < n; i++)
        {
            int item = input.nextInt();
            totalCost += item;
            bill[i] = item;
        }
        
        
        int charged = input.nextInt();
        if(charged == totalCost/2)
        {
            System.out.println(bill[k]/2);
            System.exit(0);
        }
        System.out.println("Bon Appetit");
        
        
        
    }
}