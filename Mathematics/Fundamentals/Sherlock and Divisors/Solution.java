/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */
import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0){
        long n=sc.nextLong();
        int count=0;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 && i%2==0)
                count++;
            if(n%(n/i)==0 && ((n/i)!=i) && ((n/i)%2==0))
                count++;
        }
        if(n%2==0)
            count++;
        System.out.println(count);
        }
    }
}