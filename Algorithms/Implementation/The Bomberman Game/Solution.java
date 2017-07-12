/*  
 *      DeveloperName(): Jignesh Chudasama
 *      GithubName(): https://github.com/Jignesh-81726
 */

import java.io.*;
import java.util.*;

public class Solution {
    
    static Map<Integer,Map<Integer,Integer>> threeSecondBombs = new HashMap<>();
    static Map<Integer,Map<Integer,Integer>> twoSecondBombs = new HashMap<>();
    static Map<Integer,Map<Integer,Integer>> oneSecondBombs = new HashMap<>();
    static Map<Integer,Map<Integer,Integer>> damagedBombs = new HashMap<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int n = input.nextInt();
        input.nextLine(); 
        
        if(n % 2 == 0)
        {
            n = 2;
        }
        else if(n > 3) 
        {
            n = (n % 4)+4;
        }
        
        char[][] grid = new char[row][col];
        
        for(int i = 0; i < row; i++)
        {
            String readRow  = input.nextLine();
            for(int j = 0; j < col; j++)
            {
                if(readRow.charAt(j) == 'O')
                {
                    if(threeSecondBombs.get(i) == null)
                    {
                        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
                        threeSecondBombs.put(i, map);  
                        threeSecondBombs.get(i).put(j,0);
                    }
                    else
                    {
                        threeSecondBombs.get(i).put(j,0);
                    }
                }
                    
                    
                    
                grid[i][j] = readRow.charAt(j);
            }
        }
        
        
        int cycle = 2;
        if(cycle <= n)
        {           
            plantBombs(twoSecondBombs, grid);
            cycle++;
        }        
        
        if(cycle <= n)
        {   
            detonateBombs(threeSecondBombs, grid);
            threeSecondBombs = new HashMap<>();
            cycle++;
        }
        
        boolean one = false;
        boolean two = true;
        boolean three = false;
        
        while(cycle <= n)
        {
            if(cycle % 3 == 1)
            {
                if(!one)
                {
                    plantBombs(oneSecondBombs, grid);
                    one = !one;
                }
                else
                {
                    detonateBombs(oneSecondBombs, grid);
                    one = !one;
                }
            }
            else if(cycle % 3 == 2)
            {
                if(!two)
                {
                    plantBombs(twoSecondBombs, grid);
                    two = !two;
                    }
                else
                {
                    detonateBombs(twoSecondBombs, grid);
                    two = !two;

                }
            }
            else if(cycle % 3 == 0)
            {
                if(!three)
                {
                    plantBombs(threeSecondBombs, grid);
                    three = !three;
                }
                else
                {
                    detonateBombs(threeSecondBombs, grid);
                    three = !three;             
                }
            }
            cycle++;
        }    

        printGrid(grid);
    }
    
    static void plantBombs(Map<Integer,Map<Integer,Integer>> bombSet, char[][] grid)
    {
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == '.')
                {
                    if(bombSet.get(i) == null)
                    {
                        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
                        bombSet.put(i, map);  
                        bombSet.get(i).put(j,0);
                    }
                    else
                    {
                        bombSet.get(i).put(j,0);
                    }
                    grid[i][j] = 'O';
                }
            }
        }
    }
    
    static void detonateBombs(Map<Integer,Map<Integer,Integer>> bombSet, char[][] grid)
    {
        
        for(Map.Entry<Integer, Map<Integer,Integer>> x : bombSet.entrySet())
        {
            int px = x.getKey();
            for(Map.Entry<Integer,Integer> y : x.getValue().entrySet())
            {
                removeDamage(px,y.getKey(),grid);
            }
        }

        for(Map.Entry<Integer, Map<Integer,Integer>> x : damagedBombs.entrySet())
        {
            int px = x.getKey();
            for(Map.Entry<Integer,Integer> y : x.getValue().entrySet())
            {
                if(threeSecondBombs.get(px) != null)
                {
                    threeSecondBombs.get(px).remove(y.getKey());
                }
                if(twoSecondBombs.get(px) != null)
                {
                    twoSecondBombs.get(px).remove(y.getKey());
                }
                if(oneSecondBombs.get(px) != null)
                {
                    oneSecondBombs.get(px).remove(y.getKey());
                }
            }
        }
        damagedBombs = new HashMap<>();
    }
    
    static void removeDamage(int x, int y, char[][] grid)
    {
        grid[x][y] = '.';
        removeBomb(x, y);
        
        if(y-1 >= 0)
        {
            grid[x][y-1] = '.';
            removeBomb(x, y-1);
        }

        if(y+1 < grid[0].length)
        {
            grid[x][y+1] = '.';
            removeBomb(x, y+1);
        }

        if(x-1 >= 0)
        {
            grid[x-1][y] = '.';
            removeBomb(x-1, y);
        }

        if(x+1 < grid.length)
        {
            grid[x+1][y] = '.';
            removeBomb(x+1, y);
        }
    }

    static void removeBomb(int x, int y)
    {
        if(damagedBombs.get(x) == null)
        {
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();
            damagedBombs.put(x, map);  
            damagedBombs.get(x).put(y,0);
        }
        else
        {
            damagedBombs.get(x).put(y,0);
        }
    }
    
    static void printBombSet(Map<Integer,Map<Integer,Integer>> bombSet)
    {
        for(Map.Entry<Integer, Map<Integer,Integer>> x : bombSet.entrySet())
        {
            int px = x.getKey();
            for(Map.Entry<Integer,Integer> y : x.getValue().entrySet())
            {
                System.out.println("("+px+","+y.getKey()+")");
            }
        }
    }
    
    static void printGrid(char[][] grid)
    {
        for(char[] l : grid)
        {
            for(char m : l)
            {
                System.out.print(m);
            }
            System.out.println("");
        }

    }
}