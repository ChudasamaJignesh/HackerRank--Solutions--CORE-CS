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
            int n = input.nextInt()-1;//Minus 1 to account for 0 starting stone
            int a = input.nextInt();
            int b = input.nextInt();
            
            if(a == b)
            {
                System.out.println(a*n + " ");
                continue;
            }
            
            int tmp = a;
            a = Math.min(a,b);
            b = (a == b) ? tmp : b;
            
            int min = a*n;
            int max = b*n;
            
            for(int finalSteps = min; finalSteps <= max; finalSteps += (b-a))
            {
                System.out.print(finalSteps + " ");
            }
            
            System.out.println();
            
        }
    }
}