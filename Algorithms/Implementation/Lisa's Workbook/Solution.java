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
        int pageNumber = 1;
        int specialProblems = 0;
        
        for(int i = 0; i < n; i++)
        {
            int problems = input.nextInt(); 
            int currentProblem = 1; 
            
            while(problems > 0) 
            {
                int pageProblems = problems;
                pageProblems -= k;
                
                if(pageProblems > 0) 
                {pageProblems = k;}
                else                
                {pageProblems += k;}
                
                                
                while(pageProblems > 0)   
                {
                 
                    if(pageNumber == currentProblem)  
                    {                                
                        specialProblems++;
                    }
                    currentProblem++; 
                    pageProblems--;
                }
                
                problems -= k; 
                pageNumber++; 
            }
        }
        System.out.println(specialProblems);
        
    }
}