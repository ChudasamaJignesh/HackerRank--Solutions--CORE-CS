/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Solution {
	static int lowestTriangle(int base, int area){
  	
  	double height;
	height = (2.0* (double)area)/(double)base;
    return (int) Math.ceil(height);

}      

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int area = in.nextInt();
    int height = lowestTriangle(base, area);
    System.out.println(height);
}
}