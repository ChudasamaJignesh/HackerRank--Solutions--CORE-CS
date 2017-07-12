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
            int P = input.nextInt();//prisoners P
            int S = input.nextInt();//sweets S
            int O = input.nextInt();//prisoner to be served O
            
            int poisonedPrisoner = (O + S - 1) % P;
            if(poisonedPrisoner == 0){poisonedPrisoner=P;}
            System.out.println(poisonedPrisoner);
        }
    }
}