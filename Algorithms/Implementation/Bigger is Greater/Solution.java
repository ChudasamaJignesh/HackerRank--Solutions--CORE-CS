/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < T; i++)
        {	
            String word = input.nextLine();
            if(word.length()==1) {System.out.println("no answer");continue;}
            
            
            int maxLexoC1 = 0; 
            int maxLexoC2 = 0; 

            for(int j = 1; j < word.length(); j++)
            {
                boolean condition1 = word.charAt(j) > word.charAt(j-1);
                    
                if(condition1)
                {
                    maxLexoC1 = (j > maxLexoC1) ? j : maxLexoC1;
                }
            }

            if(maxLexoC1==0) {System.out.println("no answer");continue;}
            
            for(int j = maxLexoC1; j < word.length(); j++)
            {
                boolean condition2 = word.charAt(j) > word.charAt(maxLexoC1-1);
                    
                if(condition2)
                {
                    maxLexoC2 = j;
                }
            }
            
            StringBuilder wordSB = new StringBuilder(word);

            char tmp = wordSB.charAt(maxLexoC1-1);
            wordSB.setCharAt(maxLexoC1-1, wordSB.charAt(maxLexoC2));
            wordSB.setCharAt(maxLexoC2, tmp);
                        
            int left = maxLexoC1;
            int right = wordSB.length()-1;
            while(left < right)
            {

                tmp = wordSB.charAt(left);
                wordSB.setCharAt(left, wordSB.charAt(right));
                wordSB.setCharAt(right, tmp);
                left++;
                right--;
            }
            
            
            System.out.println(wordSB);
        }
    }
}