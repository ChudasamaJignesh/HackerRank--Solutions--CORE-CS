/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();
            
            int ate = 0;
            
            int chocolates = n / c;
            
            ate += chocolates;

            while(chocolates >= m)
            {
                ate += chocolates / m;
                chocolates = (chocolates / m) + (chocolates % m);
            }
            System.out.println(ate);
        }
    }
}