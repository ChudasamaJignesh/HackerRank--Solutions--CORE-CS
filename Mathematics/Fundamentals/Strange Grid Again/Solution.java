/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long r = in.nextLong(); 
       long c = in.nextLong(); 
       long ans = (r%2==1 ? (r-1)*5+(c-1)*2:(r-2)*5+1+(c-1)*2);       
       System.out.print(ans);
    } 
}