/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.util.*;
public class Solution {
  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int count=0;
        int u=0,v=0;
        for(int i=0;i<n;i++){
        	a[i]=in.nextInt();
        if(i>0 && a[i-1]>a[i]){++count;if(u==0){u=i;}v=i;}	
        }
         if(count==1){
    	  if(n>2 && a[u-1]<a[v+1] && a[v]>a[u-2>=0?u-2:0]){System.out.println("yes\nswap "+u+" "+(v+1));}
    	  else if(n==2){System.out.println("yes\nswap "+u+" "+(v+1));}
    	  else{System.out.println("no");}  
      }
        else if(count==2){System.out.println("yes\nswap "+u+" "+(v+1));}
      else if(count>1){
    	  if(a[u-2]<a[v] && a[u-1]<a[v+1] && v-u==count-1){System.out.println("yes\nreverse "+u+" "+(v+1));}
    	  else{System.out.println("no");}
      }
      else if(count==0){System.out.println("yes");}
  }
}