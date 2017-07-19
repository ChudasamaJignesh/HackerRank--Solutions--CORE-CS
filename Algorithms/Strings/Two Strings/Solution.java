
/*  
 *      Developer: Jignesh Chudasama
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        int pairs = input.nextInt(); input.nextLine();
        
        tests:
        for(int t = 0; t < pairs; t++)
        {
            String a = input.nextLine();
            String b = input.nextLine();
            
            Set<Character> aLetterSet = new HashSet<>();
            Set<Character> bLetterSet = new HashSet<>();
            
            for(int i = 0; i < a.length(); i++)
                aLetterSet.add(a.charAt(i));
            
            for(int i = 0; i < b.length(); i++)
                bLetterSet.add(b.charAt(i));
            aLetterSet.retainAll(bLetterSet);
                
            if(aLetterSet.size() > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}