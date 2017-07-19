/*  
 *      Developer: Jignesh Chudasama
 */

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();

		int c=0;
		for(int i=0;i<s.length()/2;++i){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				++c;
			}
		}

		if(c>k){
			System.out.println(-1);
		}

		else{
			char []a=s.toCharArray();
			int L=a.length;

			for(int i=0;i<L/2;++i){

				char chL=a[i];
				char chR=a[L-i-1];

				if(chL!=chR){
					if(chL=='9'){
						a[L-i-1]='9';
						--k;
						--c;
					}
					else if(chR=='9'){
						a[i]='9';
						--k;
						--c;
					}
					else if((k-2)>=(c-1)){
						a[i]='9';
						a[L-i-1]='9';
						k-=2;
						--c;
					}
					else{
						a[i]=(char)Math.max(chL, chR);
						a[L-i-1]=(char)Math.max(chL, chR);
						--k;
						--c;
					}
				}
				
				else if(chL==chR){
					if(chL!='9' && ((k-2)>=c)){
						a[i]='9';
						a[L-i-1]='9';
						k-=2;
					}
				}
			}
			
			if(k>=1 && n%2!=0 && a[n/2]!='9'){
				a[n/2]='9';
				--k;
			}
			
			System.out.println(new String(a));
		}
	}
}